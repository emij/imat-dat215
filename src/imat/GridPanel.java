/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author lisastenberg
 */
public class GridPanel extends JPanel {

private JPanel[] panelArr;
private JButton[] buttonArr;
private Dimension buttonDimension = new Dimension(160,130);
private IMatDataHandler data;

/**
 * 
 * @param grids how many grids you want in your panel
 */
	public GridPanel(int grids) {
                data = IMatDataHandler.getInstance();
            
		setLayout(new GridLayout(3, 4, 10, 10));
                panelArr = new JPanel[grids];
                buttonArr = new JButton[grids];
		
		//Add all panels to the grid et.c
                for(int i = 0; i < grids; i++) {
                    panelArr[i] = new JPanel();
                    add(panelArr[i]);
                    panelArr[i].setBackground(Color.WHITE);
                    buttonArr[i] = new JButton("");
                    buttonArr[i].setLocation(10,15);
                    buttonArr[i].setPreferredSize(buttonDimension);
                    panelArr[i].add(buttonArr[i]);
                }
      	}
        
        public JPanel[] getPanelArr() {
            return panelArr;
        }
        
        public JButton[] getButtonArr() {
            return buttonArr;
        }
        
        public void setButtonImage(JButton b, ImageIcon im) {
            b.setIcon(im);
        }
}