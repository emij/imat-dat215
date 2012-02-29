/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg & ollewerme
 */
public class FruitGridPanel extends Observable implements ActionListener {
    private JButton[] buttonArr;
    private GridPanel g;
    
    public FruitGridPanel(Observer o) {
        this.addObserver(o);
        g = new GridPanel(10);
        buttonArr = g.getButtonArr();        
        
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
            this.notifyObservers("pod");
        } else if(ae.getSource() == buttonArr[1]) {
            this.notifyObservers("berry");            
        } else if(ae.getSource() == buttonArr[2]) {
            this.notifyObservers("citrus_fruit");            
        } else if(ae.getSource() == buttonArr[3]) {
            this.notifyObservers("exotic_fruit");
        } else if(ae.getSource() == buttonArr[4]) {
            this.notifyObservers("vegetable_fruit");
        } else if(ae.getSource() == buttonArr[5]) {
            this.notifyObservers("cabbage");
        } else if(ae.getSource() == buttonArr[6]) {
            this.notifyObservers("melons");
        } else if(ae.getSource() == buttonArr[7]) {
            this.notifyObservers("herb");
        } else if(ae.getSource() == buttonArr[8]) {
            this.notifyObservers("root_vegetable");
        } else if(ae.getSource() == buttonArr[9]) {
            this.notifyObservers("nuts_and_seeds");
        }    
    }
}
