/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

/**
 *
 * @author e
 */
public class ProductControl {
    private int nbrOfProducts, sum;
    public ProductControl(int nbrOfProducts, int sum) {
        this.nbrOfProducts = nbrOfProducts;
        this.sum = sum;
    }
    
    public int getNbrOfProducts() {
        return nbrOfProducts;
    }
    
    public int getSum() {
        return sum;
    }
    
}
