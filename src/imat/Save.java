/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author e
 */
public class Save extends Thread {
    @Override
    public void run(){
        IMatDataHandler data = IMatDataHandler.getInstance();
        data.shutDown();
    }
}
