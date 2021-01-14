/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import rmi.Book_trip_interface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import rmi.Book_Trip;
/**
 *
 * @author Lenovo
 */
public class TCMSServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException  {
       
        Book_trip_interface book =  new Book_Trip();
//        account_interface acc=new account();
//        FacadeInterface facadeinter =new BookTrip_facade();
//        SafariTripInterface safari=new SafariTrips();
//        Transportation_interface trans= new Transportation();
//        Trips_interface trips= new Trips();
//        user_interface user=new user();
        
          Registry registry = LocateRegistry.createRegistry(1099);
          
       registry.bind("bookTrips", book);
//       registry.bind("account", acc);
//       registry.bind("facade", facadeinter);
//       registry.bind("safa", safari);
//       registry.bind("transaction", trans);
//       registry.bind("trip", trips);
//       registry.bind("user", user);
       
            System.out.println("My classes are ready...");  
        
    }
    
}
