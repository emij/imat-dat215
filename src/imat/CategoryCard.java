/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class CategoryCard extends JPanel {
    IMatDataHandler data = IMatDataHandler.getInstance();
    JPanel[] panels;
    List<Product> products;
    Dimension dimension = new Dimension(50,50);
    ProductCategory productCategory;
    
    public CategoryCard(){
        setLayout(new GridLayout(1, 10));
        productCategory = productCategory.BERRY;
        fillPanels(productCategory); 
    }
    
    public CategoryCard(ProductCategory productCategory){
        setLayout(new GridLayout(1, 10));
        fillPanels(productCategory);
    }
    
    public void fillPanels(ProductCategory productCategory){
        panels = new JPanel[products.size()];
        for(int i=0; i < products.size(); i++){
                panels[i] = new JPanel();
            JButton productPicture = new JButton();
            productPicture.setPreferredSize(dimension);
            productPicture.setIcon(data.getImageIcon(products.get(i)));
            panels[i].add(productPicture);
            add(panels[i]);
        }
        
    }
}
    
    
    

