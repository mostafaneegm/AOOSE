/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

import rmi.FacadeInterface;
import rmi_client.manageTripDate;


/**
 *
 * @author Lenovo
 */
public class setdate_controller {
     manageTripDate guiSetDate;
    Registry r;

    public setdate_controller(manageTripDate guiSetDate, Registry r) {
        this.guiSetDate = guiSetDate;
        this.r = r;
           guiSetDate.getset_jButton().addActionListener(new setdateAction());
    }
    
    class setdateAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            FacadeInterface f=(FacadeInterface) r.lookup("facade");
             String tripName = guiSetDate.getTripName_jTextField().getText();
                String day= guiSetDate.getday_jTextField().getText();
                 String month= guiSetDate.getmonth_jTextField().getText();
                  String year= guiSetDate.getyear_jTextField().getText();
                  f.SetTripData(tripName, day, month, year);
           guiSetDate.getJlabel().setText("date have been set");
            }catch (RemoteException ex) {
                Logger.getLogger(setdate_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(setdate_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    
    
