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
import java.rmi.server.UnicastRemoteObject;


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

    @Override
    public String toString() {
        return "Trips{" + "ID=" + ID + ", category=" + category + ", price=" + price + ", location=" + location + ", description=" + description + ", t=" + t + '}';
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
    public void post_trips(String category, int price, String location, String view, int reservation_number     
    ) throws RemoteException {
        SafariTrips st = new SafariTrips();
        ReligiousTrips rt = new ReligiousTrips();
        CultureTrips ct = new CultureTrips();
        BoatTrips bt = new BoatTrips();
        
        if(category =="SafariTrips")
        {
            if(t.isEmpty())
                st.setID(1);
            else{
                int q=t.size();
                st.setID(q+1);
            }
            st.setCategory(category);
            st.setDescription(description);
            st.setLocation(location);
            st.setPrice(price);
            st.setReservationsNumber(reservation_number);
           
            t.add(st);
        }
        else if (category =="ReligiousTrips")
        {
            if(t.isEmpty())
                rt.setID(1);
            else{
                int q=t.size();
                rt.setID(q+1);
            }
            rt.setCategory(category);
            rt.setDescription(description);
            rt.setLocation(location);
            rt.setPrice(price);
            rt.setReservationsNumber(reservation_number);
           
            t.add(rt);
        }
         else if (category =="CultureTrips")
        {
            if(t.isEmpty())
                ct.setID(1);
            else{
                int q=t.size();
                ct.setID(q+1);
            }
            ct.setCategory(category);
            ct.setDescription(description);
            ct.setLocation(location);
            ct.setPrice(price);
            ct.setReservationsNumber(reservation_number);
           
            t.add(ct);
        }
        else if (category =="BoatTrips")
        {
            if(t.isEmpty())
                bt.setID(1);
            else{
                int q=t.size();
                bt.setID(q+1);
            }
            bt.setCategory(category);
            bt.setDescription(description);
            bt.setLocation(location);
            bt.setPrice(price);
            bt.setReservationsNumber(reservation_number);
           
            t.add(bt);
        }
        
        
        
        
        
    }

    @Override
    public void edit_trips(int ID, int price, String location, String view, int reservation_number) throws RemoteException {
        for(int i = 0;i<t.size();i++){
            if(t.get(i).getID()== ID){
                if(t.get(i).getCategory()== "SafariTrips"){
                    
                    SafariTrips s =(SafariTrips)t.get(i);
                    s.setCategory(category);
                    s.setDescription(description);
                    s.setLocation(location);
                    s.setPrice(price);
                    s.setReservationsNumber(reservation_number);
                    
                    t.set(i,s);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "ReligiousTrips"){
                    
                    ReligiousTrips r =(ReligiousTrips)t.get(i);
                    r.setCategory(category);
                    r.setDescription(description);
                    r.setLocation(location);
                    r.setPrice(price);
                    r.setReservationsNumber(reservation_number);
                    
                    t.set(i,r);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "CultureTrips"){
                    
                    CultureTrips c =(CultureTrips)t.get(i);
                    c.setCategory(category);
                    c.setDescription(description);
                    c.setLocation(location);
                    c.setPrice(price);
                    c.setReservationsNumber(reservation_number);
                    
                    t.set(i,c);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "BoatTrips"){
                    
                    BoatTrips b =(BoatTrips)t.get(i);
                    b.setCategory(category);
                    b.setDescription(description);
                    b.setLocation(location);
                    b.setPrice(price);
                    b.setReservationsNumber(reservation_number);
                    
                    t.set(i,b);
                    break;
                   
                }
            
            }
        
        
        }
             System.out.print("can't find the trip");

    }
    
    
    public void search_trips(int ID, String category) throws RemoteException
    {
        for(int i = 0;i<t.size();i++){
            if(t.get(i).getID()== ID){
                if(t.get(i).getCategory()== "SafariTrips"){
                    
                    SafariTrips s =(SafariTrips)t.get(i);
                    s.getCategory();
                    s.getDescription();
                    s.getLocation();
                    s.getPrice();
                    s.getReservationsNumber();
                    
                    t.get(i);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "ReligiousTrips"){
                    
                    ReligiousTrips r =(ReligiousTrips)t.get(i);
                    r.getCategory();
                    r.getDescription();
                    r.getLocation();
                    r.getPrice();
                    r.getReservationsNumber();
                    
                    t.get(i);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "CultureTrips"){
                    
                    CultureTrips c =(CultureTrips)t.get(i);
                    c.getCategory();
                    c.getDescription();
                    c.getLocation();
                    c.getPrice();
                    c.getReservationsNumber();
                    
                    t.get(i);
                    break;
                   
                }
                else if(t.get(i).getCategory()== "BoatTrips"){
                    
                    BoatTrips b =(BoatTrips)t.get(i);
                    b.getCategory();
                    b.getDescription();
                    b.getLocation();
                    b.getPrice();
                    b.getReservationsNumber();
                    
                    t.get(i);
                    break;
                   
                }
            
            }
        
        }
             System.out.print("can't find the trip");
    
    }
    
public void remove_trips(int ID) throws RemoteException{

    for(int i = 0; i<t.size(); i++){
         if(t.get(i).getID()== ID){
                if(t.get(i).getCategory()== "SafariTrips"){
                    t.remove(i);
                    }
                else if(t.get(i).getCategory()== "ReligiousTrips")
                {
                    t.remove(i);
                
                }
                else if(t.get(i).getCategory()== "CultureTrips")
                {
                    t.remove(i);
                
                }
                else if(t.get(i).getCategory()== "BoatTrips")
                {
                    t.remove(i);
                
                }
    }
    }

}


}