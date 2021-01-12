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
 * @author hp
 */
public class SafariTrips extends Trips implements SafariTripInterface {
    private int ReservationsNumber;

    public SafariTrips(int ReservationsNumber, int ID, int price, String location, String description) throws RemoteException {
        super(ID, price, location, description);
        this.ReservationsNumber = ReservationsNumber;
    }
    public SafariTrips() throws RemoteException{}
    ArrayList<SafariTrips> st = new ArrayList<>();

    public int getReservationsNumber() throws RemoteException {
        return ReservationsNumber;
    }

    public void setReservationsNumber(int ReservationsNumber) throws RemoteException {
        this.ReservationsNumber = ReservationsNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() throws RemoteException {
        return price;
    }

    public void setPrice(int price) throws RemoteException {
        this.price = price;
    }

    public String getLocation() throws RemoteException {
        return location;
    }

    public void setLocation(String location) throws RemoteException {
        this.location = location;
    }

    public String getDescription()  {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Trips> getT() throws RemoteException {
        return t;
    }

    public void setT(ArrayList<Trips> t) throws RemoteException {
        this.t = t;
    }

    @Override
    public void PostTrip(int ReservationsNumber, int ID, int price, String location, String description) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EditPost(int ID, int price, String location, String view, int reservation_number) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 
   





   
}
