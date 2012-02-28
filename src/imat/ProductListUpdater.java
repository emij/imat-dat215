/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

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
public class ProductListUpdater {

   
//gissar extends Observable osv
    
    
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    
    private List<Product> products;
    private List<ShoppingItem> shoppingItems;
    private List<Double> amount;
    private List<Double> totalValue;
    
    private ProductPanel[] productPanels;
    private FavoritesPanel[] favoritesPanels;
    private ShoppingCartPanel[] shoppingCartPanels;
    
    private ProductList productList;
    private ShoppingCartList shoppingCartList;
    
    public ProductListUpdater(ProductCategory productCategory){
        products = data.getProducts(productCategory);
        productList = new ProductList();
        productList.setCategoryName(productCategory.toString());
        updateProductList();
    }
    public ProductListUpdater(ShoppingCart shoppingCart){
        shoppingItems = data.getShoppingCart().getItems();
        shoppingCartList = new ShoppingCartList();
        shoppingCartList.setCategoryName("Kundvagn");
        for(int i = 0; i < shoppingItems.size(); i++){
            products.add(i, shoppingItems.get(i).getProduct());
            amount.add(i, shoppingItems.get(i).getAmount());
            totalValue.add(i, shoppingItems.get(i).getTotal());
        }
        updateShoppingCartList();
    }
            
    public ProductListUpdater(List<Product> products){
        this.products = products;
        productList = new ProductList();
        productList.setCategoryName("Favoriter");
        updateProductList();
    }
    
    private void updateShoppingCartList() {
        shoppingCartPanels = new ShoppingCartPanel[products.size()];
        for(int i = 0; i < products.size(); i++){
            shoppingCartPanels[i] = new ShoppingCartPanel(products.get(i), amount.get(i), totalValue.get(i));
            shoppingCartPanels[i].setBorder(null);
            shoppingCartList.addToProductList(shoppingCartPanels[i]);
        }
    }
 
    private void updateProductList() {
        productPanels = new ProductPanel[products.size()];
        for(int i = 0; i < products.size(); i++){
        
            productPanels[i] = new ProductPanel(products.get(i));
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

    
}
