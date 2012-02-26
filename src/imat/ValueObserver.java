/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class ValueObserver extends Observable implements MouseListener {
    private ValuePanel p;
    private Color foreground;
    
    public ValueObserver(Observer o) {
        p = new ValuePanel();
        this.addObserver(o);
        
        foreground = p.getLabel1().getForeground();
        p.getLabel1().addMouseListener(this);
        p.getLabel2().addMouseListener(this);
        
    }
    
    public JPanel getPanel() {
        return p;
    }

    public void mouseClicked(MouseEvent me) {
        setChanged();
        if(me.getSource() == p.getLabel1() || me.getSource() == p.getLabel2()) {
            this.notifyObservers("kundvagn");
        }
    }

    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == p.getLabel1()) {
            p.getLabel1().setForeground(Color.WHITE);
        } else if(me.getSource() == p.getLabel2()) {
            p.getLabel2().setForeground(Color.WHITE);
        }
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource() == p.getLabel1()) {
            p.getLabel1().setForeground(foreground);
        } else if(me.getSource() == p.getLabel2()) {
            p.getLabel2().setForeground(foreground);
        }
    }
    
}
