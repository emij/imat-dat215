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
    ValueObserver v;
    CategoryCard cc;
    SidebarPanel s;
    SearchPanel sp;
    public IMatView(SingleFrameApplication app) {
        super(app);

        this.getFrame().setVisible(true);
        this.getFrame().setSize(new Dimension(1000, 700));
        this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        
        c = new CategoryGridPanel(this);
        d = new DrinksGridPanel(this);
        f = new FruitGridPanel(this);
        v = new ValueObserver(this);
        cc = new CategoryCard();
        s = new SidebarPanel(this);
        sp = new SearchPanel();
        categorySmallPanel.setMaximumSize(new Dimension(500,500));
        categorySmallPanel.add(c.getPanel(), "category");
        categorySmallPanel.add(d.getPanel(), "drinks");
        categorySmallPanel.add(f.getPanel(), "fruit");
        categorySmallPanel.add(cc, "card4");
        categoryPanel.add(s.getPanel(), "sidepanel");
        searchPanel.setLayout(new GridLayout(1, 1));
        searchPanel.add(sp, "search");

        valuePanel.setLayout(new BorderLayout());
        valuePanel.add(v.getPanel(), BorderLayout.CENTER);
    }
    
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
        valuePanel = new javax.swing.JPanel();

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

        org.jdesktop.layout.GroupLayout searchPanelLayout = new org.jdesktop.layout.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 357, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
<<<<<<< HEAD
            .add(searchPanelLayout.createSequentialGroup()
                .add(8, 8, 8)
                .add(searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(searchField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .add(searchLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10))
=======
            .add(0, 65, Short.MAX_VALUE)
>>>>>>> Startframe fixad
        );

        org.jdesktop.layout.GroupLayout categoryBigPanelLayout = new org.jdesktop.layout.GroupLayout(categoryBigPanel);
        categoryBigPanel.setLayout(categoryBigPanelLayout);
        categoryBigPanelLayout.setHorizontalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(categoryBigPanelLayout.createSequentialGroup()
                .add(categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(backButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 200, Short.MAX_VALUE)
                        .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        categoryBigPanelLayout.setVerticalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(categoryBigPanelLayout.createSequentialGroup()
                .add(34, 34, 34)
                .add(categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
<<<<<<< HEAD
                    .add(backButton)
                    .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
=======
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .add(57, 57, 57)
                        .add(backButton))
                    .add(categoryBigPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(31, 31, 31)
>>>>>>> Startframe fixad
                .add(categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        featurePanel.add(categoryBigPanel, "card2");

        valuePanel.setBackground(resourceMap.getColor("valuePanel.background")); // NOI18N
        valuePanel.setName("valuePanel"); // NOI18N

        org.jdesktop.layout.GroupLayout valuePanelLayout = new org.jdesktop.layout.GroupLayout(valuePanel);
        valuePanel.setLayout(valuePanelLayout);
        valuePanelLayout.setHorizontalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 524, Short.MAX_VALUE)
        );
        valuePanelLayout.setVerticalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 132, Short.MAX_VALUE)
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
                    .add(featurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel categoryBigPanel;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel categorySmallPanel;
    private javax.swing.JPanel featurePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel searchPanel;
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
