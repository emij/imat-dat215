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
public class ProductListUpdater extends Observable implements ActionListener, ShoppingCartListener {

   
//gissar extends Observable osv
    
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    private ShoppingCart shoppingCart = data.getShoppingCart();
    private List<Product> products;
    private List<ShoppingItem> shoppingItems;
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
    private ShoppingCartList shoppingCartList;
    
    private CategoryNameConverter categoryNameConverter = CategoryNameConverter.getInstance();

    public ProductListUpdater(Observer value, ProductCategory productCategory){
        this.addObserver(value);
        products = data.getProducts(productCategory);
        productList = new ProductList();
        productList.setCategoryName(categoryNameConverter.convertCategoryName(productCategory));
        updateProductList(products);
    }
    public ProductListUpdater(Observer value, ShoppingCart shoppingCart){
        this.addObserver(value);
        shoppingCart.addShoppingCartListener(this);
        amount = new ArrayList<Double>();
        totalValue = new ArrayList<Double>();
        products = new ArrayList<Product>();
        shoppingItems = data.getShoppingCart().getItems();
        shoppingCartList = new ShoppingCartList();
        CreateNewCart();
        
    }
            
    public ProductListUpdater(Observer value, List<Product> products){
        this.addObserver(value);
        this.products = products;
        productList = new ProductList();
        productList.setCategoryName("Favoriter");
        updateProductList(products);
    }
    public ProductListUpdater(Observer value, List<Product> products, String search){
        this.addObserver(value);
        this.products = products;
        productList = new ProductList();
        productList.setCategoryName("Sökresultat: " + search);
        updateProductList(products);
    }

    
    private void updateShoppingCartList() {
        shoppingCartPanels = new ShoppingCartPanel[products.size()];
        favoriteButtons = new ArrayList<JButton>();
        chartButtons = new ArrayList<JButton>();
        valueMinusButtons = new ArrayList<JButton>();
        valuePlusButtons = new ArrayList<JButton>();
        
        
        for(int i = 0; i < products.size(); i++){
            shoppingCartPanels[i] = new ShoppingCartPanel(products.get(i), amount.get(i), totalValue.get(i));
            favoriteButtons.add(i, shoppingCartPanels[i].getFavoritesButton());
            favoriteButtons.get(i).addActionListener(this);
            chartButtons.add(i, shoppingCartPanels[i].getChartButton());
            chartButtons.get(i).addActionListener(this);
            valueMinusButtons.add(i, shoppingCartPanels[i].getMinusButton());
            valueMinusButtons.get(i).addActionListener(this);
            valuePlusButtons.add(i, shoppingCartPanels[i].getPlusButton());
            valuePlusButtons.get(i).addActionListener(this);
            shoppingCartPanels[i].setBorder(null);
            shoppingCartList.addToProductList(shoppingCartPanels[i]);
        }
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
            if(e.getSource().equals(favoriteButtons.get(i))){
                productPanels[i].setFavoritesButton();
            } else if(e.getSource().equals(chartButtons.get(i))){
                Double value = productPanels[i].getValue();
                shoppingCart.addProduct(products.get(i), value);
                Double totalCost = products.get(i).getPrice() * value;
                productPanels[i].zeroValue();
            } else if(e.getSource().equals(valuePlusButtons.get(i))){
                productPanels[i].addValue();
            } else if(e.getSource().equals(valueMinusButtons.get(i))){
                productPanels[i].negValue();
            }
        }
    }

    public void shoppingCartChanged() {
        JPanel tmp = shoppingCartList.getInnerPanel();
        //tmp.removeAll();
        //tmp.setLayout(new BoxLayout(tmp, BoxLayout.PAGE_AXIS));
        CreateNewCart();
    }

    private void CreateNewCart() {
        
        System.out.println("" + data.getShoppingCart().getTotal());
        shoppingCartList.setCategoryName("Kundvagn");
        for(int i = 0; i < shoppingItems.size(); i++){
            products.add(i, shoppingItems.get(i).getProduct());
            amount.add(i, shoppingItems.get(i).getAmount());
            totalValue.add(i, shoppingItems.get(i).getTotal());
        }
        updateShoppingCartList();
    }

    
}
