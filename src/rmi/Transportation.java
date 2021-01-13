/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Transportation extends UnicastRemoteObject implements Transportation_interface {
    private int ID;
    private String transporttype;
    private int transportduration;
    private String transportlocation;

    public Transportation(int ID, String transporttype, int transportduration, String location) {
        this.ID = ID;
        this.transporttype = transporttype;
        this.transportduration = transportduration;
        this.transportlocation = location;
    }
        ArrayList <Transportation> t = new ArrayList <Transportation> ();
public Transportation () throws RemoteException{}

    public int getTransportID() {
        return ID;
    }

    public ArrayList<Transportation> getT() {
        return t;
    }

    public void setT(ArrayList<Transportation> t) {
        this.t = t;
    }

    public void setTransportID(int ID) {
        this.ID = ID;
    }

    public String getTransporttype() {
        return transporttype;
    }

    public void setTransporttype(String transporttype) {
        this.transporttype = transporttype;
    }

    public int getTransportduration() {
        return transportduration;
    }

    public void setTransportduration(int transportduration) {
        this.transportduration = transportduration;
    }

    public String getTransportLocation() {
        return transportlocation;
    }

    public void setTransportLocation(String location) {
        this.transportlocation = location;
    }

    @Override
    public void viewTransportation() {
          for(int i = 0; i<t.size(); i++){
System.out.println(t.get(i));
}
    }

    @Override
    public void addtransporter(int id, String type, String location, int duration) {
        try {
            Transportation tran=new Transportation();
            tran.setTransportID(id);
            tran.setTransportLocation(location);
            tran.setTransportduration(transportduration);
            tran.setTransporttype(transporttype);
            t.add(tran);
            
        } catch (RemoteException ex) {
            Logger.getLogger(Transportation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void deleteTransportaion(int id) {
        try {
            Transportation tran=new Transportation();
            if(tran.getTransportID()==id){
            t.remove(tran);
            
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Transportation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateTransportation(int id, String type, String location, int duration) {
        for(int i = 0;i<t.size();i++){
            if(t.get(i).getTransportID()== id){
                Transportation tran=( Transportation)t.get(i);
                tran.setTransportLocation(location);
                tran.setTransportduration(transportduration);
                tran.setTransporttype(transporttype);
                t.set(i, tran);
                
            }
        }
    }
    
    
}
