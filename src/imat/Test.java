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
public class Test {
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
    
    public Test(){
        
        
    }
    
    
    public JPanel fillCategoryScrollPane(ProductCategory productCategory){
        products = data.getProducts(productCategory);
        JPanel panel;
        fillPanels();
        panel = addAll();  
        System.out.println("" + panel.getComponentCount());
        return panel;
    }
    
    private void fillPanels(){
        
        // Create Panels in the left column
        leftColumn = new JPanel[products.size()];
        fillLeftColumn(leftColumn);
         // Create Panels in the right column
        rightColumn = new JPanel[products.size()];
        fillRightColumn(rightColumn);
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
    private void fillRightColumn(JPanel[] rightColumn) {
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

    private JPanel addAll() {
        JPanel[] listPanel = new JPanel[products.size()];
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        for(int i = 0; i < products.size(); i++){
        //int i = 0;
            listPanel[i] = new JPanel();
            listPanel[i].setPreferredSize(panelDimension);
            listPanel[i].setMaximumSize(panelDimension);
            listPanel[i].add(leftColumn[i]);
            JLabel priceLabel = new JLabel("" + products.get(i).getPrice() + " " + products.get(i).getUnit());
            listPanel[i].add(priceLabel);
            listPanel[i].add(rightColumn[i]);
            panel.add(listPanel[i]);
        }
        return panel;
    }
    
  
   
}
    
    
    

