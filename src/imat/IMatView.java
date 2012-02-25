/*
 * IMatView.java
 */

package imat;

import java.awt.*;
import java.util.Observable;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.ProductCategory;
import javax.swing.*;

/**
 * The application's main frame.
 */
public class IMatView extends FrameView implements Observer{

    CategoryGridPanel c;
    DrinksGridPanel d;
    FruitGridPanel f;
    SidebarPanel s;
    public IMatView(SingleFrameApplication app) {
        super(app);

        initComponents();
        categorySmallPanel.setMaximumSize(new Dimension(500,500));
        categorySmallPanel.add(test, "card1");
        /*c = new CategoryGridPanel(this);
        d = new DrinksGridPanel(this);
        f = new FruitGridPanel(this);
        s = new SidebarPanel(this);
        categorySmallPanel.setMaximumSize(new Dimension(500,500));
        categorySmallPanel.add(c.getPanel(), "card1");
        categorySmallPanel.add(d.getPanel(), "card2");
        categorySmallPanel.add(f.getPanel(), "card3");
        categoryPanel.add(s.getPanel(), "card1");

    */}
    
    /* Send the string of the panel you want the cardlayout to show
     * and this method fixes it for you.
     */
    public void changePanel(String panel) {
        CardLayout c = (CardLayout)(categorySmallPanel.getLayout());
        c.show(categorySmallPanel, panel);
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = IMatApp.getApplication().getMainFrame();
            aboutBox = new IMatAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        IMatApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logPanel = new javax.swing.JPanel();
        categoryPanel = new javax.swing.JPanel();
        featurePanel = new javax.swing.JPanel();
        categoryBigPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        categorySmallPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        valuePanel = new javax.swing.JPanel();
        toShoppingCartLabel1 = new javax.swing.JLabel();
        toShoppingCartLabel2 = new javax.swing.JLabel();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(imat.IMatApp.class).getContext().getResourceMap(IMatView.class);
        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        logPanel.setBackground(resourceMap.getColor("logPanel.background")); // NOI18N
        logPanel.setName("logPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout logPanelLayout = new org.jdesktop.layout.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 258, Short.MAX_VALUE)
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 120, Short.MAX_VALUE)
        );

        categoryPanel.setBackground(resourceMap.getColor("categoryPanel.background")); // NOI18N
        categoryPanel.setForeground(resourceMap.getColor("categoryPanel.foreground")); // NOI18N
        categoryPanel.setFont(resourceMap.getFont("categoryPanel.font")); // NOI18N
        categoryPanel.setName("categoryPanel"); // NOI18N
        categoryPanel.setLayout(new java.awt.CardLayout());

        featurePanel.setBackground(resourceMap.getColor("featurePanel.background")); // NOI18N
        featurePanel.setName("featurePanel"); // NOI18N
        featurePanel.setLayout(new java.awt.CardLayout());

        categoryBigPanel.setBackground(resourceMap.getColor("categoryBigPanel.background")); // NOI18N
        categoryBigPanel.setName("categoryBigPanel"); // NOI18N

        backButton.setText(resourceMap.getString("backButton.text")); // NOI18N
        backButton.setName("backButton"); // NOI18N

        categorySmallPanel.setBackground(null);
        categorySmallPanel.setForeground(resourceMap.getColor("categorySmallPanel.foreground")); // NOI18N
        categorySmallPanel.setMaximumSize(new java.awt.Dimension(200, 200));
        categorySmallPanel.setName("categorySmallPanel"); // NOI18N
        categorySmallPanel.setLayout(new java.awt.CardLayout());

        searchPanel.setBackground(resourceMap.getColor("searchPanel.background")); // NOI18N
        searchPanel.setName("searchPanel"); // NOI18N

        searchLabel.setFont(resourceMap.getFont("searchLabel.font")); // NOI18N
        searchLabel.setText(resourceMap.getString("searchLabel.text")); // NOI18N
        searchLabel.setName("searchLabel"); // NOI18N

        searchField.setBackground(resourceMap.getColor("searchField.background")); // NOI18N
        searchField.setFont(resourceMap.getFont("searchField.font")); // NOI18N
        searchField.setText(resourceMap.getString("searchField.text")); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("searchField.border.lineColor"))); // NOI18N
        searchField.setName("searchField"); // NOI18N
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
        });

        org.jdesktop.layout.GroupLayout searchPanelLayout = new org.jdesktop.layout.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(searchLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .add(1, 1, 1)
                .add(searchField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 267, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(searchPanelLayout.createSequentialGroup()
                .add(8, 8, 8)
                .add(searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(searchField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .add(searchLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9))
        );

        org.jdesktop.layout.GroupLayout categoryBigPanelLayout = new org.jdesktop.layout.GroupLayout(categoryBigPanel);
        categoryBigPanel.setLayout(categoryBigPanelLayout);
        categoryBigPanelLayout.setHorizontalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(categoryBigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
            .add(categoryBigPanelLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(backButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 149, Short.MAX_VALUE)
                .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29))
        );
        categoryBigPanelLayout.setVerticalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(categoryBigPanelLayout.createSequentialGroup()
                .add(categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(backButton))
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(31, 31, 31)
                .add(categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        featurePanel.add(categoryBigPanel, "card2");

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

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(categoryPanel, 0, 0, Short.MAX_VALUE)
                    .add(logPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(featurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(logPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(categoryPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                        .add(20, 20, 20))
                    .add(featurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
    searchField.setText("");
}//GEN-LAST:event_searchFieldFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel categoryBigPanel;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel categorySmallPanel;
    private javax.swing.JPanel featurePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel toShoppingCartLabel1;
    private javax.swing.JLabel toShoppingCartLabel2;
    private javax.swing.JPanel valuePanel;
    // End of variables declaration//GEN-END:variables

  

    private JDialog aboutBox;

    public void update(Observable o, Object o1) {
        if(o1 instanceof String){
            String tmp = (String)o1;
            changePanel(tmp);
        }
    }
}
