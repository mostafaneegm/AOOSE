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
 * @author hp
 */
public interface Trips_interface extends Remote {
     public void post_trips(String category,int ID, int price, String location, int reservation_number     
    )throws RemoteException;

    public void edit_trips(int ID, int price, String location, int reservation_number,String category) throws RemoteException;
     public void ViewAllTrips ()throws RemoteException;
       public void deleteTrip (int ID)throws RemoteException;
       
       
    public  ArrayList<String> view_safari()throws RemoteException;
    public  ArrayList<String> view_religious()throws RemoteException;
    public  ArrayList<String> view_culture()throws RemoteException;
    public  ArrayList<String> view_boat()throws RemoteException;
   
}
