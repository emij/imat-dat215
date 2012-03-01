/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author lisastenberg & ollewerme
 */
public class DrinksGridPanel extends Observable implements ActionListener {
    private GridPanel g;
    private JButton[] buttonArr;
    private JButton favoritesButton;
    
    public DrinksGridPanel(Observer o) {
        g = new GridPanel(2);
        buttonArr = g.getButtonArr();
        this.addObserver(o);
        favoritesButton = g.getFavoritesButton();
        favoritesButton.addActionListener(this);
        
        setButtonImages();
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < buttonArr.length; i++) {
            buttonArr[i].addActionListener(this);
        }
    }
    private void setButtonImages(){
        String path = "resources/kategoribilder/drycker/";
        
        for(int i=0; i<buttonArr.length; i++){
            buttonArr[i].setIcon(new ImageIcon(getClass().getResource(path + "drinkcat_" + i + ".png")));
            buttonArr[i].setBorder(null);
        }
    }
    
    public JButton[] getButtons(){
        return buttonArr;
    }
    
    public JPanel getPanel() {
        return g;
    }

    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource() == buttonArr[0]) {
            this.notifyObservers(new Category(ProductCategory.COLD_DRINKS));
        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers(new Category(ProductCategory.HOT_DRINKS));
            //this.notifyObservers("The card you want to show");
        } else if(ae.getSource() == favoritesButton) {
            this.notifyObservers(new Category("Favoriter", Category.PANELTYPE.FAVORITES));
        } 
    }
}
