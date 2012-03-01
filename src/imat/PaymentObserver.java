/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author lisastenberg
 */
public class PaymentObserver extends Observable implements ActionListener {
    PaymentPanel p;
    IMatDataHandler data = IMatDataHandler.getInstance();
    Order order;
    public PaymentObserver(Observer o) {
        p = new PaymentPanel();
        this.addObserver(o);
        p.getDoneButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(p.getDoneButton())) {
            if(p.getVisaButton().isSelected()) {
                p.setInfoOk(p.getV().setInfo());
            } else if(p.getFakturaButton().isSelected()) {
                p.setInfoOk(p.getF().setInfo());
            } else if(p.getKontantButton().isSelected()) {
                p.setInfoOk(true);
            }
            
            if(p.getInfoOk()) {
                setChanged();
                order = data.placeOrder();
                this.notifyObservers("kvitto");
            }
        }
    }
    
    public JPanel getPanel() {
        return p;
    }
    public Order getThisOrder(){
        return order;
    }
}
