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
public class CultureTrips extends Trips{
    private int ReservationsNumber;

    public CultureTrips(int ReservationsNumber, int ID, int price, String location, String description) throws RemoteException {
        super(ID, price, location, description);
        this.ReservationsNumber = ReservationsNumber;
    }

    public CultureTrips() throws RemoteException {}

    public int getReservationsNumber() {
        return ReservationsNumber;
    }

    public void setReservationsNumber(int ReservationsNumber) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Trips> getT() {
        return t;
    }

    public void setT(ArrayList<Trips> t) {
        this.t = t;
    }

   
 
   





   
}
