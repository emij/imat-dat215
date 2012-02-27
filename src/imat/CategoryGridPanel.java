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

/**
 *
 * @author lisastenberg
 */
public class CategoryGridPanel extends Observable implements ActionListener{
    private JButton[] buttonArr;
    private GridPanel g; 
    
    public CategoryGridPanel(Observer o) {
        this.addObserver(o);
        g = new GridPanel(11);
        buttonArr = g.getButtonArr();
        
        setButtonImages();
        /*
        String imageName;
        ImageIcon icon;
        Image img;
        for(int i = 0; i < 12; i++) {
            imageName = "/imat/resources/kategoribilder/cat_" + i + ".png";
            icon = new ImageIcon(getClass().getResource(imageName));
            img = icon.getImage();        
            buttonArr[i].setIcon(new ImageIcon(img.getScaledInstance(160, 130, 0)));
        }*/
        
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

        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers("card2");
        } else if(ae.getSource() == buttonArr[2]) {
            
        } else if(ae.getSource() == buttonArr[3]) {
            this.notifyObservers("card3");
        } else if(ae.getSource() == buttonArr[4]) {
            
        } else if(ae.getSource() == buttonArr[5]) {
            
        } else if(ae.getSource() == buttonArr[6]) {
            
        } else if(ae.getSource() == buttonArr[7]) {
            
        } else if(ae.getSource() == buttonArr[8]) {
            
        } else if(ae.getSource() == buttonArr[9]) {
            
        } else if(ae.getSource() == buttonArr[10]) {
            
        } else if(ae.getSource() == buttonArr[11]) {
            
        } else if(ae.getSource() == buttonArr[12]) {
            
        }
    }


    
    
    
}
