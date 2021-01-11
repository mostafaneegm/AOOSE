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
 * @author Lenovo
 */
public class BookTrip_facade extends UnicastRemoteObject implements FacadeInterface{
    Book_Trip bt;
    
    public BookTrip_facade() throws RemoteException {
        bt= new Book_Trip("", "", "","");
    }
    
    
    
    @Override
    public void SetTripData(String TripName, String day, String month, String year)throws RemoteException {
       bt.setDay(day);
       bt.setMonth(month);
       bt.setTripName(TripName);
       bt.setYear(year);
    }
        @Override
    public String getTripeData() throws RemoteException{
        String dates=bt.getDay()+bt.getMonth()+bt.getTripName()+bt.getYear();
        return dates;
    }
}
