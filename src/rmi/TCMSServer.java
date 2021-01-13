/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class TCMSServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        DB db=new DB();
    
        Book_Trip bk = new Book_Trip("boat", "12", "12","2020",1);
        db.BookTrip(bk);
      
    }
    
}
