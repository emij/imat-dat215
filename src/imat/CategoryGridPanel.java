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
 * @author lisastenberg & ollewerme
 */
public class CategoryGridPanel extends Observable implements ActionListener{
    private JButton[] buttonArr;
    private GridPanel g; 
    
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
            this.notifyObservers("bread");
        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers("kvitto");
        } else if(ae.getSource() == buttonArr[2]) {
            this.notifyObservers("fish");
        } else if(ae.getSource() == buttonArr[3]) {
            this.notifyObservers("fr");
        } else if(ae.getSource() == buttonArr[4]) {
            this.notifyObservers("meat");
        } else if(ae.getSource() == buttonArr[5]) {
            this.notifyObservers("dairies");
        } else if(ae.getSource() == buttonArr[6]) {
            this.notifyObservers("flour_sugar_salt");
        } else if(ae.getSource() == buttonArr[7]) {
            this.notifyObservers("nuts_and_seeds");
        } else if(ae.getSource() == buttonArr[8]) {
            this.notifyObservers("pasta");
        } else if(ae.getSource() == buttonArr[9]) {
            this.notifyObservers("potato_rice");
        } else if(ae.getSource() == buttonArr[10]) {
            this.notifyObservers("sweet");
        } else if(ae.getSource() == buttonArr[11]) {
            this.notifyObservers("favorites");
        } 
    }


    
    
    
}
