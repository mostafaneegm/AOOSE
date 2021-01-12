/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author shrou
 */
public class user extends UnicastRemoteObject implements user_interface 
{
    int id;
    String name;
    String email;
    int phone;
  
    
   
    public user()throws RemoteException {
    }

    public user(int id, String name, String email, int phone)throws RemoteException {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public user(String name, String email, int phone)throws RemoteException {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName()throws RemoteException {
        return name;
    }

    public void setName(String name) throws RemoteException{
        this.name = name;
    }

    public String getEmail() throws RemoteException{
        return email;
    }

    public void setEmail(String email)throws RemoteException {
        this.email = email;
    }

    public int getPhone()throws RemoteException {
        return phone;
    }

    public void setPhone(int phone) throws RemoteException{
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
