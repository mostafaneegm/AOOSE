/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lenovo
 */
public interface FacadeInterface extends Remote {
     public void SetTripData(String TripName, String day, String month, String year )throws RemoteException;
   public String getTripeData()throws RemoteException;
}
