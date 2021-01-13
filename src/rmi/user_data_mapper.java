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
 * @author Lenovo
 */
public  class user_data_mapper implements user_dataMapper{
        
    DB db=new DB();
    @Override
    public void insert(user u) throws RemoteException {
     db.signup(u);
    }

    @Override
    public void update(user u) throws RemoteException {
    db.editprofile(u);
    }
    

    @Override
    public void delete(user u) throws RemoteException {
      db.removeuser(u);
    }

  
    @Override
    public void get_user(user id) throws RemoteException {
      db.viewusersbyID(id);
     
    }

    @Override
    public void view(ArrayList<user> u) throws RemoteException {
       db.viewAllusers();
    }

    @Override
    public void login(String username,String password) throws RemoteException {
      db.signin(username, password);
    }
    
}
