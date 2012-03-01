/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdressPanel.java
 *
 * Created on Feb 23, 2012, 9:21:51 PM
 */
package imat;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.swing.JButton;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Gustav
 */
public class AdressPanel extends javax.swing.JPanel {

    /** Creates new form AdressPanel */
    public AdressPanel() {
        initComponents();
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loadAdressInfo();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(AdressPanel.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setFont(resourceMap.getFont("Form.font")); // NOI18N
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));

        jTextField1.setFont(resourceMap.getFont("FirstNameTextField.font")); // NOI18N
        jTextField1.setForeground(resourceMap.getColor("FirstNameTextField.foreground")); // NOI18N
        jTextField1.setText(resourceMap.getString("FirstNameTextField.text")); // NOI18N
        jTextField1.setName("FirstNameTextField"); // NOI18N

        jTextField2.setFont(resourceMap.getFont("FirstNameTextField.font")); // NOI18N
        jTextField2.setForeground(resourceMap.getColor("LastNameTextField.foreground")); // NOI18N
        jTextField2.setText(resourceMap.getString("LastNameTextField.text")); // NOI18N
        jTextField2.setName("LastNameTextField"); // NOI18N

        jTextField3.setFont(resourceMap.getFont("FirstNameTextField.font")); // NOI18N
        jTextField3.setForeground(resourceMap.getColor("AdressTextField.foreground")); // NOI18N
        jTextField3.setText(resourceMap.getString("AdressTextField.text")); // NOI18N
        jTextField3.setName("AdressTextField"); // NOI18N

