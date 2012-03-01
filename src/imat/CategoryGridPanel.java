/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;


import java.io.File;
import java.util.Observable;
import java.util.Observer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author lisastenberg & ollewerme
 */
public class CategoryGridPanel extends Observable implements ActionListener{
    private JButton[] buttonArr;
    private GridPanel g; 
    private JButton favoritesButton;
    
    public CategoryGridPanel(Observer o) {
        this.addObserver(o);
        g = new GridPanel(11);
        buttonArr = g.getButtonArr();
        
        setButtonImages();
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < buttonArr.length; i++) {
            buttonArr[i].addActionListener(this);
        }
    }
    private void setButtonImages(){
        String path = "resources/kategoribilder/";
        
        for(int i=0; i<buttonArr.length; i++){
            buttonArr[i].setIcon(new ImageIcon(getClass().getResource(path + "cat_" + i + ".png")));
            buttonArr[i].setBorder(null);
        }
        
        favoritesButton = g.getFavoritesButton();
        favoritesButton.addActionListener(this);
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
            this.notifyObservers(new Category(ProductCategory.BREAD));
        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers("drinks");
        } else if(ae.getSource() == buttonArr[2]) {
            this.notifyObservers(new Category(ProductCategory.FISH));
        } else if(ae.getSource() == buttonArr[3]) {
            this.notifyObservers("fr");
        } else if(ae.getSource() == buttonArr[4]) {
            this.notifyObservers(new Category(ProductCategory.MEAT));
        } else if(ae.getSource() == buttonArr[5]) {
            this.notifyObservers(new Category(ProductCategory.DAIRIES));
        } else if(ae.getSource() == buttonArr[6]) {
            this.notifyObservers(new Category(ProductCategory.FLOUR_SUGAR_SALT));
        } else if(ae.getSource() == buttonArr[7]) {
            this.notifyObservers(new Category(ProductCategory.NUTS_AND_SEEDS));
        } else if(ae.getSource() == buttonArr[8]) {
            this.notifyObservers(new Category(ProductCategory.PASTA));
        } else if(ae.getSource() == buttonArr[9]) {
            this.notifyObservers(new Category(ProductCategory.POTATO_RICE));
        } else if(ae.getSource() == buttonArr[10]) {
            this.notifyObservers(new Category(ProductCategory.SWEET));
        } else if(ae.getSource() == favoritesButton) {
            this.notifyObservers(new Category("Favoriter", Category.PANELTYPE.FAVORITES));
        } 
    }


    
    
    
}
