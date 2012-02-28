/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchPanel.java
 *
 * Created on 2012-feb-27, 18:02:47
 */
package imat;

import java.awt.event.*;
import java.util.List;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author lisastenberg
 */
public class SearchPanel extends javax.swing.JPanel {
    String s; 
    IMatDataHandler dh; 
    
    /** Creates new form SearchPanel */
    public SearchPanel() {
        dh = IMatDataHandler.getInstance();
        initComponents();
        s = searchField.getText();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(SearchPanel.class);
        searchPanel.setBackground(resourceMap.getColor("searchPanel.background")); // NOI18N
        searchPanel.setName("searchPanel"); // NOI18N
        searchPanel.setPreferredSize(new java.awt.Dimension(357, 77));

        searchField.setBackground(resourceMap.getColor("searchField.background")); // NOI18N
        searchField.setFont(resourceMap.getFont("searchField.font")); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setText(resourceMap.getString("searchField.text")); // NOI18N
        searchField.setActionCommand(resourceMap.getString("searchField.actionCommand")); // NOI18N
        searchField.setAlignmentX(0.0F);
        searchField.setAlignmentY(0.0F);
        searchField.setAutoscrolls(false);
        searchField.setBorder(new javax.swing.border.LineBorder(resourceMap.getColor("searchField.border.lineColor"), 1, true)); // NOI18N
        searchField.setName("searchField"); // NOI18N
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });

        jButton1.setBackground(resourceMap.getColor("jButton1.background")); // NOI18N
        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout searchPanelLayout = new org.jdesktop.layout.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, searchPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(searchField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchPanelLayout.createSequentialGroup()
                .add(8, 8, 8)
                .add(searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, searchField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
    searchField.setText("");
}//GEN-LAST:event_searchFieldFocusGained

private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
    searchField.setText(s);
    /*
    if(searchField.getText() == "") {
        searchField.setText(s);
    }*/
}//GEN-LAST:event_searchFieldFocusLost

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    List<Product> l = dh.findProducts(searchField.getText());
    //Anropa CategoryCard med l
}//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables

}
