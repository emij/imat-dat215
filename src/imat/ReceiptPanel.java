/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReceiptPanel.java
 *
 * Created on 2012-feb-29, 13:59:44
 */
package imat;

import java.util.List;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author lisastenberg
 */
public class ReceiptPanel extends javax.swing.JPanel {
    IMatDataHandler dh = IMatDataHandler.getInstance();
    List<ShoppingItem> l;
    int sum = 0;
    
    /** Creates new form ReceiptPanel */
    public ReceiptPanel() {
        initComponents();
        
    }
    
    private void presentOrder() {
        ReceiptRowPanel p;
        ShoppingItem s;
            System.out.println("Nu skall den lägga till saker");
        for(int i = 0; i < l.size(); i++) {
            System.out.println("Storlek på l" + l.size());
            s = l.get(i);
            String product = s.getProduct().getName();
            String amount = "" + s.getAmount() + " st";
            String total = "" + s.getTotal() + " SEK";
            String price = "" + s.getTotal()/s.getAmount() + " SEK";
            
            p = new ReceiptRowPanel(product, amount + " * " + price
                    , total);
            
            insertPanel.add(p);
            
            sum += s.getTotal();
            }
        repaint();
        revalidate();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        thanksLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        insertPanel = new javax.swing.JPanel();
        sumPanel = new javax.swing.JPanel();
        sumLabel1 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ReceiptPanel.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(623, 429));

        jLabel1.setBackground(resourceMap.getColor("jLabel1.background")); // NOI18N
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jSeparator1.setBackground(resourceMap.getColor("jSeparator1.background")); // NOI18N
        jSeparator1.setName("jSeparator1"); // NOI18N

        thanksLabel.setBackground(resourceMap.getColor("thanksLabel.background")); // NOI18N
        thanksLabel.setText(resourceMap.getString("thanksLabel.text")); // NOI18N
        thanksLabel.setName("thanksLabel"); // NOI18N

        printButton.setIcon(resourceMap.getIcon("printButton.icon")); // NOI18N
        printButton.setText(resourceMap.getString("printButton.text")); // NOI18N
        printButton.setBorderPainted(false);
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        printButton.setName("printButton"); // NOI18N

        jScrollPane1.setBackground(resourceMap.getColor("jScrollPane1.background")); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        headerPanel.setBackground(resourceMap.getColor("headerPanel.background")); // NOI18N
        headerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, resourceMap.getColor("headerPanel.border.matteColor"))); // NOI18N
        headerPanel.setName("headerPanel"); // NOI18N
        headerPanel.setPreferredSize(new java.awt.Dimension(579, 100));

        productLabel.setBackground(resourceMap.getColor("productLabel.background")); // NOI18N
        productLabel.setFont(resourceMap.getFont("productLabel.font")); // NOI18N
        productLabel.setText(resourceMap.getString("productLabel.text")); // NOI18N
        productLabel.setName("productLabel"); // NOI18N

        amountLabel.setBackground(resourceMap.getColor("amountLabel.background")); // NOI18N
        amountLabel.setFont(resourceMap.getFont("amountLabel.font")); // NOI18N
        amountLabel.setText(resourceMap.getString("amountLabel.text")); // NOI18N
        amountLabel.setName("amountLabel"); // NOI18N

        totalLabel.setBackground(resourceMap.getColor("totalLabel.background")); // NOI18N
        totalLabel.setFont(resourceMap.getFont("totalLabel.font")); // NOI18N
        totalLabel.setText(resourceMap.getString("totalLabel.text")); // NOI18N
        totalLabel.setName("totalLabel"); // NOI18N

        org.jdesktop.layout.GroupLayout headerPanelLayout = new org.jdesktop.layout.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(productLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(177, 177, 177)
                .add(amountLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 175, Short.MAX_VALUE)
                .add(totalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(64, 64, 64))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(headerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(productLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .add(amountLabel)
                .add(totalLabel))
        );

        insertPanel.setBackground(resourceMap.getColor("insertPanel.background")); // NOI18N
        insertPanel.setName("insertPanel"); // NOI18N
        insertPanel.setLayout(new javax.swing.BoxLayout(insertPanel, javax.swing.BoxLayout.PAGE_AXIS));

        sumPanel.setBackground(resourceMap.getColor("sumPanel.background")); // NOI18N
        sumPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, resourceMap.getColor("sumPanel.border.matteColor"))); // NOI18N
        sumPanel.setName("sumPanel"); // NOI18N
        sumPanel.setPreferredSize(new java.awt.Dimension(579, 100));

        sumLabel1.setBackground(resourceMap.getColor("sumLabel1.background")); // NOI18N
        sumLabel1.setFont(resourceMap.getFont("sumLabel1.font")); // NOI18N
        sumLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sumLabel1.setText(resourceMap.getString("sumLabel1.text")); // NOI18N
        sumLabel1.setName("sumLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout sumPanelLayout = new org.jdesktop.layout.GroupLayout(sumPanel);
        sumPanel.setLayout(sumPanelLayout);
        sumPanelLayout.setHorizontalGroup(
            sumPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, sumPanelLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .add(sumLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        sumPanelLayout.setVerticalGroup(
            sumPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(sumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(sumLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, insertPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, headerPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, sumPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))
                .add(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(headerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(insertPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(sumPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, thanksLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .add(printButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(6, 6, 6)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(thanksLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(printButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel sumLabel1;
    private javax.swing.JPanel sumPanel;
    private javax.swing.JLabel thanksLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables

    public void updateView() {
        thanksLabel.setText("Tack för ditt köp " + dh.getCustomer().getFirstName()
                + ". Välkommen åter!");
        
        printButton.setIcon(new ImageIcon(getClass().getResource("resources/bilder/skrivut.png")));
        
        //insertPanel.setLayout(new BoxLayout());
        
        if(!dh.getOrders().isEmpty()) {
            int tmp = dh.getOrders().size();
            l = dh.getOrders().get(tmp-1).getItems();
            presentOrder();
        }
        
        sumLabel1.setText("Summa: " + sum + " SEK");
    }
}
