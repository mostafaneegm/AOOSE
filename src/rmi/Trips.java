/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Trips  extends UnicastRemoteObject implements Trips_interface  
{   
    int ID;
    String category;
    int price;
    String location;
    String description;
    
    ArrayList <Trips> t = new ArrayList <Trips> ();
    
  
    public Trips() throws RemoteException{
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trips(int ID, String category, int price, String location, String description) throws RemoteException{
        this.ID = ID;
        this.category = category;
        this.price = price;
        this.location = location;
        this.description = description;
        }

    public Trips(int ID, int price, String location,String description)throws RemoteException {
        this.ID = ID;
        this.category = category;
      this.description=description;
        this.price = price;
        this.location = location;
       
    }

   
  

    public int getPrice() throws RemoteException{
        return price;
    }

    public void setPrice(int price) throws RemoteException{
        this.price = price;
    }

    public String getLocation()throws RemoteException {
        return location;
    }

    public void setLocation(String location) throws RemoteException{
        this.location = location;
    }

 

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    

    public void setS(ArrayList<Trips> t) {
        this.t = t;
    }

    public ArrayList<Trips> getS() {
        return t;
    }

    @Override
    public void post_trips(String category, int price, String location, String view, int reservation_number) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit_trips(int ID, int price, String location, String view, int reservation_number) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}