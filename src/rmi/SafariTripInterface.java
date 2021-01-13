/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hp
 */
public interface SafariTripInterface extends Remote {
    
public void PostTrip(int ReservationsNumber, int ID, int price, String location, String description) throws RemoteException;
public void EditPost(int ID, int price, String location, String view, int reservation_number) throws RemoteException;


}
