/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import se.chalmers.ait.dat215.project.ProductCategory;

/**
 *
 * @author e
 */
public class Test {
    
    public static void main(String args[] ){
        CategoryCard test = new CategoryCard(ProductCategory.BERRY);
        System.out.println("test" + test.products.get(2).getName());
    }
    
}
