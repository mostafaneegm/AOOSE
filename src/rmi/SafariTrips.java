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
            st.setReservationsNumber(ReservationsNumber);
           
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
            rt.setReservationsNumber(ReservationsNumber);
           
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
            ct.setReservationsNumber(ReservationsNumber);
           
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
            bt.setReservationsNumber(ReservationsNumber);
           
            t.add(bt);
        }
        
        
        
        
    }

    @Override
    public void EditPost(int ID, int price, String location, String view, int reservation_number) throws RemoteException {
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


   
 
   





   
}
