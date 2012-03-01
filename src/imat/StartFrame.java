/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StartFrame.java
 *
 * Created on 2012-feb-26, 22:28:00
 */
package imat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * @author lisastenberg
 */
public class StartFrame extends javax.swing.JFrame implements ActionListener {
    private SingleFrameApplication app;
    JFrame f; 

    /** Creates new form StartFrame */
    public StartFrame(SingleFrameApplication app) {
        this.app = app;
        initComponents();
        
        this.setSize(new Dimension(1000, 700));
        goDirectlyButton.addActionListener(this);
        helpButton.addActionListener(this);
        
        goDirectlyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        helpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
        welcomePanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstTimeLabel = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        goDirectlyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(StartFrame.class);
        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        welcomePanel.setName("welcomePanel"); // NOI18N

        welcomeLabel.setFont(resourceMap.getFont("welcomeLabel.font")); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setIcon(resourceMap.getIcon("welcomeLabel.icon")); // NOI18N
        welcomeLabel.setText(resourceMap.getString("welcomeLabel.text")); // NOI18N
        welcomeLabel.setName("welcomeLabel"); // NOI18N

        org.jdesktop.layout.GroupLayout welcomePanelLayout = new org.jdesktop.layout.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(welcomeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(welcomeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        firstTimeLabel.setFont(resourceMap.getFont("firstTimeLabel.font")); // NOI18N
        firstTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstTimeLabel.setIcon(resourceMap.getIcon("firstTimeLabel.icon")); // NOI18N
        firstTimeLabel.setText(resourceMap.getString("firstTimeLabel.text")); // NOI18N
        firstTimeLabel.setName("firstTimeLabel"); // NOI18N

        helpButton.setIcon(resourceMap.getIcon("helpButton.icon")); // NOI18N
        helpButton.setText(resourceMap.getString("helpButton.text")); // NOI18N
        helpButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        helpButton.setBorderPainted(false);
        helpButton.setName("helpButton"); // NOI18N

        goDirectlyButton.setIcon(resourceMap.getIcon("goDirectlyButton.icon")); // NOI18N
        goDirectlyButton.setText(resourceMap.getString("goDirectlyButton.text")); // NOI18N
        goDirectlyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        goDirectlyButton.setBorderPainted(false);
        goDirectlyButton.setName("goDirectlyButton"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(helpButton)
                    .add(goDirectlyButton)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, firstTimeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(firstTimeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(helpButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(goDirectlyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(103, 103, 103)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(welcomePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(82, 82, 82)
                .add(welcomePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstTimeLabel;
    private javax.swing.JButton goDirectlyButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == helpButton) {
            new HelpFrame(app,this);
        } else if(ae.getSource() == goDirectlyButton) {
            setVisible(false);
            new IMatView(app);
        }
    }
}
