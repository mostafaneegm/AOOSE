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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.FacadeInterface;
import rmi_client.getTripDates;

/**
 *
 * @author Lenovo
 */
public class getTripDates_controller {
      getTripDates guiDates;
    Registry r;

    public getTripDates_controller(getTripDates guiDates, Registry r) {
        this.guiDates = guiDates;
        this.r = r;
        
          guiDates.getjButton1().addActionListener(new tripsDateAction());
    }
class tripsDateAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           try{
           
            FacadeInterface  f= (FacadeInterface ) r.lookup("facad");
          String facade = f.getTripeData();
            guiDates.getjTextArea1().append("Book_Trips day"+"   "+" month"+"   "+"year"+"\n");
             guiDates.getjTextArea1().append(facade);
                 
           }catch(RemoteException | NotBoundException ex) {
                Logger.getLogger(getTripDates_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            
            
            
        }
    }
}
