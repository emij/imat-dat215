/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ollewerme
 */
public class CategoryPanel extends JPanel {
    
    private JPanel northContainer;
    private JPanel southContainer;
    
    private JPanel categoryMenu;
    private JPanel toolsMenu;
    
    private JLabel header;
    private JLabel labels[] = new JLabel[11];
    private JLabel tools[] = new JLabel[3];
    private JLabel helpButton;

   
    public CategoryPanel(){
        northContainer = new JPanel(new BorderLayout());
        southContainer = new JPanel();
        
        header = new JLabel("Kategorier");
        header.setForeground(Color.BLACK);
        header.setFont(new Font("Helvetica", Font.BOLD, 24));
            
        categoryMenu = new JPanel(new GridLayout(11, 1, 3, 3));
        toolsMenu = new JPanel(new GridLayout(3, 1, 3, 3));
        helpButton = new JLabel("KNAPP");
        
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(12,20,12,12));
        setBackground(new Color(252, 251, 237));
        //setPreferredSize(new Dimension(220,300));
              
        northContainer.setPreferredSize(new Dimension(220,340));
        northContainer.setBackground(new Color(252, 251, 237));
        southContainer.setBackground(new Color(252, 251, 237));
        categoryMenu.setBorder(new EmptyBorder(12,0,12,12));
        categoryMenu.setBackground(new Color(252, 251, 237));
        toolsMenu.setBackground(new Color(252, 251, 237));
        
        add(northContainer, BorderLayout.NORTH);
        add(southContainer, BorderLayout.SOUTH);
        
        northContainer.add(header, BorderLayout.NORTH);
        northContainer.add(categoryMenu, BorderLayout.CENTER);
        northContainer.add(toolsMenu, BorderLayout.SOUTH); 
        southContainer.add(helpButton);
        
        labels[0] = new JLabel("・Bröd");
        labels[1] = new JLabel("・Drycker");
        labels[2] = new JLabel("・Fisk");
        labels[3] = new JLabel("・Frukt & grönt");
        labels[4] = new JLabel("・Kött");
        labels[5] = new JLabel("・Mejeriprodukter");
        labels[6] = new JLabel("・Mjöl, socker, salt");
        labels[7] = new JLabel("・Nötter & Frön");
        labels[8] = new JLabel("・Pasta");
        labels[9] = new JLabel("・Potatis & ris");
        labels[10] = new JLabel("・Sötsaker");
        
        
        tools[0] = new JLabel("Alla varor A-Ö");
        tools[1] = new JLabel("Favoriter");
        tools[2] = new JLabel("Tidigare inköp");

        for(JLabel l : labels){
            JPanel p = new JPanel();
            p.setLayout(new BorderLayout());
            p.add(l,BorderLayout.WEST);
            
            p.setBackground(new Color(252, 251, 237));
            categoryMenu.add(p);
            l.setForeground(Color.RED);
            l.setFont(new Font("Georgia", Font.PLAIN, 16));
            l.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        
        for(JLabel l : tools){
            JPanel p = new JPanel();
            p.setLayout(new BorderLayout());
            p.add(l,BorderLayout.WEST);
            
            p.setBackground(new Color(252, 251, 237));
            toolsMenu.add(p);
            l.setForeground(Color.RED);
            l.setFont(new Font("Georgia", Font.PLAIN, 16));
            l.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }
    
    public JLabel[] getLabels() {
        return labels;
    }
    
    public JLabel[] getTools() {
        return tools;
    }
}
