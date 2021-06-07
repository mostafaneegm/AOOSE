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

import rmi.Transportation_interface;
import rmi_client.managetransportation;
/**
 *
 * @author hp
 */
public class transportationmanagment_controller {
     managetransportation gui;
     Registry r;

    public transportationmanagment_controller(managetransportation gui, Registry r) {
        this.gui = gui;
        this.r = r;
        
        gui.getjButton1TransportationManagerPOST().addActionListener(new getpostbtn());
        gui.getjButton2TransportationManagerEDITE().addActionListener(new geteditbtn());
    }
     class getpostbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Transportation_interface t = (Transportation_interface)r.lookup("transportation");
                
                int tid = Integer.parseInt(gui.getjTextField1TransportationManagerID().getText());
                int tdura = Integer.parseInt(gui.getjTextField4TransportationManagerDURA().getText());
                String tloc = gui.getjTextField3TransportationManagerLOC().getText();
                String ttype = gui.getjTextField2TransportationManagerTYPE().getText();
        
                t.addtransportation(tid, ttype, tloc, tdura);
                
                gui.getjLabel6TransportationManagerSUCESS().setText("Transportation POSTED");
                
            } catch (Exception e) {
            }
        }
    }
     
     
     class geteditbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
             try {
                Transportation_interface t = (Transportation_interface)r.lookup("transportation");
                
                int tid = Integer.parseInt(gui.getjTextField1TransportationManagerID().getText());
                int tdura = Integer.parseInt(gui.getjTextField4TransportationManagerDURA().getText());
                String tloc = gui.getjTextField3TransportationManagerLOC().getText();
                String ttype = gui.getjTextField2TransportationManagerTYPE().getText();
        
                t.updateTransportation(tid, ttype, tloc, tdura);
                
                gui.getjLabel6TransportationManagerSUCESS().setText("Transportation Updated");
                
            } catch (Exception e) {
            }
        }
    }
     
    
}
