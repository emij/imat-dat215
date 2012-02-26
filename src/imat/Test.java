/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class Test extends JPanel {
    private IMatDataHandler data = IMatDataHandler.getInstance();
    
    private JPanel[] leftColumn;
    private JPanel[] rightColumn;
    
    private JButton[] addToFavorites;
    private JButton[] valueMinus;
    private JButton[] valuePlus;
    private JButton[] addToChart;
    private JTextField[] value;
    
    private List<Product> products;
    
    private Dimension iconDimension = new Dimension(50,50);
    private Dimension panelDimension = new Dimension(60,60);
    private Dimension windowDimension = new Dimension(1100,800);
    
    private ProductCategory productCategory;
    GridBagConstraints constraints = new GridBagConstraints();
    
    public Test(){
        productCategory = productCategory.BERRY;
        products = data.getProducts(productCategory);
        fillPanels(this); 
        // Add everything to this CategoryCard
        addAll(this);
        
    }
    
    public Test(ProductCategory productCategory){
        products = data.getProducts(productCategory);
        this.setLayout(new GridBagLayout());
        fillPanels(this);
        this.setPreferredSize(windowDimension);
        // Add everything to this CategoryCard
        addAll(this);
    }
    
    public void fillPanels(Test card){
        this.setLayout(new BoxLayout(card, BoxLayout.PAGE_AXIS));
         this.setPreferredSize(windowDimension);
        
        // Create Panels in the left column
        leftColumn = new JPanel[products.size()];
        fillLeftColumn();
         // Create Panels in the right column
        rightColumn = new JPanel[products.size()];
        fillRightColumn();
    }

    private void fillLeftColumn() {
        addToFavorites = new JButton[products.size()];
        JLabel productIcon;
        
        for(int i = 0; i < products.size(); i++){
            leftColumn[i] = new JPanel();
            leftColumn[i].setLayout(new BoxLayout(leftColumn[i], BoxLayout.LINE_AXIS));
            productIcon = new JLabel(data.getImageIcon(products.get(i), iconDimension));
            productIcon.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            leftColumn[i].add(productIcon);
            leftColumn[i].add(Box.createRigidArea(new Dimension(4,0)));
            JLabel productName = new JLabel(products.get(i).getName());
            leftColumn[i].add(productName);
            leftColumn[i].add(Box.createRigidArea(new Dimension(5,0)));
            leftColumn[i].add(Box.createHorizontalGlue());
            addToFavorites[i] = new JButton("Lägg till i favoriter"); // TODO , imageicon
            leftColumn[i].add(addToFavorites[i]);
        }
    }
    private void fillRightColumn() {
        addToChart = new JButton[products.size()];
        valueMinus = new JButton[products.size()];
        valuePlus = new JButton[products.size()];
        value = new JTextField[products.size()];
        
        for(int i = 0; i < products.size(); i++){
            rightColumn[i] = new JPanel();
            rightColumn[i].setLayout(new BoxLayout(rightColumn[i], BoxLayout.LINE_AXIS));
            valueMinus[i] = new JButton("minus");
            rightColumn[i].add(valueMinus[i]);
            value[i] = new JTextField("0");
            rightColumn[i].add(value[i]);
            valuePlus[i] = new JButton("plus");
            rightColumn[i].add(valuePlus[i]);
            rightColumn[i].add(Box.createHorizontalGlue());
            addToChart[i] = new JButton("Lägg till i Kundvagn");
            rightColumn[i].add(addToChart[i]);
            rightColumn[i].setAlignmentX(Component.RIGHT_ALIGNMENT);
            
        }
    }

    private void addAll(Test card) {
        JLabel categoryName = new JLabel("" + productCategory.name());
        card.add(categoryName);
        JPanel[] innerPanel = new JPanel[products.size()];
        for(int i = 0; i < products.size(); i++){
        //int i = 0;
            innerPanel[i] = new JPanel();
            leftColumn[i].setAlignmentX(Component.LEFT_ALIGNMENT);
            innerPanel[i].add(leftColumn[i]);
            innerPanel[i].add(new JLabel("" + products.get(i).getPrice() + " " + products.get(i).getUnit()));
            innerPanel[i].add(rightColumn[i]);
            innerPanel[i].setAlignmentX(Component.LEFT_ALIGNMENT);
            innerPanel[i].setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.red),
                   innerPanel[i].getBorder()));
            card.setAlignmentX(Component.LEFT_ALIGNMENT);
            card.add(innerPanel[i]);
        }
    }
   
}
    
    
    

