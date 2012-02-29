/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JPanel;

/**
 *
 * @author lisastenberg
 */
public class PaymentObserver extends Observable implements ActionListener {
    PaymentPanel p;
    
    public PaymentObserver(Observer o) {
        p = new PaymentPanel();
        this.addObserver(o);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(p.getDoneButton())) {
            if(p.infoOk()) {
                this.notifyObservers("kvitto");
            }
        }
    }
    
    public JPanel getPanel() {
        return p;
    }
    
}