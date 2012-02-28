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
public class CategoryCard extends JPanel {
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
    private Dimension valueDimension = new Dimension(30,30);
    private Dimension panelDimension = new Dimension(274,55);
    private Dimension windowDimension = new Dimension(1100,800);
    
    private ProductCategory productCategory;
    GridBagConstraints constraints = new GridBagConstraints();
    
    private int widthRigid = 10;
    
    public CategoryCard(){
        productCategory = productCategory.BERRY;
        products = data.getProducts(productCategory);
        this.setLayout(new GridBagLayout());
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.setPreferredSize(windowDimension);
        fillPanels(); 
        // Add everything to this CategoryCard
        addAll(this);
        
    }
    
    public CategoryCard(ProductCategory productCategory){
        products = data.getProducts(productCategory);
        this.setLayout(new GridBagLayout());
        fillPanels();
        this.setPreferredSize(windowDimension);
        // Add everything to this CategoryCard
        addAll(this);
    }
    
    public void fillPanels(){
        
        // Create Panels in the left column
        leftColumn = new JPanel[products.size()];
        fillLeftColumn(leftColumn);
         // Create Panels in the right column
        rightColumn = new JPanel[products.size()];
        fillRightColumn();
    }

    private void fillLeftColumn(JPanel[] leftColumn) {
        addToFavorites = new JButton[products.size()];
        JLabel productIcon;
        
        for(int i = 0; i < products.size(); i++){
            leftColumn[i] = new JPanel();
            leftColumn[i].setLayout(new BoxLayout(leftColumn[i], BoxLayout.LINE_AXIS));
            productIcon = new JLabel(data.getImageIcon(products.get(i), iconDimension));
            productIcon.setBorder(BorderFactory.createLineBorder(Color.black, 1));
            leftColumn[i].add(Box.createRigidArea(new Dimension(widthRigid, 0)));
            leftColumn[i].add(productIcon);
            leftColumn[i].add(Box.createRigidArea(new Dimension(4,0)));
            JLabel productName = new JLabel(products.get(i).getName());
            leftColumn[i].add(productName);
            leftColumn[i].add(Box.createRigidArea(new Dimension(widthRigid,0)));
            leftColumn[i].add(Box.createHorizontalGlue());
            addToFavorites[i] = new JButton("favoriter"); // TODO , imageicon
            leftColumn[i].add(addToFavorites[i]);
            leftColumn[i].add(Box.createRigidArea(new Dimension(5, 0)));
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
            valueMinus[i] = new JButton("-");
            rightColumn[i].add(valueMinus[i]);
            value[i] = new JTextField("0");
            value[i].setMaximumSize(valueDimension);
            rightColumn[i].add(value[i]);
            valuePlus[i] = new JButton("+");
            rightColumn[i].add(valuePlus[i]);
            rightColumn[i].add(Box.createHorizontalGlue());
            addToChart[i] = new JButton("Köp");
            rightColumn[i].add(addToChart[i]);
            
        }
    }

    private void addAll(CategoryCard card) {
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.gridwidth = 7;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.SOUTHWEST;
        JLabel categoryName = new JLabel("" + productCategory.toString()); //TODO metod som hämtar svenskt namn
        JPanel upperPanel = new JPanel();
        upperPanel.add(categoryName);
        upperPanel.setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.red),
                   upperPanel.getBorder()));
        card.add(upperPanel, constraints);
        
        for(int i = 0; i < products.size(); i++){
        //int i = 0;
            constraints.gridy = i+2;
            constraints.gridwidth = 3;
            constraints.gridx = 0;
            card.add(Box.createRigidArea(new Dimension((widthRigid/2),0)));
            leftColumn[i].setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.red),
                   leftColumn[1].getBorder()));
            leftColumn[i].setMinimumSize(panelDimension);
            leftColumn[i].setPreferredSize(panelDimension);
            leftColumn[i].setMaximumSize(panelDimension);
            card.add(leftColumn[i], constraints);
            constraints.gridwidth = 1;
            constraints.gridx = 3;
            JLabel priceLabel = new JLabel("" + products.get(i).getPrice() + " " + products.get(i).getUnit());
            
            priceLabel.setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.red),
                   priceLabel.getBorder()));
            card.add(priceLabel, constraints);
            constraints.gridwidth = 3;
            constraints.gridx = 4;
            rightColumn[i].setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.red),
                   rightColumn[1].getBorder()));
            rightColumn[i].setMinimumSize(panelDimension);
            rightColumn[i].setPreferredSize(panelDimension);
            rightColumn[i].setMaximumSize(panelDimension);            
            card.add(rightColumn[i], constraints);           
        }
    }
   
}
    
    
    

