/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author hp
 */
public class proxy extends UnicastRemoteObject implements SafariTripInterface{
    
  private SafariTrips st;
  int ID;
  int ReservationsNumber;
  String category;
  int price;
  String location;
  String description;

    public proxy(int ID, int ReservationsNumber, String category, int price, String location, String description) {
        this.ID = ID;
        this.ReservationsNumber = ReservationsNumber;
        this.category = category;
        this.price = price;
        this.location = location;
        this.description = description;
    }
    public proxy () throws RemoteException{}

    @Override
    public void PostTrip(int ReservationsNumber, int ID, int price, String location, String description) throws RemoteException {
    if(st == null){
    st = new SafariTrips();
    }
    st.PostTrip(ReservationsNumber, ID, price, location, description);
    System.out.print("posted");
    }

    @Override
    public void EditPost(int ID, int price, String location, String view, int reservation_number) throws RemoteException {
        if(st == null){
        st = new SafariTrips();
       
    }
        st.edit_trips(ID, price, location, reservation_number);
       
        System.out.println("updated");
    }
    
  
  
  
}
