/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class DrinksGridPanel extends GridPanel implements ActionListener {
    private JButton[] buttonArr;
    
    public DrinksGridPanel() {
        super(2);
        buttonArr = getButtonArr();
        
        /* Set all buttonImages
         * 
         * setButtonImage(buttonArr[0], coldDrinks_image));
         * setButtonImage(buttonArr[1], hotDrinks_image));
         */
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < 2; i++) {
            buttonArr[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        //CardLayout cl = (CardLayout)(jPanel2.getLayout());
        if(ae.getSource() == buttonArr[0]) {
            //Show Cold drinks
        } else if(ae.getSource() == buttonArr[1]) {
            //Show Hot drinks
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
