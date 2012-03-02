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
    private List<ShoppingItem> shoppingItems = data.getShoppingCart().getItems();
    private List<ShoppingItem> orderItems;
    
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
   
    private CategoryNameConverter categoryNameConverter = CategoryNameConverter.getInstance();
    
    String categoryName;

    public ProductListUpdater2() {
        productList = new ProductList();
    }
    
    public void setView(ProductCategory pc) {
        categoryName = categoryNameConverter.convertCategoryName(pc);
        products = data.getProducts(pc);
        newProductList(categoryName);
    }
    
    //Tar hand om A-Ö, search och favoriter, 
    public void setView(List<Product> pr, String header, String header2) {
        products = pr;
        categoryName = header + header2;
        newProductList(categoryName);
    }
    
    //Måste sätta value (amount) också.. Hanterar äldre ordrar
    public void setView(List<ShoppingItem> si, String header) {
        orderItems = si;
        categoryName = "Ordernummer: " + header;
        productList.setCategoryName(categoryName);

        orderList(si, header);
    }
    
    public void orderList(List<ShoppingItem> si, String header) {
        productList.getAllButton().setVisible(true);
        productList.getAllButton().addActionListener(this);
        productList.getTestUpdate().removeAll();
        productList.getTestUpdate().revalidate();
        productList.getTestUpdate().repaint();
        
        productPanels = new ProductPanel[si.size()];
        favoriteButtons = new ArrayList<JButton>();
        chartButtons = new ArrayList<JButton>();
        valueMinusButtons = new ArrayList<JButton>();
        valuePlusButtons = new ArrayList<JButton>();
        products = new ArrayList<Product>();
        for(int i = 0; i < si.size(); i++){
            int value = (int)si.get(i).getAmount();
            productPanels[i] = new ProductPanel(si.get(i).getProduct(), value);
            products.add(i, si.get(i).getProduct());
            favoriteButtons.add(i, productPanels[i].getFavoritesButton());
            chartButtons.add(i, productPanels[i].getChartButton());
            valueMinusButtons.add(i, productPanels[i].getMinusButton());
            valuePlusButtons.add(i, productPanels[i].getPlusButton());
            
            //Add actionlisteners to all buttons
            favoriteButtons.get(i).addActionListener(this);
            chartButtons.get(i).addActionListener(this);
            valueMinusButtons.get(i).addActionListener(this);
            valuePlusButtons.get(i).addActionListener(this);
            
            
            
            productPanels[i].setBorder(null);
            productList.addToProductList(productPanels[i]);
        }
    }
    
    public void newProductList(String categoryName) {
        productList.getAllButton().setVisible(false);
        productList.getTestUpdate().removeAll();
        productList.getTestUpdate().revalidate();
        productList.getTestUpdate().repaint();
        productList.setCategoryName(categoryName);
        
        updateProductList(products);
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
            chartButtons.add(i, productPanels[i].getChartButton());
            valueMinusButtons.add(i, productPanels[i].getMinusButton());
            valuePlusButtons.add(i, productPanels[i].getPlusButton());
            
            //Add actionlisteners to all buttons
            favoriteButtons.get(i).addActionListener(this);
            chartButtons.get(i).addActionListener(this);
            valueMinusButtons.get(i).addActionListener(this);
            valuePlusButtons.get(i).addActionListener(this);
            
            productPanels[i].setBorder(null);
            productList.addToProductList(productPanels[i]);
        }
    } 
    
    public JPanel getProductPanel() {
        return productList;
    }
    
    public void testUpdate(List<Product> products){
        productList.getTestUpdate().removeAll();
        updateProductList(products);
    }
    
    private void addToChart(Product product, double amount) {
        boolean alreadyExists = false;
        int index = 0;
        if(shoppingItems != null) {
            for(int j = 0; j < shoppingItems.size(); j++) {
                if(shoppingItems.get(j).getProduct().equals(product)) {
                    alreadyExists = true;
                    index = j;
                    break;
                }
            }
        }
        if (!alreadyExists) {
            shoppingCart.addProduct(product, amount);
        } else {
            double oldAmount = shoppingItems.get(index).getAmount();
            shoppingCart.removeProduct(product);
            shoppingCart.addProduct(product, oldAmount + amount);
        }

        double totalCost = product.getPrice() * amount;
       // productControl.add(amount, totalCost);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(productList.getAllButton())) {
            for(int i = 0; i < productPanels.length; i++) {
                Product pr = productPanels[i].getProduct();
                double am = productPanels[i].getValue();
                addToChart(pr, am);
            }
        }
        for(int i = 0; i < products.size(); i++){
            if(e.getSource().equals(favoriteButtons.get(i))) {
                productPanels[i].setFavoritesButton();
                setView(products, categoryName, "");
            } else if(e.getSource().equals(chartButtons.get(i))) {
                Double value = productPanels[i].getValue();
                addToChart(productPanels[i].getProduct(), value);
                productPanels[i].zeroValue();
                
            } else if(e.getSource().equals(valuePlusButtons.get(i))){
                productPanels[i].addValue();
            } else if(e.getSource().equals(valueMinusButtons.get(i))){
                productPanels[i].negValue();
            }
        }
    }  
}
