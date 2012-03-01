/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class ShoppingCartObservable extends Observable implements ActionListener {
    private ShoppingCartList2 p;
    
    public ShoppingCartObservable(Observer o) {
        this.addObserver(o);
        p = new ShoppingCartList2();
        p.getNextButton().addActionListener(this);
    }
    
    public JPanel getPanel() {
        return p;
    }
    
    public ShoppingCartList2 getSCList() {
        return p;
    }

    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource().equals(p.getNextButton())) {
            this.notifyObservers("adress");
        }
    }
    
}
