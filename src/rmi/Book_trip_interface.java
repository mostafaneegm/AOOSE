/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;

/**
 *
 * @author Lenovo
 */
public interface Book_trip_interface extends Remote {
    public void booking(String TripName, String day, String month, String year);
}
