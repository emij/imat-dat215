/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class CategoryCard extends JPanel {
    IMatDataHandler data = IMatDataHandler.getInstance();
    JPanel[] panels;
    List<Product> products;
    Dimension iconDimension = new Dimension(55,55);
    Dimension panelDimension = new Dimension(4,6);
    Dimension windowDimension = new Dimension(40,40);
    ProductCategory productCategory;
    
    int antal = 0;
    
    public CategoryCard(){
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        productCategory = productCategory.BERRY;
        fillPanels(productCategory); 
        this.setMaximumSize(windowDimension);
    }
    
    public CategoryCard(ProductCategory productCategory){
        setLayout(new GridLayout(1, 1));
        fillPanels(productCategory);
        this.setPreferredSize(windowDimension);
    }
    
    public void fillPanels(ProductCategory productCategory){
        products = data.getProducts(productCategory);
        panels = new JPanel[1];
        /*for(int i=0; i < products.size(); i++){
            panels[i] = new JPanel();
            //panels[i].setPreferredSize(panelDimension);
            panels[i].setMaximumSize(panelDimension);
            JButton productPicture = new JButton();
            productPicture.setPreferredSize(iconDimension);
            productPicture.setIcon(data.getImageIcon(products.get(i)));
            panels[i].add(productPicture);
            panels[i].setBorder(new EtchedBorder());
            panels[i].setAlignmentX(Component.CENTER_ALIGNMENT);
            add(panels[i]);
            antal++;
            }*/
        panels[0] = new JPanel();
        JLabel productPicture = new JLabel();  
        productPicture.setPreferredSize(iconDimension);
        //productPicture.setIcon(data.getImageIcon(products.get(0)), iconDimension);
        panels[0].add(productPicture);
        panels[0].setMaximumSize(panelDimension);
        add(panels[0]);
        System.out.println("" + products.size() + "::::" + antal);        
    }
}
    
    
    

