/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class TCMSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        
        try{
            Registry registry = LocateRegistry.getRegistry(1099);
        
        }catch(RemoteException ex){
            
            System.out.println("Exception occured");
            
        }
        
    }
    
}
