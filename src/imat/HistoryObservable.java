/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author lisastenberg
 */
public class HistoryObservable extends Observable implements ActionListener {
    private HistoryPanel p;
    List<JButton> buttons;
    IMatDataHandler dh = IMatDataHandler.getInstance();
    
    public HistoryObservable(Observer o) {
        this.addObserver(o);
        p = new HistoryPanel();
        buttons = p.getButtons();
    }
    
    public JPanel getPanel() {
        return p;
    }
    
    public void actionPerformed(ActionEvent ae) {
        setChanged();
        String orderName;
        for(int i = 0; i < buttons.size(); i++) {
            if(ae.getSource().equals(buttons.get(i))) {
                orderName = "" + dh.getOrders().get(i).getOrderNumber();
                this.notifyObservers(new Category(orderName, Category.PANELTYPE.ORDER));
            }
        }
    }
    
}
