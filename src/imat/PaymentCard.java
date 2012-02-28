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
public class PaymentCard extends Observable implements ActionListener {
    private PaymentPanel p;
    
    public PaymentCard(Observer o) {
        this.addObserver(o);
        p = new PaymentPanel();
    }
    
    public JPanel getPanel() {
        return p;
    }
    
    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource().equals(p.getDoneButton())) {
            this.notifyObservers("kvitto");
        }
    }
    
}
