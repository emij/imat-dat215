/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 * @author lisastenberg
 */
public class SearchObserver extends Observable implements ActionListener, FocusListener {
    private SearchPanel p;
    
    public SearchObserver(Observer o) {
        this.addObserver(o);
        p = new SearchPanel();
        p.getSearchButton().addActionListener(this);
        p.getSearchField().addActionListener(this);
        p.getSearchField().addFocusListener(this);
    }
    
    public JPanel getPanel() {
        return p;
    }
    
    public void actionPerformed(ActionEvent ae) {
        setChanged();
        if(ae.getSource().equals(p.getSearchButton()) || ae.getSource().equals(p.getSearchField())) {
            this.notifyObservers(new Category(p.getSearch(), Category.PANELTYPE.SEARCH));
        }
    }

    public void focusGained(FocusEvent fe) {
        //throw new UnsupportedOperationException("Not supported yet.");
        p.getSearchField().selectAll();
    }

    public void focusLost(FocusEvent fe) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(p.getSearch().isEmpty()){
            p.getSearchField().setText("\"t.ex tomater\"");
        }
    }
    
}
