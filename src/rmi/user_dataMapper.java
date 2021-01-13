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
public interface user_dataMapper extends Remote{
     void insert (user u)throws RemoteException;
    void update (user u)throws RemoteException;
    void delete (user u)throws RemoteException;
     void view(ArrayList<user>u)throws RemoteException;
    void get_user(user id)throws RemoteException;
    void login(String username, String password) throws RemoteException;
}
