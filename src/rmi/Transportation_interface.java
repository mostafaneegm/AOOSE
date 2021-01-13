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
public interface Transportation_interface {
    public void viewTransportation();
    public void addtransporter(int id,String type, String location, int duration);
    public void deleteTransportaion(int id);
    public void updateTransportation(int id,String type, String location, int duration);
}
