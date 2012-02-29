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
import java.util.LinkedList;
import java.util.Observer;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.ProductCategory;
import javax.swing.*;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 * The application's main frame.
 */
public class IMatView extends FrameView implements Observer{
    IMatDataHandler data = IMatDataHandler.getInstance();
    private static SingleFrameApplication app;
    AdressCard a;
    CategoryGridPanel c;
    DrinksGridPanel d;
    FruitGridPanel f;
    ValueObserver v;
    PaymentObserver p;
    

    CategoryCard cc;
    SidebarPanel s;
    SearchPanel sp;
    ProductListUpdater berry;
    ProductListUpdater bread;
    ProductListUpdater cabbage;
    ProductListUpdater citrus_fruit;
    ProductListUpdater cold_drinks;
    ProductListUpdater dairies;
    ProductListUpdater exotic_fruit;
    ProductListUpdater fish;
    ProductListUpdater flour_sugar_salt;
    ProductListUpdater fruit;
    ProductListUpdater herb;
    ProductListUpdater hot_drinks;
    ProductListUpdater meat;
    ProductListUpdater melons;
    ProductListUpdater nuts_and_seeds;
    ProductListUpdater pasta;
    ProductListUpdater pod;
    ProductListUpdater potato_rice;
    ProductListUpdater root_vegetable;
    ProductListUpdater sweet;
    ProductListUpdater vegetable_fruit;
            
    ProductListUpdater favorites;
    ProductListUpdater shoppingCartView;
    public IMatView(SingleFrameApplication app) {
        super(app);
        this.app = app;
        
        this.getFrame().setVisible(true);
        this.getFrame().setSize(new Dimension(1100, 700));
        this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        
        
        a = new AdressCard(this);
        c = new CategoryGridPanel(this);
        d = new DrinksGridPanel(this);
        f = new FruitGridPanel(this);
        v = new ValueObserver(this);
        p = new PaymentObserver(this);
        cc = new CategoryCard();
        s = new SidebarPanel(this);
        sp = new SearchPanel();
        berry = new ProductListUpdater(v.getPanelObserver(), ProductCategory.BERRY);
        bread = new ProductListUpdater(v.getPanelObserver(), ProductCategory.BREAD);
        cabbage = new ProductListUpdater(v.getPanelObserver(), ProductCategory.CABBAGE);
        citrus_fruit = new ProductListUpdater(v.getPanelObserver(), ProductCategory.CITRUS_FRUIT);
        cold_drinks = new ProductListUpdater(v.getPanelObserver(), ProductCategory.COLD_DRINKS);
        dairies = new ProductListUpdater(v.getPanelObserver(), ProductCategory.DAIRIES);
        exotic_fruit = new ProductListUpdater(v.getPanelObserver(), ProductCategory.EXOTIC_FRUIT);
        fish = new ProductListUpdater(v.getPanelObserver(), ProductCategory.FISH);
        flour_sugar_salt = new ProductListUpdater(v.getPanelObserver(), ProductCategory.FLOUR_SUGAR_SALT);
        fruit = new ProductListUpdater(v.getPanelObserver(), ProductCategory.FRUIT);
        herb = new ProductListUpdater(v.getPanelObserver(), ProductCategory.HERB);
        hot_drinks = new ProductListUpdater(v.getPanelObserver(), ProductCategory.HOT_DRINKS);
        meat = new ProductListUpdater(v.getPanelObserver(), ProductCategory.MEAT);
        melons = new ProductListUpdater(v.getPanelObserver(), ProductCategory.MELONS);
        nuts_and_seeds = new ProductListUpdater(v.getPanelObserver(), ProductCategory.NUTS_AND_SEEDS);
        pasta = new ProductListUpdater(v.getPanelObserver(), ProductCategory.PASTA);
        pod = new ProductListUpdater(v.getPanelObserver(), ProductCategory.POD);
        potato_rice = new ProductListUpdater(v.getPanelObserver(), ProductCategory.POTATO_RICE);
        root_vegetable = new ProductListUpdater(v.getPanelObserver(), ProductCategory.ROOT_VEGETABLE);
        sweet = new ProductListUpdater(v.getPanelObserver(), ProductCategory.SWEET);
        vegetable_fruit = new ProductListUpdater(v.getPanelObserver(), ProductCategory.VEGETABLE_FRUIT);
        
        shoppingCartView = new ProductListUpdater(v.getPanelObserver(), data.getShoppingCart());
        categorySmallPanel.setMaximumSize(new Dimension(500,500));
        categorySmallPanel.add(c.getPanel(), "category");
        categorySmallPanel.add(d.getPanel(), "drinks");
        categorySmallPanel.add(f.getPanel(), "fr");
        categorySmallPanel.add(a.getPanel(), "adress");
        categorySmallPanel.add(p.getPanel(), "betala");
        categorySmallPanel.add(shoppingCartView.getShoppingCartPanel(), "kundvagn");
        
        categorySmallPanel.add(berry.getProductPanel(), "berry");
        categorySmallPanel.add(bread.getProductPanel(), "bread");
        categorySmallPanel.add(cabbage.getProductPanel(), "cabbage");
        categorySmallPanel.add(citrus_fruit.getProductPanel(), "citrus_fruit");
        categorySmallPanel.add(cold_drinks.getProductPanel(), "cold_drinks");
        categorySmallPanel.add(dairies.getProductPanel(), "dairies");
        categorySmallPanel.add(exotic_fruit.getProductPanel(), "exotic_fruit");
        categorySmallPanel.add(fish.getProductPanel(), "fish");
        categorySmallPanel.add(flour_sugar_salt.getProductPanel(), "flour_sugar_salt");
        categorySmallPanel.add(fruit.getProductPanel(), "fruit");
        categorySmallPanel.add(herb.getProductPanel(), "herb");
        categorySmallPanel.add(hot_drinks.getProductPanel(), "hot_drinks");
        categorySmallPanel.add(meat.getProductPanel(), "meat");
        categorySmallPanel.add(melons.getProductPanel(), "melons");
        categorySmallPanel.add(nuts_and_seeds.getProductPanel(), "nuts_and_seeds");
        categorySmallPanel.add(pasta.getProductPanel(), "pasta");
        categorySmallPanel.add(pod.getProductPanel(), "pod");
        categorySmallPanel.add(potato_rice.getProductPanel(), "potato_rice");
        categorySmallPanel.add(root_vegetable.getProductPanel(), "root_vegetable");
        categorySmallPanel.add(sweet.getProductPanel(), "sweet");
        categorySmallPanel.add(vegetable_fruit.getProductPanel(), "vegetable_fruit");
        
        categoryPanel.add(s.getPanel(), "sidepanel");
        searchPanel.setLayout(new GridLayout(1, 1));
        searchPanel.add(sp, "search");
        backButton.setEnabled(false);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        valuePanel.setLayout(new BorderLayout());
        valuePanel.add(v.getPanel(), BorderLayout.CENTER);
        
        
    }
    
