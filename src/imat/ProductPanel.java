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
    
    private Dimension iconDimension = new Dimension(40,40);
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    private Color typBrun = new Color(164, 157, 157);

    /** Creates new form ProductPanel */
    public ProductPanel() {
        initComponents();
    }
    
    public ProductPanel(Product product){
        initComponents();
        initMyComponents(product);    
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

        addToFavorites.setText(resourceMap.getString("addToFavorites.text")); // NOI18N
        addToFavorites.setName("addToFavorites"); // NOI18N
        leftPanel.add(addToFavorites);

        filler1.setName("filler1"); // NOI18N
        leftPanel.add(filler1);

        pricePanel.setBackground(resourceMap.getColor("pricePanel.background")); // NOI18N
        pricePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pricePanel.setName("pricePanel"); // NOI18N

        productPrice.setFont(resourceMap.getFont("productPrice.font")); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText(resourceMap.getString("productPrice.text")); // NOI18N
        productPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        productPrice.setName("productPrice"); // NOI18N

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
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

        valueMinus.setText(resourceMap.getString("valueMinus.text")); // NOI18N
        valueMinus.setName("valueMinus"); // NOI18N
        rightPanel.add(valueMinus);

        filler7.setName("filler7"); // NOI18N
        rightPanel.add(filler7);

        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setText(resourceMap.getString("value.text")); // NOI18N
        value.setMaximumSize(new java.awt.Dimension(25, 25));
        value.setName("value"); // NOI18N
        value.setPreferredSize(new java.awt.Dimension(20, 20));
        rightPanel.add(value);

        filler8.setName("filler8"); // NOI18N
        rightPanel.add(filler8);

        valuePlus.setText(resourceMap.getString("valuePlus.text")); // NOI18N
        valuePlus.setName("valuePlus"); // NOI18N
        rightPanel.add(valuePlus);

        filler4.setName("filler4"); // NOI18N
        rightPanel.add(filler4);

        addToChart.setText(resourceMap.getString("addToChart.text")); // NOI18N
        addToChart.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        addToChart.setMaximumSize(new java.awt.Dimension(45, 35));
        addToChart.setName("addToChart"); // NOI18N
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
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(pricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
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

    private void initMyComponents(Product product) {
        productPicture.setIcon(data.getImageIcon(product, iconDimension));
        productPicture.setBorder(BorderFactory.createLineBorder(typBrun, 1));
        productName.setText(product.getName());
        productName.setFont(new Font("Georgia", Font.PLAIN, 12));
        productPrice.setText("" + product.getPrice() + " " + product.getUnit());
        productPrice.setFont(new Font("Georgia", Font.PLAIN, 12));
        leftPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, typBrun));
        pricePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, typBrun));
        rightPanel.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, typBrun));
    }
    
    
}
