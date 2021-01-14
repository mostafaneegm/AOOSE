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
 * @author Lenovo
 */
public interface user_interface extends Remote {
  
    public void signup(String type,String username,String name, String email, int phone, String password,int licensenumber)throws RemoteException;
    public void editprofile(String type,String username,String name, String email, int phone, String password,int licensenumber)throws RemoteException;
    public void deleteUser(int id)throws RemoteException;
     public String viewuser()throws RemoteException;
    
}
