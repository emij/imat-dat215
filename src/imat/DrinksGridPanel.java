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
public class DrinksGridPanel extends Observable implements ActionListener {
    private GridPanel g;
    private JButton[] buttonArr;
    
    public DrinksGridPanel(Observer o) {
        g = new GridPanel(2);
        buttonArr = g.getButtonArr();
        this.addObserver(o);

        
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

    public JButton[] getButtons(){
        return buttonArr;
    }
    
    public JPanel getPanel() {
        return g;
    }

    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource() == buttonArr[0]) {
            //this.notifyObservers("The card you want to show");
        } else if(ae.getSource() == buttonArr[1]) {
            //this.notifyObservers("The card you want to show");
        }
    }
}
