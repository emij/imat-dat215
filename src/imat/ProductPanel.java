/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProductPanel.java
 *
 * Created on Feb 27, 2012, 6:41:21 PM
 */
package imat;

import java.awt.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class ProductPanel extends javax.swing.JPanel {
    
    String path;
    private Dimension iconDimension = new Dimension(40,40);
    private boolean isFavorite;
    public Product product;
    private IMatDataHandler data = IMatDataHandler.getInstance();
    private Color typBrun = new Color(195, 182, 154);
    private int amount;
    private ImageIcon addFavoritesIcon;
    private ImageIcon addChartIcon;
    private ImageIcon remFavoritesIcon;
    private ImageIcon plusIcon;
    private ImageIcon minusIcon;
    /** Creates new form ProductPanel */
    public ProductPanel() {
        initComponents();
    }
    
    public ProductPanel(Product product){
        initComponents();
        this.product = product;
        isFavorite = data.isFavorite(product);
        initMyComponents();  
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, typBrun));
        this.repaint();
        this.revalidate();
    }
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        productPicture = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0));
        productName = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        addToFavorites = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        pricePanel = new javax.swing.JPanel();
        productPrice = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        valueMinus = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0));
        value = new javax.swing.JTextField();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0), new java.awt.Dimension(3, 0));
        valuePlus = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        addToChart = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));

        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ProductPanel.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(32767, 55));
        setMinimumSize(new java.awt.Dimension(0, 55));
        setName("Form"); // NOI18N

        leftPanel.setBackground(resourceMap.getColor("leftPanel.background")); // NOI18N
        leftPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        leftPanel.setMinimumSize(new java.awt.Dimension(0, 30));
        leftPanel.setName("leftPanel"); // NOI18N
        leftPanel.setLayout(new javax.swing.BoxLayout(leftPanel, javax.swing.BoxLayout.LINE_AXIS));

        productPicture.setFont(resourceMap.getFont("productPicture.font")); // NOI18N
        productPicture.setText(resourceMap.getString("productPicture.text")); // NOI18N
        productPicture.setName("productPicture"); // NOI18N
        leftPanel.add(productPicture);

        filler2.setName("filler2"); // NOI18N
        leftPanel.add(filler2);

        productName.setFont(resourceMap.getFont("productName.font")); // NOI18N
        productName.setText(resourceMap.getString("productName.text")); // NOI18N
        productName.setName("productName"); // NOI18N
        leftPanel.add(productName);

        filler3.setName("filler3"); // NOI18N
        leftPanel.add(filler3);

        addToFavorites.setBackground(resourceMap.getColor("addToFavorites.background")); // NOI18N
        addToFavorites.setForeground(resourceMap.getColor("addToFavorites.foreground")); // NOI18N
        addToFavorites.setIcon(resourceMap.getIcon("addToFavorites.icon")); // NOI18N
        addToFavorites.setText(resourceMap.getString("addToFavorites.text")); // NOI18N
        addToFavorites.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addToFavorites.setName("addToFavorites"); // NOI18N
        leftPanel.add(addToFavorites);

        filler1.setName("filler1"); // NOI18N
        leftPanel.add(filler1);

        pricePanel.setBackground(resourceMap.getColor("pricePanel.background")); // NOI18N
        pricePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pricePanel.setName("pricePanel"); // NOI18N

        productPrice.setBackground(resourceMap.getColor("productPrice.background")); // NOI18N
        productPrice.setFont(resourceMap.getFont("productPrice.font")); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText(resourceMap.getString("productPrice.text")); // NOI18N
        productPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        productPrice.setName("productPrice"); // NOI18N

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        rightPanel.setBackground(resourceMap.getColor("rightPanel.background")); // NOI18N
        rightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rightPanel.setMinimumSize(new java.awt.Dimension(0, 30));
        rightPanel.setName("rightPanel"); // NOI18N
        rightPanel.setLayout(new javax.swing.BoxLayout(rightPanel, javax.swing.BoxLayout.LINE_AXIS));

        filler5.setName("filler5"); // NOI18N
        rightPanel.add(filler5);

        valueMinus.setIcon(resourceMap.getIcon("valueMinus.icon")); // NOI18N
        valueMinus.setText(resourceMap.getString("valueMinus.text")); // NOI18N
        valueMinus.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        valueMinus.setName("valueMinus"); // NOI18N
        rightPanel.add(valueMinus);

        filler7.setName("filler7"); // NOI18N
        rightPanel.add(filler7);

        value.setBackground(resourceMap.getColor("value.background")); // NOI18N
        value.setFont(resourceMap.getFont("value.font")); // NOI18N
        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setText(resourceMap.getString("value.text")); // NOI18N
        value.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        value.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        value.setDisabledTextColor(resourceMap.getColor("value.disabledTextColor")); // NOI18N
        value.setFocusable(false);
        value.setMaximumSize(new java.awt.Dimension(19, 20));
        value.setMinimumSize(new java.awt.Dimension(19, 20));
        value.setName("value"); // NOI18N
        value.setPreferredSize(new java.awt.Dimension(19, 20));
        rightPanel.add(value);

        filler8.setName("filler8"); // NOI18N
        rightPanel.add(filler8);

        valuePlus.setIcon(resourceMap.getIcon("valuePlus.icon")); // NOI18N
        valuePlus.setText(resourceMap.getString("valuePlus.text")); // NOI18N
        valuePlus.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        valuePlus.setName("valuePlus"); // NOI18N
        rightPanel.add(valuePlus);

        filler4.setName("filler4"); // NOI18N
        rightPanel.add(filler4);

        addToChart.setBackground(resourceMap.getColor("addToChart.background")); // NOI18N
        addToChart.setForeground(resourceMap.getColor("addToChart.foreground")); // NOI18N
        addToChart.setIcon(resourceMap.getIcon("addToChart.icon")); // NOI18N
        addToChart.setText(resourceMap.getString("addToChart.text")); // NOI18N
        addToChart.setAlignmentX(0.5F);
        addToChart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addToChart.setIconTextGap(0);
        addToChart.setName("addToChart"); // NOI18N
        addToChart.setOpaque(true);
        rightPanel.add(addToChart);

        filler6.setName("filler6"); // NOI18N
        rightPanel.add(filler6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToChart;
    private javax.swing.JButton addToFavorites;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPicture;
    private javax.swing.JLabel productPrice;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField value;
    private javax.swing.JButton valueMinus;
    private javax.swing.JButton valuePlus;
    // End of variables declaration//GEN-END:variables

    private void initMyComponents() {
        path = "resources/bilder/";
        amount = 1;
        addFavoritesIcon = new ImageIcon(getClass().getResource(path + "laggtill_favoriter.png"));
        remFavoritesIcon = new ImageIcon(getClass().getResource(path + "tabort_favoriter.png"));
        addChartIcon = new ImageIcon(getClass().getResource(path + "laggtill_kundvagn.png"));
        minusIcon = new ImageIcon(getClass().getResource(path + "minus.png"));
        plusIcon = new ImageIcon(getClass().getResource(path + "plus.png"));
        value.setText("" + amount);
        changeMouseCursor();
        value.setFont(new Font("Georgia", Font.PLAIN, 14));
        productPicture.setIcon(data.getImageIcon(product, iconDimension));
        productPicture.setBorder(BorderFactory.createLineBorder(typBrun, 1));
        productName.setFont(new Font("fans serif", Font.BOLD, 14));
        productName.setText(product.getName());
        productPrice.setFont(new Font("Georgia", Font.PLAIN, 14));
        productPrice.setText("" + product.getPrice() + " " + product.getUnit());
        addToChart.setIcon(addChartIcon);
        valuePlus.setIcon(plusIcon);
        valueMinus.setIcon(minusIcon);
        if(!isFavorite){
            addToFavorites.setIcon(addFavoritesIcon);
        } else {
            addToFavorites.setIcon(remFavoritesIcon);
        }
        leftPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, typBrun));
        pricePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, typBrun));
        rightPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, typBrun));
    }
    
    public JButton getFavoritesButton(){
        return addToFavorites;
    }
    public JButton getChartButton(){
        return addToChart;
    }
    public JButton getMinusButton(){
        return valueMinus;
    }
    public JButton getPlusButton(){
        return valuePlus;
    }
    public Double getValue(){
        return (double)amount;
    }
    public Product getProduct(){
        return product;
    }
    public void setAmount(int x) {
        amount = x;
    }
    public void setFavoritesButton(){
        if(isFavorite){
            addToFavorites.setIcon(addFavoritesIcon);
            isFavorite = false;
            data.removeFavorite(this.product);
            addToFavorites.repaint();
            addToFavorites.revalidate();
        } else {
            addToFavorites.setIcon(remFavoritesIcon);
            isFavorite = true;
            data.addFavorite(this.product);
            addToFavorites.repaint();
            addToFavorites.revalidate();
        }        
    }
    public void addValue(){
        amount = amount + 1;
        value.setText("" + amount);
    }
    public void negValue(){
        if (amount != 1){
            amount = amount -1;
            value.setText("" + amount);
        }
    }
    public void zeroValue(){
        amount = 1;
        value.setText("" + amount);
    }
    public void changeMouseCursor(){
        addToFavorites.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addToChart.setCursor(new Cursor(Cursor.HAND_CURSOR));
        valuePlus.setCursor(new Cursor(Cursor.HAND_CURSOR));
        valueMinus.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}
    
    

