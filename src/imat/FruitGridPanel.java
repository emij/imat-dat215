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
public class FruitGridPanel extends Observable implements ActionListener {
    private JButton[] buttonArr;
    private GridPanel g;
    private JButton favoritesButton;
    
    public FruitGridPanel(Observer o) {
        this.addObserver(o);
        g = new GridPanel(10);
        buttonArr = g.getButtonArr();        
        favoritesButton = g.getFavoritesButton();
        favoritesButton.addActionListener(this);
        
        setButtonImages();
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < buttonArr.length; i++) {
            buttonArr[i].addActionListener(this);
        }
    }
    private void setButtonImages(){
        String path = "resources/kategoribilder/gronsaker_och_frukter/";
        
        for(int i=0; i<buttonArr.length; i++){
            buttonArr[i].setIcon(new ImageIcon(getClass().getResource(path + "gronsakcat_" + i + ".png")));
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
            this.notifyObservers(new Category(ProductCategory.POD));
        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers(new Category(ProductCategory.BERRY));            
        } else if(ae.getSource() == buttonArr[2]) {
            this.notifyObservers(new Category(ProductCategory.CITRUS_FRUIT));
        } else if(ae.getSource() == buttonArr[3]) {
            this.notifyObservers(new Category(ProductCategory.EXOTIC_FRUIT));
        } else if(ae.getSource() == buttonArr[4]) {
            this.notifyObservers(new Category(ProductCategory.VEGETABLE_FRUIT));
        } else if(ae.getSource() == buttonArr[5]) {
            this.notifyObservers(new Category(ProductCategory.CABBAGE));
        } else if(ae.getSource() == buttonArr[6]) {
            this.notifyObservers(new Category(ProductCategory.MELONS));
        } else if(ae.getSource() == buttonArr[7]) {
            this.notifyObservers(new Category(ProductCategory.HERB));
        } else if(ae.getSource() == buttonArr[8]) {
            this.notifyObservers(new Category(ProductCategory.ROOT_VEGETABLE));
        } else if(ae.getSource() == buttonArr[9]) {
            this.notifyObservers(new Category(ProductCategory.VEGETABLE_FRUIT));
        } else if(ae.getSource() == favoritesButton) {
            this.notifyObservers(new Category("Favoriter", Category.PANELTYPE.FAVORITES));
        }    
    }
}
