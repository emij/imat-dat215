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
    Dimension panelDimension = new Dimension(60,60);
    Dimension windowDimension = new Dimension(40,40);
    ProductCategory productCategory;
    
    int antal = 0;
    
    public CategoryCard(){
        //setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        productCategory = productCategory.BERRY;
        fillPanels(this, productCategory); 
        
    }
    
    public CategoryCard(ProductCategory productCategory){
        
        fillPanels(this, productCategory);
        
    }
    
    public void fillPanels(CategoryCard card, ProductCategory productCategory){
        products = data.getProducts(productCategory);
        card.setLayout(new GridLayout(products.size(),1));
        panels = new JPanel[products.size()];
        for(int i=0; i < products.size(); i++){
            panels[i] = new JPanel();
            panels[i].setPreferredSize(panelDimension);
            JButton productPicture = new JButton();
            productPicture.setPreferredSize(iconDimension);
            productPicture.setIcon(data.getImageIcon(products.get(i), iconDimension));
            panels[i].add(productPicture);
            JLabel productName = new JLabel("" + products.get(i).getName());
            panels[i].add(productName);
            
            add(panels[i]);
            antal++;
            }
        System.out.println("" + products.size() + "::::" + antal);        
    }
}
    
    
    

