/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ValuePanel.java
 *
 * Created on 2012-feb-26, 15:44:04
 */
package imat;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lisastenberg
 */
public class ValuePanel extends JPanel {

    org.jdesktop.application.ResourceMap resourceMap;
            
    /** Creates new form ValuePanel */
    public ValuePanel() {
        initComponents();
        
        toShoppingCartLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        toShoppingCartLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public JLabel getLabel1() {
        return toShoppingCartLabel1;
    }
    
    public JLabel getLabel2() {
        return toShoppingCartLabel2;
    }
    
    public void setLabeltext() {
        /*TODO: toShoppingCartLabel1.setText("Till Kundvagnen (" + ANTALVAROR + 
        + " varor, " + SUMMA + " SEK )");
         */
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valuePanel = new javax.swing.JPanel();
        toShoppingCartLabel1 = new javax.swing.JLabel();
        toShoppingCartLabel2 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(ValuePanel.class);
        valuePanel.setBackground(resourceMap.getColor("valuePanel.background")); // NOI18N
        valuePanel.setName("valuePanel"); // NOI18N

        toShoppingCartLabel1.setFont(resourceMap.getFont("toShoppingCartLabel1.font")); // NOI18N
        toShoppingCartLabel1.setForeground(resourceMap.getColor("toShoppingCartLabel1.foreground")); // NOI18N
        toShoppingCartLabel1.setText(resourceMap.getString("toShoppingCartLabel1.text")); // NOI18N
        toShoppingCartLabel1.setName("toShoppingCartLabel1"); // NOI18N

        toShoppingCartLabel2.setFont(resourceMap.getFont("toShoppingCartLabel2.font")); // NOI18N
        toShoppingCartLabel2.setForeground(resourceMap.getColor("toShoppingCartLabel2.foreground")); // NOI18N
        toShoppingCartLabel2.setText(resourceMap.getString("toShoppingCartLabel2.text")); // NOI18N
        toShoppingCartLabel2.setName("toShoppingCartLabel2"); // NOI18N

        org.jdesktop.layout.GroupLayout valuePanelLayout = new org.jdesktop.layout.GroupLayout(valuePanel);
        valuePanel.setLayout(valuePanelLayout);
        valuePanelLayout.setHorizontalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, valuePanelLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .add(valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(toShoppingCartLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toShoppingCartLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        valuePanelLayout.setVerticalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(valuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(toShoppingCartLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(toShoppingCartLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel toShoppingCartLabel1;
    private javax.swing.JLabel toShoppingCartLabel2;
    private javax.swing.JPanel valuePanel;
    // End of variables declaration//GEN-END:variables
}
