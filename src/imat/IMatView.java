/*
 * IMatView.java
 */

/*
 * List<String> with categories?...
 */



package imat;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observable;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import se.chalmers.ait.dat215.project.ProductCategory;
import javax.swing.*;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

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
    ReceiptPanel r;
    HistoryObservable h;
    
    SidebarPanel s;
    SearchObserver sp;
    ProductListUpdater2 categorypanel;
    
    ShoppingCartObservable s2;
    public IMatView(SingleFrameApplication app) {
        super(app);
        this.app = app;
        
        this.getFrame().setVisible(true);
        this.getFrame().setSize(new Dimension(1100, 700));
        this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        Runtime.getRuntime().addShutdownHook(new Save());
        a = new AdressCard(this);
        c = new CategoryGridPanel(this);
        d = new DrinksGridPanel(this);
        f = new FruitGridPanel(this);
        v = new ValueObserver(this);
        p = new PaymentObserver(this);
        s = new SidebarPanel(this);
        sp = new SearchObserver(this);
        r = new ReceiptPanel();
        s2 = new ShoppingCartObservable(this);
        h = new HistoryObservable(this);

        categorypanel = new ProductListUpdater2();
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        categorySmallPanel.setMaximumSize(new Dimension(500,500));
        categorySmallPanel.add(c.getPanel(), "category");
        categorySmallPanel.add(d.getPanel(), "drinks");
        categorySmallPanel.add(f.getPanel(), "fr");
        categorySmallPanel.add(a.getPanel(), "adress");
        categorySmallPanel.add(p.getPanel(), "betala");
        categorySmallPanel.add(r, "kvitto");
        categorySmallPanel.add(s2.getPanel(), "kundvagn");
        categorySmallPanel.add(categorypanel.getProductPanel(), "categorypanel");
        categorySmallPanel.add(h.getPanel(), "historik");
        
        categoryPanel.add(s.getPanel(), "sidepanel");
        searchPanel.setLayout(new GridLayout(1, 1));
        searchPanel.add(sp.getPanel(), "search");
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
        if(panel.equals("kundvagn2")){
            s2.getSCList().updateView();
        }
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
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        changePanel("category");
    }//GEN-LAST:event_jLabel1MouseClicked

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
                if(tmp.equals("kundvagn")) {
                    s2.getSCList().updateView();
                } else if(tmp.equals("kvitto")){
                    r.updateView();
                }
                
                changePanel(tmp);
            }
        } else if(o1 instanceof Category){
            Category c = (Category)o1;
            if(c.getPanelType() == Category.PANELTYPE.CATEGORY){
                categorypanel.setView(c.getCategory());                
            } else if(c.getPanelType() == Category.PANELTYPE.ALFA) {
                List<Product> l = new LinkedList<Product>();
                            l = data.getProducts();
                Comparator<Product> a = new Comparator<Product>() {
                    public int compare(Product t, Product t1) {
                        String s = t.getName();
                        String s2 = t1.getName();
                        return s.compareTo(s2);
                    }
                };
                Collections.sort(l, a);
                categorypanel.setView(l,"A till Ö", "");
                
            } else if(c.getPanelType() == Category.PANELTYPE.FAVORITES) {
                List<Product> l = new LinkedList<Product>();
                l = data.favorites();
                categorypanel.setView(l, "Dina Favoriter", "");
            } else if(c.getPanelType() == Category.PANELTYPE.SEARCH) {
                List<Product> l = new LinkedList<Product>();
                l = data.findProducts(c.getCategoryName());
                categorypanel.setView(l, "Sökresultat: ", c.getCategoryName());
            } else if(c.getPanelType() == Category.PANELTYPE.ORDER) {
                List<ShoppingItem> l = new LinkedList();
                List<Product> p = new LinkedList();
                categorypanel.setView(l, c.getCategoryName());
            }
            changePanel("categorypanel");
            
        }
    }
}
