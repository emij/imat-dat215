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

    import java.awt.*;
    import javax.swing.*;
import se.chalmers.ait.dat215.project.*;
    import se.chalmers.ait.dat215.project.ProductCategory;
/**
 *
 * @author e
 */
public class ShoppingCartList extends javax.swing.JPanel {
    
    private IMatDataHandler data = IMatDataHandler.getInstance();

    /** Creates new form ShoppingCartList */
    public ShoppingCartList() {
        initComponents();
        categoryLabel.setFont(new Font("Georgia", Font.PLAIN, 12));
        categoryLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (new Color(164,157,157))));
        categoryScrollPane.setBorder(null);
	categoryScrollPane.setViewportBorder(null);
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

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ShoppingCartList.class);
        categoryLabel.setBackground(resourceMap.getColor("categoryLabel.background")); // NOI18N
        categoryLabel.setFont(resourceMap.getFont("categoryLabel.font")); // NOI18N
        categoryLabel.setText(resourceMap.getString("categoryLabel.text")); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftLabel)
                        .addGap(298, 298, 298)
                        .addComponent(middleLabel)
                        .addGap(56, 56, 56)
                        .addComponent(rightLabel))
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmountDue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(categoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAmountDue)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JScrollPane categoryScrollPane;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel middleLabel;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JPanel scrollPanel;
    private javax.swing.JLabel totalAmountDue;
    // End of variables declaration//GEN-END:variables
    
    public void addToProductList(ShoppingCartPanel shoppingCartPanel){
        scrollPanel.add(shoppingCartPanel);
        totalAmountDue.setText("" + data.getShoppingCart().getTotal());
        scrollPanel.repaint();
        categoryScrollPane.repaint();
        scrollPanel.revalidate();
        categoryScrollPane.revalidate();
    } 
    public void setCategoryName(String name){
        categoryLabel.setText(name);
    }
}
