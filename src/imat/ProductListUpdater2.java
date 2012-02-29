/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 * A class for creating pages that shows either
 * products in category
 * products in favorites
 * products in shoppingcart
 * @author e
 */
public class ProductListUpdater2 extends Observable implements ActionListener {

    private IMatDataHandler data = IMatDataHandler.getInstance();
    private ShoppingCart shoppingCart = data.getShoppingCart();
    private ProductControl productControl = ProductControl.getInstance();
    private List<ShoppingItem> shoppingItems = data.getShoppingCart().getItems();
    
    private List<Product> products;
    private List<Double> amount;
    private List<Double> totalValue;
    
    private List<JButton> favoriteButtons;
    private List<JButton> chartButtons;
    private List<JButton> valueMinusButtons;
    private List<JButton> valuePlusButtons;
    
    private ProductPanel[] productPanels;
    private FavoritesPanel[] favoritesPanels;
    private ShoppingCartPanel[] shoppingCartPanels;
    
    private ProductList productList;
    private ShoppingCartList2 shoppingCartList;
    
    private CategoryNameConverter categoryNameConverter = CategoryNameConverter.getInstance();

    public ProductListUpdater2(Observer value, ProductCategory productCategory){
        this.addObserver(value);
        products = data.getProducts(productCategory);
        productList = new ProductList();
        productList.setCategoryName(categoryNameConverter.convertCategoryName(productCategory));
        updateProductList(products);
    }
            
    public ProductListUpdater2(Observer value, List<Product> products){
        this.addObserver(value);
        this.products = products;
        productList = new ProductList();
        productList.setCategoryName("Favoriter");
        updateProductList(products);
    }
    
    public ProductListUpdater2(Observer value, List<Product> products, String search){
        this.addObserver(value);
        this.products = products;
        productList = new ProductList();
        productList.setCategoryName("Sökresultat: " + search);
        updateProductList(products);
    }
    
    public void setView(ProductCategory pc) {
        
    }
    
    public void setView(List<Product> pr) {
        
    }
 
    private void updateProductList(List<Product> products) {
        productPanels = new ProductPanel[products.size()];
        favoriteButtons = new ArrayList<JButton>();
        chartButtons = new ArrayList<JButton>();
        valueMinusButtons = new ArrayList<JButton>();
        valuePlusButtons = new ArrayList<JButton>();


        for(int i = 0; i < products.size(); i++){
        
            productPanels[i] = new ProductPanel(products.get(i));
            favoriteButtons.add(i, productPanels[i].getFavoritesButton());
            favoriteButtons.get(i).addActionListener(this);
            chartButtons.add(i, productPanels[i].getChartButton());
            chartButtons.get(i).addActionListener(this);
            valueMinusButtons.add(i, productPanels[i].getMinusButton());
            valueMinusButtons.get(i).addActionListener(this);
            valuePlusButtons.add(i, productPanels[i].getPlusButton());
            valuePlusButtons.get(i).addActionListener(this);
            productPanels[i].setBorder(null);
            productList.addToProductList(productPanels[i]);
        }
        
    } // Används ej för tillfället
    private void updateFavorites() {
        favoritesPanels = new FavoritesPanel[products.size()];
        for(int i = 0; i < products.size(); i++){
            
            favoritesPanels[i] = new FavoritesPanel(products.get(i));
            favoritesPanels[i].setBorder(null);
            productList.addToProductList(favoritesPanels[i]);
        }
    }
    public JPanel getProductPanel() {
        return productList;
    }
    
    public JPanel getShoppingCartPanel(){
        return shoppingCartList;
    }
    
    public void testUpdate(List<Product> products){
        productList.getTestUpdate().removeAll();
        updateProductList(products);
    }
    

    public void actionPerformed(ActionEvent e) {
        setChanged();
        for(int i = 0; i < products.size(); i++){
            if(e.getSource().equals(favoriteButtons.get(i))) {
                productPanels[i].setFavoritesButton();
                data.addFavorite(products.get(i));
                
            } else if(e.getSource().equals(chartButtons.get(i))) {
                Double value = productPanels[i].getValue();
                boolean alreadyExcists = false;
                int index;
                if(shoppingItems != null) {

                    System.out.println("a");
                    for(int j = 0; j < shoppingItems.size(); j++) {
                        if(shoppingItems.get(j).getProduct().equals(products.get(i))) {
                            System.out.println("b");
                         alreadyExcists = true;
                            index = j;
                       }
                    }
                }
                if(!alreadyExcists) {
                    shoppingCart.addProduct(products.get(i), value);
                } else {
                    double oldAmount = shoppingItems.get(i).getAmount();
                    System.out.println("" + oldAmount);
                    shoppingItems.get(i).setAmount(oldAmount + value);
                }
                
                Double totalCost = products.get(i).getPrice() * value;
                
                productControl.add(value, totalCost);
                productPanels[i].zeroValue();
                this.notifyObservers(productControl);
                
            } else if(e.getSource().equals(valuePlusButtons.get(i))){
                productPanels[i].addValue();
            } else if(e.getSource().equals(valueMinusButtons.get(i))){
                productPanels[i].negValue();
            }
        }
    }  
}
