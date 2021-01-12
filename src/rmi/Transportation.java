/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author hp
 */
public class Transportation extends user {
    private int ID;
    private String transporttype;
    private int transportduration;
    private String location;

    public Transportation(int ID, String transporttype, int transportduration, String location) {
        this.ID = ID;
        this.transporttype = transporttype;
        this.transportduration = transportduration;
        this.location = location;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
