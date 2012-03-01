/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.io.Serializable;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author lisastenberg
 */
public class Category implements Serializable{
    private ProductCategory pc;
    
    public enum PANELTYPE{
        CATEGORY,SEARCH,ORDER, FAVORITES, ALFA;
    }
    private String categoryName ="";
    private PANELTYPE panelType;
    public Category(String name, PANELTYPE d){
        this.categoryName = name;
        this.panelType=d;
    }
    
    public Category(ProductCategory pc){
        this.panelType = PANELTYPE.CATEGORY;
        this.pc=pc;
    }

    public ProductCategory getCategory() {
        return pc;
    }
    
    public String getCategoryName() {
        return categoryName;
    }

    public PANELTYPE getPanelType() {
        return panelType;
    }

    
    
    
    
    
}
