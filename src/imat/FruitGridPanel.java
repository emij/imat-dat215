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
 * @author lisastenberg
 */
public class FruitGridPanel extends Observable implements ActionListener {
    private JButton[] buttonArr;
    private GridPanel g;
    
    public FruitGridPanel(Observer o) {
        g = new GridPanel(10);
        buttonArr = g.getButtonArr();
        this.addObserver(o);
        
        /* Set all buttonImages
         * 
         * setButtonImage(buttonArr[0], image));
         * setButtonImage(buttonArr[1], image));
         * setButtonImage(buttonArr[2], image));
         * setButtonImage(buttonArr[3], image));
         * setButtonImage(buttonArr[4], image));
         * setButtonImage(buttonArr[5], image));
         * setButtonImage(buttonArr[6], image));
         * setButtonImage(buttonArr[7], image));
         * setButtonImage(buttonArr[8], image));
         * setButtonImage(buttonArr[9], image));
         * setButtonImage(buttonArr[10], image));
         */
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < 10; i++) {
        buttonArr[i].addActionListener(this);
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
            
        } else if(ae.getSource() == buttonArr[2]) {
            
        } else if(ae.getSource() == buttonArr[3]) {
            
        } else if(ae.getSource() == buttonArr[4]) {
            
        } else if(ae.getSource() == buttonArr[5]) {
            
        } else if(ae.getSource() == buttonArr[6]) {
            
        } else if(ae.getSource() == buttonArr[7]) {
            
        } else if(ae.getSource() == buttonArr[8]) {
            
        } else if(ae.getSource() == buttonArr[9]) {
            
        } else if(ae.getSource() == buttonArr[10]) {
            
        }    
    }
}
