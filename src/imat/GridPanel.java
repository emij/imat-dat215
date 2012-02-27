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
 * @author lisastenberg & ollewerme
 */
public class GridPanel extends JPanel {

private JPanel[] panelArr = new JPanel[12];
private JButton[] buttonArr;
private JButton emptyButton;
private JButton favoritesButton = new JButton(new ImageIcon(getClass().getResource("resources/kategoribilder/favoriter.png")));
private IMatDataHandler data;

/**
 * 
 * @param grids how many grids you want in your panel
 */

	public GridPanel(int grids) {
                setOpaque(false);
                data = IMatDataHandler.getInstance();
            
		setLayout(new GridLayout(3, 4, 0, 0));
                buttonArr = new JButton[grids];
                
                for(int i = 0; i < 12; i++) {
                    panelArr[i] = new JPanel();
                    add(panelArr[i]);
                }
                
		//Add all panels to the grid et.c
                for(int i = 0; i < grids; i++) {
                    panelArr[i].setBackground(Color.WHITE);
                    buttonArr[i] = new JButton("");
                    buttonArr[i].setLocation(10,15);
                    panelArr[i].setOpaque(false);
                    panelArr[i].add(buttonArr[i]);
                    buttonArr[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                
                // Add empty buttons in the remaining grid spaces
                for(int i = grids; i < 11; i++) {
                    panelArr[i].setBackground(Color.WHITE);
                    panelArr[i].setOpaque(false);
                    emptyButton = new JButton(new ImageIcon(getClass().getResource("resources/kategoribilder/tom.png")));
                    panelArr[i].add(emptyButton);
                    emptyButton.setBorder(null);
                }
                
                // Add the favorite button last
                panelArr[11].add(favoritesButton);
                panelArr[11].setOpaque(false);
                favoritesButton.setBorder(null);
      	}
        
        public JPanel[] getPanelArr() {
            return panelArr;
        }
        
        public JButton[] getButtonArr() {
            return buttonArr;
        }
}