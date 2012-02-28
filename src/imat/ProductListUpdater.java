/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.util.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class ProductListUpdater {

   
//gissar extends Observable osv
    
    public enum CategoryEnum { PRODUCTS, SHOPPINGCART, FAVORITES }
    
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
    
    public ProductListUpdater(ProductCategory productCategory, CategoryEnum type){
        if(type == CategoryEnum.PRODUCTS){
            products = data.getProducts(productCategory);
            productList = new ProductList();
            productList.setCategoryName(productCategory.toString());
            updateProductList();
            
        } else if (type == CategoryEnum.SHOPPINGCART){
            shoppingItems = data.getShoppingCart().getItems();
            shoppingCartList = new ShoppingCartList();
            shoppingCartList.setCategoryName("Favoriter");
            for(int i = 0; i < shoppingItems.size(); i++){
                products.add(i, shoppingItems.get(i).getProduct());
                amount.add(i, shoppingItems.get(i).getAmount());
                totalValue.add(i, shoppingItems.get(i).getTotal());
            }
            updateShoppingCartList();
            
        } else {
            products = data.favorites();
            productList = new ProductList();
            productList.setCategoryName(productCategory.toString());
            updateFavorites();
        }
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
        
    }
    private void updateFavorites() {
        favoritesPanels = new FavoritesPanel[products.size()];
        for(int i = 0; i < products.size(); i++){
            
            favoritesPanels[i] = new FavoritesPanel(products.get(i));
            favoritesPanels[i].setBorder(null);
            productList.addToProductList(favoritesPanels[i]);
        }
    }
    public JPanel getPanel() {
        return productList;
    }

    
}
