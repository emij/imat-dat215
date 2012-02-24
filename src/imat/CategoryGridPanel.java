/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class CategoryGridPanel extends Observable implements ActionListener{
    private JButton[] buttonArr;
    private GridPanel g; 
    
    public CategoryGridPanel(Observer o) {
        this.addObserver(o);
        g = new GridPanel(12);
        buttonArr = g.getButtonArr();
        
        setButtonImages();
        
        //Add actionlisteners to all buttons
        for(int i = 0; i < 12; i++) {
            buttonArr[i].addActionListener(this);
        }
    }
    private void setButtonImages(){
        File dir = new File("src/imat/resources/kategoriknappar/"); 
        File imageFileNames[] = dir.listFiles();  
        
        String path = "resources/kategoriknappar/";
        
        for(int i=0; i<buttonArr.length; i++){
            buttonArr[i].setIcon(new ImageIcon(getClass().getResource(path + imageFileNames[i+1].getName()))); // +1 är för DS_store-filen, orkar inte krångla..
            buttonArr[i].setBorder(null);
        }
    }
    
    public JButton[] getButtons(){
        return buttonArr;
    }
    
    public JPanel getPanel() {
        return g;
    }

    public void actionPerformed(ActionEvent ae) {
        
        setChanged();
        if(ae.getSource() == buttonArr[0]) {
            //IMatView.changePanel(breadPanel);
        } else if(ae.getSource() == buttonArr[1]) {
            //changePanel("card2");
        } else if(ae.getSource() == buttonArr[2]) {
            
        } else if(ae.getSource() == buttonArr[3]) {
            System.out.println("card2");
            this.notifyObservers("card2");
        } else if(ae.getSource() == buttonArr[4]) {
            
        } else if(ae.getSource() == buttonArr[5]) {
            
        } else if(ae.getSource() == buttonArr[6]) {
            
        } else if(ae.getSource() == buttonArr[7]) {
            
        } else if(ae.getSource() == buttonArr[8]) {
            
        } else if(ae.getSource() == buttonArr[9]) {
            
        } else if(ae.getSource() == buttonArr[10]) {
            
        } else if(ae.getSource() == buttonArr[11]) {
            
        } else if(ae.getSource() == buttonArr[12]) {
            
        }
    }


    
    
    
}
