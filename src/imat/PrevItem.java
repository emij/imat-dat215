/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author lisastenberg
 */
public class PrevItem {
    
    private String card;
    private Category category;
    
    public PrevItem(String card, Category c){
        this.card=card;
        this.category=c;
        
    }

    public String getCard() {
        return card;
    }

    public Category getCategory() {
        return category;
    }
    
    
    
    
    
    
}
