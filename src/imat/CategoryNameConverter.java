/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author e
 */
public class CategoryNameConverter {
    private IMatDataHandler data = IMatDataHandler.getInstance();
    private static CategoryNameConverter instance;
    
    private CategoryNameConverter(){
        
    }
    
    public static CategoryNameConverter getInstance(){
        if(instance == null) {
            instance = new CategoryNameConverter();
        }
        return instance;
    }
    
    public String convertCategoryName(ProductCategory pc){
        String str = pc.toString();
        if(str.equals("BERRY")){
            return "Bär";
        } else if (str.equals("BREAD")){
            return "Bröd";
        } else if (str.equals("CABBAGE")){
            return "Kål";
        } else if (str.equals("CITRUS_FRUIT")){
            return "Citrusfrukter";
        } else if (str.equals("COLD_DRINKS")){
            return "Kalla drycker";
        } else if (str.equals("DAIRIES")){
            return "Mjölkprodukter";
        } else if (str.equals("EXOTIC_FRUIT")){
            return "Exotiska frukter";
        } else if (str.equals("FISH")){
            return "Fisk";
        } else if (str.equals("FLOUR_SUGAR_SALT")){
            return "Mjöl, socker och salt";
        } else if (str.equals("FRUIT")){
            return "Frukt";
        } else if (str.equals("HERB")){
            return "Örterkryddor";
        } else if (str.equals("HOT_DRINKS")){
            return "Varma drycker";
        } else if (str.equals("MEAT")){
            return "Kött";
        } else if (str.equals("MELONS")){
            return "Meloner";
        } else if (str.equals("NUTS_AND_SEEDS")){
            return "Nötter och frön";
        } else if (str.equals("PASTA")){
            return "Pasta";
        } else if (str.equals("POD")){
            return "Baljväxter";
        } else if (str.equals("POTATO_RICE")){
            return "Potatis och ris";
        } else if (str.equals("ROOT_VEGETABLE")){
            return "Rotfrukter";
        } else if (str.equals("SWEET")){
            return "Sötsaker";
        } else if (str.equals("VEGETABLE_FRUIT")){
            return "Frukt och grönt";
        }
        return "Kategori";  
    }
}

