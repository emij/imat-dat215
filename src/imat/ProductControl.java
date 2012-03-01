/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author e
 */
public class ProductControl extends Observable {
    private double nbrOfProducts, sum;
    private static ProductControl instance;
    
    private ProductControl(double nbrOfProducts, double sum) {
        this.nbrOfProducts = nbrOfProducts;
        this.sum = sum;
    }
    
    public static ProductControl getInstance() {
        if(instance == null) {
            instance = new ProductControl(0, 0);
        }
        return instance;
    }
    
    public void addOb(Observer o) {
        this.addObserver(o);
    }
    
    public double getNbrOfProducts() {
        return nbrOfProducts;
    }
    
    public double getSum() {
        return sum;
    }
    
    public void add(double nr, double s) {
        nbrOfProducts = nbrOfProducts + nr;
        sum = sum + s;
        setChanged();
        this.notifyObservers(this);
    }
    
    public void delete(double nr, double s) {
        nbrOfProducts = nbrOfProducts - nr;
        sum = sum - s;
        setChanged();
        this.notifyObservers(this);
    }
    
    public void clear() {
        nbrOfProducts = 0; 
        sum = 0;
        setChanged();
        this.notifyObservers(this);
    }
    
}
