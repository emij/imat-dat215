/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class GridPanel extends JPanel {

private JPanel panel1 = new JPanel();
private JPanel panel2 = new JPanel();
private JPanel panel3 = new JPanel();
private JPanel panel4 = new JPanel();
private JPanel panel5 = new JPanel(); 
private JPanel panel6 = new JPanel();
private JPanel panel7 = new JPanel();
private JPanel panel8 = new JPanel();
private JPanel panel9 = new JPanel();
private JPanel panel10 = new JPanel();
private JPanel panel11 = new JPanel();
private JPanel panel12 = new JPanel();

	public GridPanel() {
		setLayout(new GridLayout(3, 4, 10, 10));
		
		//Add all panels to the grid
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		add(panel10);
		add(panel11);
		add(panel12);
                
                panel1.setBackground(Color.);
                panel2.setBackground(Color.blue);
                panel5.setBackground(Color.black);
                

		
	}
}