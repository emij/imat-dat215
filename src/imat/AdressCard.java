/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.*;
import javax.swing.JPanel;

/**
 *
 * @author lisastenberg
 */
public class AdressCard extends Observable implements ActionListener {
    private AdressPanel ap;
    
    public AdressCard(Observer o) {
        this.addObserver(o);
        ap = new AdressPanel();
        ap.setMaximumSize(new Dimension(623, 409));
        ap.getDoneButton().addActionListener(this);
    }
    
    

    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource().equals(ap.getDoneButton()) && ap.noErrors()) {
            this.notifyObservers("betala");
        }
    }

    public JPanel getPanel() {
        return ap;
    }
    
}
