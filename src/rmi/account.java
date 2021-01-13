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
 * @author Lenovo
 */
public class account extends UnicastRemoteObject implements account_interface{
    private String username;
    private String password;
    
  ArrayList <account>acc=new ArrayList<>();
    
     public account() throws RemoteException{
    }

    public account(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void login(String username, String password) throws RemoteException {
      for (int i=0; i<acc.size();i++){
          if (acc.get(i).getUsername()==username){
              if(acc.get(i).getPassword()==password){
                  System.out.println("welcome");
              
              }else {
                  System.out.print("password is incorrect");
              }
          }else{
              System.out.print("username is incorrect");
          
          }
      
      
      }
    }

   
     
}
