/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class CategoryGridPanel extends GridPanel implements ActionListener {
    private JButton[] buttonArr;
    
    public CategoryGridPanel() {
        super(12);
        buttonArr = getButtonArr();
        
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
         * setButtonImage(buttonArr[11], image));
         * setButtonImage(buttonArr[12], image));
         */
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < 12; i++) {
            buttonArr[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == buttonArr[0]) {
            //IMatView.changePanel(breadPanel);
        } else if(ae.getSource() == buttonArr[1]) {
            //changePanel("hej");
        } else if(ae.getSource() == buttonArr[2]) {
            
        } else if(ae.getSource() == buttonArr[3]) {
            
        } else if(ae.getSource() == buttonArr[4]) {
            
        } else if(ae.getSource() == buttonArr[5]) {
            
        } else if(ae.getSource() == buttonArr[6]) {
            
        } else if(ae.getSource() == buttonArr[7]) {
            
        } else if(ae.getSource() == buttonArr[8]) {
            
        } else if(ae.getSource() == buttonArr[9]) {
            
        } else if(ae.getSource() == buttonArr[10]) {
            
        } else if(ae.getSource() == buttonArr[11]) {
            
        } else if(ae.getSource() == buttonArr[12]) {
            //Show favourites
        }
    }
    
    
    
}
