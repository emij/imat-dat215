/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.Color;
import java.util.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author ollewerme
 */
public class SidebarPanel extends Observable implements MouseListener{
    
    IMatDataHandler dh;
    private CategoryPanel c;
    private JLabel[] labels;
    private JLabel[] tools;
    private Color foreground;
    private final Color mainBackground = new Color(152, 204, 204);
    private HelpFrame h;
    
    public SidebarPanel(Observer o) {
        h = new HelpFrame();
        h.setVisible(false);
        
        this.addObserver(o);
        c = new CategoryPanel();
        dh = IMatDataHandler.getInstance();
        
        labels = c.getLabels();
        tools = c.getTools();
        
        for(JLabel l : labels) {
            l.addMouseListener(this);
        }
        for(JLabel l: tools) {
            l.addMouseListener(this);
        }
         
        c.getHeader().addMouseListener(this);
        foreground = labels[0].getForeground();
        c.getHelpButton().addMouseListener(this);
    }

    public JPanel getPanel(){
        return c;
    }

    public void mouseClicked(MouseEvent me) {
        setChanged();
        List<Product> l;
        if(me.getSource() == labels[0]) {
            this.notifyObservers("bread");
        } else if(me.getSource() == labels[1]) {
            this.notifyObservers("drinks");
        } else if(me.getSource() == labels[2]) {
            this.notifyObservers("fish");
        } else if(me.getSource() == labels[3]) {
            this.notifyObservers("fr");
        } else if(me.getSource() == labels[4]) {
            this.notifyObservers("meat");
        } else if(me.getSource() == labels[5]) {
            this.notifyObservers("dairies");
        } else if(me.getSource() == labels[6]) {
            this.notifyObservers("flour_sugar_salt");
        } else if(me.getSource() == labels[7]) {
            this.notifyObservers("nuts_and_seeds");
        } else if(me.getSource() == labels[8]) {
            this.notifyObservers("pasta");
        } else if(me.getSource() == labels[9]) {
            this.notifyObservers("potato_rice");
        } else if(me.getSource() == labels[10]) {
            this.notifyObservers("sweet");
        } else if(me.getSource() == tools[0]) {
            l = dh.getProducts();
            Comparator<Product> a = new Comparator<Product>() {
                public int compare(Product t, Product t1) {
                    String s = t.getName();
                    String s2 = t1.getName();
                    return s.compareTo(s2);
                }
            };
            Collections.sort(l, a);
            //Anropa CategoryCard med l;
        } else if(me.getSource() == tools[1]) {
            l = dh.favorites();
            //Anropa CategoryCard med l;
        } else if(me.getSource() == tools[2]) {
            List<Order> orderList = dh.getOrders();
            //Anropa CategoryCard med orderList
        } else if(me.getSource().equals(c.getHeader())) {
            this.notifyObservers("category");
        } else if(me.getSource().equals(c.getHelpButton())) {
            h.setVisible(true);
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
