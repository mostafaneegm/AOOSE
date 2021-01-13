/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface Trips_interface extends Remote {
     public void post_trips(String category, int price, String location, String view, int reservation_number     
    )throws RemoteException;

    public void edit_trips(int ID, int price, String location, String view, int reservation_number) throws RemoteException;
     public void ViewAllTrips (ArrayList<Trips> trip);
       public void deleteTrip (int ID);
}
