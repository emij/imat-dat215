/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author ollewerme
 */
public class SidebarPanel extends Observable implements MouseListener{
    
    private CategoryPanel c;
    private JLabel[] labels;
    private JLabel[] tools;
    private Color foreground;
    private final Color mainBackground = new Color(152, 204, 204);
    
    public SidebarPanel(Observer o) {
        this.addObserver(o);
        c = new CategoryPanel();
        
        labels = c.getLabels();
        tools = c.getTools();
        
        for(JLabel l : labels) {
            l.addMouseListener(this);
        }
        for(JLabel l: tools) {
            l.addMouseListener(this);
        }
         
        foreground = labels[0].getForeground();
    }

    public JPanel getPanel(){
        return c;
    }

    public void mouseClicked(MouseEvent me) {
        setChanged();
        if(me.getSource() == labels[0]) {
            //this.notifyObserver("bread");
        } else if(me.getSource() == labels[1]) {
            this.notifyObservers("drinks");
        } else if(me.getSource() == labels[2]) {
            //this.notifyObservers("fisk");
        } else if(me.getSource() == labels[3]) {
            this.notifyObservers("fruit");
        } else if(me.getSource() == labels[4]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[5]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[6]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[7]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[8]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[9]) {
            //this.notifyObservers("");
        } else if(me.getSource() == labels[10]) {
            //this.notifyObservers("");
        } else if(me.getSource() == tools[0]) {
            //this.notifyObservers("");
        } else if(me.getSource() == tools[1]) {
            //this.notifyObservers("");
        } else if(me.getSource() == tools[2]) {
            //this.notifyObservers("");
        }
    }

    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == labels[0]) {
            labels[0].setForeground(mainBackground);
        } else if(me.getSource() == labels[1]) {
            labels[1].setForeground(mainBackground);
        } else if(me.getSource() == labels[2]) {
            labels[2].setForeground(mainBackground);
        } else if(me.getSource() == labels[3]) {
            labels[3].setForeground(mainBackground);
        } else if(me.getSource() == labels[4]) {
            labels[4].setForeground(mainBackground);
        } else if(me.getSource() == labels[5]) {
            labels[5].setForeground(mainBackground);
        } else if(me.getSource() == labels[6]) {
            labels[6].setForeground(mainBackground);
        } else if(me.getSource() == labels[7]) {
            labels[7].setForeground(mainBackground);
        } else if(me.getSource() == labels[8]) {
            labels[8].setForeground(mainBackground);
        } else if(me.getSource() == labels[9]) {
            labels[9].setForeground(mainBackground);
        } else if(me.getSource() == labels[10]) {
            labels[10].setForeground(mainBackground);
        } else if(me.getSource() == tools[0]) {
            tools[0].setForeground(mainBackground);
        } else if(me.getSource() == tools[1]) {
            tools[1].setForeground(mainBackground);
        } else if(me.getSource() == tools[2]) {
            tools[2].setForeground(mainBackground);
        }
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource() == labels[0]) {
            labels[0].setForeground(foreground);
        } else if(me.getSource() == labels[1]) {
            labels[1].setForeground(foreground);
        } else if(me.getSource() == labels[2]) {
            labels[2].setForeground(foreground);
        } else if(me.getSource() == labels[3]) {
            labels[3].setForeground(foreground);
        } else if(me.getSource() == labels[4]) {
            labels[4].setForeground(foreground);
        } else if(me.getSource() == labels[5]) {
            labels[5].setForeground(foreground);
        } else if(me.getSource() == labels[6]) {
            labels[6].setForeground(foreground);
        } else if(me.getSource() == labels[7]) {
            labels[7].setForeground(foreground);
        } else if(me.getSource() == labels[8]) {
            labels[8].setForeground(foreground);
        } else if(me.getSource() == labels[9]) {
            labels[9].setForeground(foreground);
        } else if(me.getSource() == labels[10]) {
            labels[10].setForeground(foreground);
        } else if(me.getSource() == tools[0]) {
            tools[0].setForeground(foreground);
        } else if(me.getSource() == tools[1]) {
            tools[1].setForeground(foreground);
        } else if(me.getSource() == tools[2]) {
            tools[2].setForeground(foreground);
        }
    }

    
}
