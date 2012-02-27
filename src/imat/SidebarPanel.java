/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 * @author ollewerme
 */
public class SidebarPanel extends Observable implements ActionListener{
    
    private CategoryPanel c;
    public SidebarPanel(Observer o) {
        this.addObserver(o);
        c = new CategoryPanel();
    }

    public JPanel getPanel(){
        return c;
    }
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
