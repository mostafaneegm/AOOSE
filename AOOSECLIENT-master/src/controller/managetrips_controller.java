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

import rmi.Trips_interface;
import rmi_client.managetrip;
/**
 *
 * @author hp
 */
public class managetrips_controller {
    managetrip gui3;
    Registry r;

    public managetrips_controller(managetrip gui3, Registry r) {
        this.gui3 = gui3;
        this.r = r;
        gui3.getjButton1OISTTRIPsubmit().addActionListener(new getSubmitbtn());
        gui3.getjButton1EDITTRIPBTN().addActionListener(new EDITbtn());

    }
    class getSubmitbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Trips_interface p = (Trips_interface)r.lookup("trip");
                
                String rloc = gui3.getjTextField2POSTTRIPloc().getText();
                String rcate = gui3.getjTextField1POSTTRIPcate().getText();
                int rprice = Integer.parseInt(gui3.getjTextField3POSTTRIPprice().getText());
                int rResv = Integer.parseInt(gui3.getjTextField4POSTTRIPReservno().getText());
                int tid = Integer.parseInt(gui3.getjTextField1POSTTRIPID().getText());
                p.post_trips(rcate,tid , rprice, rloc, rResv);
                
                gui3.getjLabel1POSTTRIPLABELSUCESS().setText("TRIP POSTED");
                
            } catch (Exception e) {
            }
            
            
        }
    
        
    
    }
    
   
    class EDITbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            
             try {
                Trips_interface p = (Trips_interface)r.lookup("trip");
                
                String rloc = gui3.getjTextField2POSTTRIPloc().getText();
                String rcate = gui3.getjTextField1POSTTRIPcate().getText();
                int rprice = Integer.parseInt(gui3.getjTextField3POSTTRIPprice().getText());
                int rResv = Integer.parseInt(gui3.getjTextField4POSTTRIPReservno().getText());
                int tid = Integer.parseInt(gui3.getjTextField1POSTTRIPID().getText());
                p.edit_trips(tid, rprice, rloc, rResv, rcate);
                
                gui3.getjLabel1POSTTRIPLABELSUCESS().setText("TRIP edited");
                
            } catch (Exception e) {
            }
            
        }
    }
}
