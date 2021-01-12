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
public class user extends UnicastRemoteObject implements user_interface {
    private int ID;
    private String name;
    private String email;
    private String number;

    public user()throws RemoteException {
    }
    public user(int ID, String name, String email, String number) throws RemoteException {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public user(String name, String email, String number)throws RemoteException  {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public int getID() throws RemoteException {
        return ID;
    }

    public void setID(int ID) throws RemoteException {
        this.ID = ID;
    }

    public String getName()throws RemoteException  {
        return name;
    }

    public void setName(String name) throws RemoteException {
        this.name = name;
    }

    public String getEmail() throws RemoteException {
        return email;
    }

    public void setEmail(String email) throws RemoteException {
        this.email = email;
    }

    public String getNumber() throws RemoteException {
        return number;
    }

    public void setNumber(String number)throws RemoteException  {
        this.number = number;
    }

    @Override
    public String toString() {
        return "user{" + "ID=" + ID + ", name=" + name + ", email=" + email + ", number=" + number + '}';
    }
    
    
}