        jTextField5.setFont(resourceMap.getFont("FirstNameTextField.font")); // NOI18N
        jTextField5.setForeground(resourceMap.getColor("CityTextField.foreground")); // NOI18N
        jTextField5.setText(resourceMap.getString("CityTextField.text")); // NOI18N
        jTextField5.setName("CityTextField"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("Header.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("Header.text")); // NOI18N
        jLabel1.setName("Header"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("AdressLabel.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("FirstNameLabel.text")); // NOI18N
        jLabel3.setName("FirstNameLabel"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("AdressLabel.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("LastNameLabel.text")); // NOI18N
        jLabel4.setName("LastNameLabel"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("AdressLabel.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("AdressLabel.text")); // NOI18N
        jLabel5.setName("AdressLabel"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("AdressLabel.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("PostadressLabel.text")); // NOI18N
        jLabel6.setName("PostadressLabel"); // NOI18N

        jCheckBox1.setBackground(resourceMap.getColor("Save.background")); // NOI18N
        jCheckBox1.setFont(resourceMap.getFont("Save.font")); // NOI18N
        jCheckBox1.setForeground(resourceMap.getColor("Save.foreground")); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText(resourceMap.getString("Save.text")); // NOI18N
        jCheckBox1.setToolTipText(resourceMap.getString("Save.toolTipText")); // NOI18N
        jCheckBox1.setName("Save"); // NOI18N

        jButton1.setIcon(resourceMap.getIcon("ToPaymentOptionsButton.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("ToPaymentOptionsButton.text")); // NOI18N
        jButton1.setName("ToPaymentOptionsButton"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jFormattedTextField1.setBackground(resourceMap.getColor("jFormattedTextField1.background")); // NOI18N
        jFormattedTextField1.setForeground(resourceMap.getColor("jFormattedTextField1.foreground")); // NOI18N
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1.setText(resourceMap.getString("jFormattedTextField1.text")); // NOI18N
        jFormattedTextField1.setToolTipText(resourceMap.getString("jFormattedTextField1.toolTipText")); // NOI18N
        jFormattedTextField1.setFont(resourceMap.getFont("jFormattedTextField1.font")); // NOI18N
        jFormattedTextField1.setName("jFormattedTextField1"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setToolTipText(resourceMap.getString("jLabel8.toolTipText")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel9.setToolTipText(resourceMap.getString("jLabel9.toolTipText")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setForeground(resourceMap.getColor("jLabel10.foreground")); // NOI18N
        jLabel10.setToolTipText(resourceMap.getString("jLabel10.toolTipText")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setForeground(resourceMap.getColor("jLabel11.foreground")); // NOI18N
        jLabel11.setToolTipText(resourceMap.getString("jLabel11.toolTipText")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setForeground(resourceMap.getColor("jLabel12.foreground")); // NOI18N
        jLabel12.setToolTipText(resourceMap.getString("jLabel12.toolTipText")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N

        jFormattedTextField2.setForeground(resourceMap.getColor("jFormattedTextField2.foreground")); // NOI18N
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField2.setText(resourceMap.getString("jFormattedTextField2.text")); // NOI18N
        jFormattedTextField2.setFont(resourceMap.getFont("jFormattedTextField2.font")); // NOI18N
        jFormattedTextField2.setName("jFormattedTextField2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                            .addComponent(jTextField3)
                                            .addComponent(jFormattedTextField1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if (noErrors()){
    saveAdressInfo();
    }
    printErrorMessages();
    
}//GEN-LAST:event_jButton1MouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    public JButton getDoneButton() {
        return jButton1;
    }

    private void loadAdressInfo() {

        if (!IMatDataHandler.getInstance().getCustomer().getPhoneNumber().equals("")) {
            this.jFormattedTextField1.setText(IMatDataHandler.getInstance().getCustomer().getPhoneNumber());
        }
        if (!IMatDataHandler.getInstance().getCustomer().getPostAddress().equals("")) {
            this.jTextField5.setText(IMatDataHandler.getInstance().getCustomer().getPostAddress());
        }
        if (!IMatDataHandler.getInstance().getCustomer().getPostCode().equals("")) {
            this.jFormattedTextField2.setText(IMatDataHandler.getInstance().getCustomer().getPostCode());
        }
        if (!IMatDataHandler.getInstance().getCustomer().getAddress().equals("")) {
            this.jTextField3.setText(IMatDataHandler.getInstance().getCustomer().getAddress());
        }
        if (!IMatDataHandler.getInstance().getCustomer().getLastName().equals("")) {
            this.jTextField2.setText(IMatDataHandler.getInstance().getCustomer().getLastName());
        }
        if (!IMatDataHandler.getInstance().getCustomer().getFirstName().equals("")) {
            this.jTextField1.setText(IMatDataHandler.getInstance().getCustomer().getFirstName());
        }
    }

    private String[] errorMessages() {
        String[] errorMessages = new String[6];

        if (this.jTextField1.getText().equals("...") || this.jTextField1.getText().equals("")) {
            errorMessages[0] = "Ogiltigt förnamn.";
        }
        if (this.jTextField2.getText().equals("...") || this.jTextField2.getText().equals("")) {
            errorMessages[1] = "Ogiltig efternamn.";
        }
        if (this.jTextField3.getText().equals("Gatuadress...") || this.jTextField3.getText().equals("")) {
            errorMessages[2] = "Ogiltig gatuadress.";
        }
        
        Boolean adressNotNumberError = false;
        try{
            Integer.parseInt(this.jFormattedTextField2.getText());
        }catch (Exception e){
            adressNotNumberError = true;
        }
        if (this.jFormattedTextField2.getText().equals("Postnr...") || this.jFormattedTextField2.getText().equals("")) {
            errorMessages[3] = "Ogiltigt postnr.";
        }
        
        if (this.jTextField5.getText().equals("Ort...") || this.jTextField5.getText().equals("")) {
            errorMessages[4] = "Ogiltig postort.";
        }
        
        Boolean phoneNotNumberError = false;
        try{
            Integer.parseInt(this.jFormattedTextField1.getText());
        }catch (Exception e){
            phoneNotNumberError = true;
        }
        
        if (this.jFormattedTextField1.getText().equals("XXX-XXXXXX") || this.jFormattedTextField1.getText().equals("")
                || this.jFormattedTextField1.getText().length()!=9 || phoneNotNumberError) {
            errorMessages[5] = "Ogiltigt telefonnr.";
        }
        
        return errorMessages;
    }
    
    private void printErrorMessages(){
        String[] errorMessages = errorMessages();
        this.jLabel8.setText(errorMessages[0]);
        this.jLabel9.setText(errorMessages[1]);
        this.jLabel10.setText(errorMessages[2]);
        
        String errorThreeFour;
        if(errorMessages[3] == null)
         errorThreeFour = "";
        else
            errorThreeFour = errorMessages[3];
        if(errorMessages[4] == null)
         errorThreeFour = "";
        else
            errorThreeFour += errorMessages[4];        
        this.jLabel11.setText(errorThreeFour);
        
        this.jLabel12.setText(errorMessages[5]);
    }
    
    public Boolean noErrors(){
        String[] errorMessages = errorMessages();
        Boolean noErrors = true;
        for (int i= 0 ; i<errorMessages.length;i++){
            if(errorMessages[i] != null){
                noErrors = false;
            }
        }
        return noErrors;
    }

    private void saveAdressInfo() {
        IMatDataHandler.getInstance().getCustomer().setFirstName(this.jTextField1.getText());
        IMatDataHandler.getInstance().getCustomer().setLastName(this.jTextField2.getText());
        IMatDataHandler.getInstance().getCustomer().setAddress(this.jTextField3.getText());
        IMatDataHandler.getInstance().getCustomer().setPostCode(this.jFormattedTextField2.getText());
        IMatDataHandler.getInstance().getCustomer().setPostAddress(this.jTextField5.getText());
        IMatDataHandler.getInstance().getCustomer().setPhoneNumber(this.jFormattedTextField1.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