    /* Send the string of the panel you want the cardlayout to show
     * and this method fixes it for you.
     */
    String tempCard = "category";
    private void changePanel(String panel) {
        if(!tempCard.equals(panel)){
            prevList.addFirst(tempCard);
            backButton.setEnabled(true);
        }
        changePanelHelp(panel);
    }
    
    private void changePanelHelp(String panel) {
        
            tempCard=panel;
        CardLayout c = (CardLayout)(categorySmallPanel.getLayout());
        c.show(categorySmallPanel, panel);
    }
    
    public static SingleFrameApplication getApp() {
        return app;
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
        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        org.jdesktop.layout.GroupLayout logPanelLayout = new org.jdesktop.layout.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(logPanelLayout.createSequentialGroup()
                .add(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, logPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        backButton.setIcon(resourceMap.getIcon("backButton.icon")); // NOI18N
        backButton.setText(resourceMap.getString("backButton.text")); // NOI18N
        backButton.setActionCommand(resourceMap.getString("backButton.actionCommand")); // NOI18N
        backButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.setDisabledIcon(resourceMap.getIcon("backButton.disabledIcon")); // NOI18N
        backButton.setName("backButton"); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        categorySmallPanel.setBackground(null);
        categorySmallPanel.setForeground(resourceMap.getColor("categorySmallPanel.foreground")); // NOI18N
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
            .add(0, 65, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout categoryBigPanelLayout = new org.jdesktop.layout.GroupLayout(categoryBigPanel);
        categoryBigPanel.setLayout(categoryBigPanelLayout);
        categoryBigPanelLayout.setHorizontalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, categoryBigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, categoryBigPanelLayout.createSequentialGroup()
                        .add(backButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 129, Short.MAX_VALUE)
                        .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
                .addContainerGap())
        );
        categoryBigPanelLayout.setVerticalGroup(
            categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(categoryBigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(categoryBigPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(backButton)
                    .add(searchPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(categorySmallPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        featurePanel.add(categoryBigPanel, "card2");

        valuePanel.setBackground(resourceMap.getColor("valuePanel.background")); // NOI18N
        valuePanel.setName("valuePanel"); // NOI18N

        org.jdesktop.layout.GroupLayout valuePanelLayout = new org.jdesktop.layout.GroupLayout(valuePanel);
        valuePanel.setLayout(valuePanelLayout);
        valuePanelLayout.setHorizontalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 376, Short.MAX_VALUE)
        );
        valuePanelLayout.setVerticalGroup(
            valuePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 103, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(logPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(categoryPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(featurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(logPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(valuePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(categoryPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                        .add(20, 20, 20))
                    .add(featurePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)))
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

private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    String s = prevList.getFirst();
    if(s!=null) {
        prevList.removeFirst();
        if(prevList.isEmpty()){
            backButton.setEnabled(false);
        }
        changePanelHelp(s);
    }
}//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel categoryBigPanel;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JPanel categorySmallPanel;
    private javax.swing.JPanel featurePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel valuePanel;
    // End of variables declaration//GEN-END:variables

  

    private JDialog aboutBox;
    private LinkedList<String> prevList = new LinkedList<String>();
    public void update(Observable o, Object o1) {
        if(o1 instanceof String){
            String tmp = (String)o1;
            if(tmp != null) {
                changePanel(tmp);
            }
        }
    }
}
