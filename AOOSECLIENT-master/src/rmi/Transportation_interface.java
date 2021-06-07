/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;

/**
 *
 * @author hp
 */
public interface Transportation_interface extends Remote{
    public void viewTransportation();
    public void addtransportation(int id,String type, String location, int duration);
    public void deleteTransportaion(int id);
    public void updateTransportation(int id,String type, String location, int duration);
}
