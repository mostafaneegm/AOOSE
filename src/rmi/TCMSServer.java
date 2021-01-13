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
        
        Trips t  = new Trips(1,"Safari",1500,"Sinai","Advernture");
        
        DB db = new DB();
        db.deleteTrip(1);
        
    }
    
}
