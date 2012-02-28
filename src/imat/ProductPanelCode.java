/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.awt.*;
import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class ProductPanelCode extends JPanel{
    private Dimension iconDimension = new Dimension(50,50);
    private Dimension valueDimension = new Dimension(30,30);
    private Dimension panelDimension = new Dimension(274,55);
    
    private IMatDataHandler data = IMatDataHandler.getInstance();
    JPanel leftPanel;
    JPanel rightPanel;
    
    JLabel productName;
    JButton addToFavorites;
    JLabel price;
    JButton valueMinus;
    JButton valuePlus;
    JButton addToChart;
    private JTextField value;
    
    private int widthRigid = 10;
    
    public ProductPanelCode(Product product){
        leftPanel(product);
        this.add(leftPanel);
        this.add(new JLabel("" + product.getPrice() + " " + product.getUnit()));
        rightPanel(product);
        this.add(rightPanel);
    
    }
    
    private void leftPanel(Product product) {
        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.LINE_AXIS));
        JLabel productPicture = new JLabel(data.getImageIcon(product, iconDimension));
        productName = new JLabel(product.getName());
        addToFavorites = new JButton("favoriter");
        leftPanel.add(Box.createRigidArea(new Dimension(widthRigid, 0)));
        leftPanel.add(productPicture);
        leftPanel.add(Box.createRigidArea(new Dimension(widthRigid/2, 0)));
        leftPanel.add(productName);
        leftPanel.add(Box.createHorizontalGlue());
        leftPanel.add(addToFavorites);
        leftPanel.add(Box.createRigidArea(new Dimension(widthRigid/2, 0)));
        leftPanel.setMinimumSize(panelDimension);
        leftPanel.setPreferredSize(panelDimension);
        leftPanel.setMaximumSize(panelDimension);
    }

    private void rightPanel(Product product) {
        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.LINE_AXIS));
        valueMinus = new JButton("-");
        value = new JTextField("0");
        value.setMaximumSize(valueDimension);
        valuePlus = new JButton("+");
        addToChart = new JButton("Köp");
        rightPanel.add(valueMinus);
        rightPanel.add(value);
        rightPanel.add(valuePlus);
        rightPanel.add(Box.createHorizontalGlue());
        rightPanel.add(addToChart);
        rightPanel.setMinimumSize(panelDimension);
        rightPanel.setPreferredSize(panelDimension);
        rightPanel.setMaximumSize(panelDimension);
    }    
}
