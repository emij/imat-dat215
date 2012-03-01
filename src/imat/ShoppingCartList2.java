/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ShoppingCartList.java
 *
 * Created on Feb 28, 2012, 12:22:35 AM
 */
package imat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
    import javax.swing.*;
import se.chalmers.ait.dat215.project.*;
    import se.chalmers.ait.dat215.project.ProductCategory;
/**
 *
 * @author e
 */
public class ShoppingCartList2 extends javax.swing.JPanel implements ActionListener {
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    private ShoppingCart sc = data.getShoppingCart();
    private List<ShoppingItem> shoppingItems;
    private List<JButton> deleteButtons = new ArrayList();
    private List<JButton> favoriteButtons = new ArrayList();
    private List<ShoppingCartPanel> cartPanels = new ArrayList();
    
    /** Creates new form ShoppingCartList */
    public ShoppingCartList2() {
        
        initComponents();
        categoryScrollPane.setBorder(null);
	categoryScrollPane.setViewportBorder(null);
        categoryLabel.setText("Din Kundvagn");
        emptyChartButton.addActionListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryLabel = new javax.swing.JLabel();
        categoryScrollPane = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        leftLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        middleLabel = new javax.swing.JLabel();
        totalAmountDue = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        emptyChartButton = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ShoppingCartList2.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N

        categoryLabel.setBackground(resourceMap.getColor("categoryLabel.background")); // NOI18N
        categoryLabel.setFont(resourceMap.getFont("categoryLabel.font")); // NOI18N
        categoryLabel.setText(resourceMap.getString("categoryLabel.text")); // NOI18N
        categoryLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, resourceMap.getColor("categoryLabel.border.matteColor"))); // NOI18N
        categoryLabel.setName("categoryLabel"); // NOI18N

        categoryScrollPane.setBackground(resourceMap.getColor("categoryScrollPane.background")); // NOI18N
        categoryScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        categoryScrollPane.setHorizontalScrollBar(null);
        categoryScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));
        categoryScrollPane.setName("categoryScrollPane"); // NOI18N

        scrollPanel.setBackground(resourceMap.getColor("scrollPanel.background")); // NOI18N
        scrollPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollPanel.setName("scrollPanel"); // NOI18N
        scrollPanel.setLayout(new javax.swing.BoxLayout(scrollPanel, javax.swing.BoxLayout.PAGE_AXIS));
        categoryScrollPane.setViewportView(scrollPanel);

        leftLabel.setFont(resourceMap.getFont("leftLabel.font")); // NOI18N
        leftLabel.setForeground(resourceMap.getColor("leftLabel.foreground")); // NOI18N
        leftLabel.setText(resourceMap.getString("leftLabel.text")); // NOI18N
        leftLabel.setName("leftLabel"); // NOI18N

        rightLabel.setFont(resourceMap.getFont("rightLabel.font")); // NOI18N
        rightLabel.setForeground(resourceMap.getColor("rightLabel.foreground")); // NOI18N
        rightLabel.setText(resourceMap.getString("rightLabel.text")); // NOI18N
        rightLabel.setName("rightLabel"); // NOI18N

        middleLabel.setFont(resourceMap.getFont("middleLabel.font")); // NOI18N
        middleLabel.setForeground(resourceMap.getColor("middleLabel.foreground")); // NOI18N
        middleLabel.setText(resourceMap.getString("middleLabel.text")); // NOI18N
        middleLabel.setName("middleLabel"); // NOI18N

        totalAmountDue.setBackground(resourceMap.getColor("totalAmountDue.background")); // NOI18N
        totalAmountDue.setFont(resourceMap.getFont("totalAmountDue.font")); // NOI18N
        totalAmountDue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalAmountDue.setText(resourceMap.getString("totalAmountDue.text")); // NOI18N
        totalAmountDue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        totalAmountDue.setName("totalAmountDue"); // NOI18N

        nextButton.setText(resourceMap.getString("nextButton.text")); // NOI18N
        nextButton.setName("nextButton"); // NOI18N

        emptyChartButton.setText(resourceMap.getString("emptyChartButton.text")); // NOI18N
        emptyChartButton.setName("emptyChartButton"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftLabel)
                        .addGap(298, 298, 298)
                        .addComponent(middleLabel)
                        .addGap(56, 56, 56)
                        .addComponent(rightLabel))
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(emptyChartButton)
                        .addGap(175, 175, 175)
                        .addComponent(totalAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(nextButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalAmountDue, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(emptyChartButton))
                        .addGap(12, 12, 12))
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JScrollPane categoryScrollPane;
    private javax.swing.JButton emptyChartButton;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel middleLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JLabel totalAmountDue;
    // End of variables declaration//GEN-END:variables
    
    public void updateView() {
        shoppingItems = sc.getItems();
        if(shoppingItems.isEmpty()){
            nextButton.setEnabled(false);
            emptyChartButton.setEnabled(false);
        } else {
            nextButton.setEnabled(true);
            emptyChartButton.setEnabled(true);
        }
        scrollPanel.removeAll();
        scrollPanel.revalidate();
        scrollPanel.repaint();
        addToProductList();
    }
    
    public void addToProductList(){
        ShoppingCartPanel p;
        Product product;
        double amount;
        double totalValue;
        deleteButtons.clear();
        
        for(int i = 0; i < shoppingItems.size(); i++) {
            product = shoppingItems.get(i).getProduct();
            amount = shoppingItems.get(i).getAmount();
            totalValue = shoppingItems.get(i).getTotal();
            p = new ShoppingCartPanel(product, amount, totalValue);
            cartPanels.add(p);
            
            deleteButtons.add(p.getChartButton());
            favoriteButtons.add(p.getFavoritesButton());
            
            deleteButtons.get(i).addActionListener(this);
            favoriteButtons.get(i).addActionListener(this);
            scrollPanel.add(p);
        }
        
        totalAmountDue.setText("Totalt: " + sc.getTotal() + " kr");        
    } 

    public JPanel getInnerPanel(){
        return scrollPanel;
    }
    public JButton getNextButton() {
        return nextButton;
    }

    public void actionPerformed(ActionEvent ae) {
        for(int i = 0; i < deleteButtons.size(); i++) {
            if(ae.getSource().equals(deleteButtons.get(i))) {
                sc.removeItem(shoppingItems.get(i));
                updateView();
            }
            if(ae.getSource().equals(favoriteButtons.get(i))) {
                cartPanels.get(i).setFavoritesButton();
                updateView();
            }
        }
        if(ae.getSource().equals(emptyChartButton)) {
            sc.clear();
            updateView();
        }
    }
}
