/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Transportation extends user {
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
    
    
}
