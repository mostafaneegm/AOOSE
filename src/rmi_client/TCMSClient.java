/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.Book_trip_interface;

/**
 *
 * @author Lenovo
 */
public class TCMSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException {
        try {
            // TODO code application logic here
            Registry registry = LocateRegistry.getRegistry(1099);
            
               Book_trip_interface book = (Book_trip_interface) registry.lookup("bookTrips");
               
        } catch (RemoteException ex) {
            Logger.getLogger(TCMSClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
