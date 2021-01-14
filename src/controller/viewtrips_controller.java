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


import rmi_client.viewtrips;
import rmi.Trips_interface;

/**
 *
 * @author hp
 */
public class viewtrips_controller {
    
    viewtrips gui4;
    Registry r;

    public viewtrips_controller(viewtrips gui4, Registry r) {
        this.gui4 = gui4;
        this.r = r;
        gui4.getreligioustripsbutton().addActionListener(new getreligioustrip());
        gui4.getsafaritripbutton().addActionListener(new getsafaritrip());
        gui4.getculturetripsbutton().addActionListener(new getculturetrip());
        gui4.getboattripsbutton().addActionListener(new getboattrip());
        
    }
    class  getsafaritrip implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Trips_interface ti = (Trips_interface) r.lookup("safari");
                ArrayList<String> safaritrips = ti.view_safari();
                gui4.getselecttripstextarea().append("TripID"+"   "+"price"+"   "+"location"+"   "+"Describtion"+"\n"+"\n");
                int x = 0;
                int y = 4;
                while(y<safaritrips.size()){
                    for(int i=x; i<y; i++){
                

                gui4.getselecttripstextarea().append(safaritrips.get(i)+"     "+"      ");
                }
                gui4.getselecttripstextarea().append("\n");
                x=x+8;
                y=y+8;
            }
                
                
            } catch (Exception e) {
            }}}
            
            class  getreligioustrip implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Trips_interface ti = (Trips_interface) r.lookup("religious");
                ArrayList<String> religioustrips = ti.view_religious();
                gui4.getselecttripstextarea().append("TripID"+"   "+"price"+"   "+"location"+"   "+"Describtion"+"\n"+"\n");
                int x = 0;
                int y = 4;
                while(y<religioustrips.size()){
                    for(int i=x; i<y; i++){
                

                gui4.getselecttripstextarea().append(religioustrips.get(i)+"     "+"      ");
                }
                gui4.getselecttripstextarea().append("\n");
                x=x+8;
                y=y+8;
            }
                
                
            } catch (Exception e) {
            }}}
            
            class  getculturetrip implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Trips_interface ti = (Trips_interface) r.lookup("culture");
                ArrayList<String> culturetrips = ti.view_culture();
                gui4.getselecttripstextarea().append("TripID"+"   "+"price"+"   "+"location"+"   "+"Describtion"+"\n"+"\n");
                int x = 0;
                int y = 4;
                while(y<culturetrips.size()){
                    for(int i=x; i<y; i++){
                

                gui4.getselecttripstextarea().append(culturetrips.get(i)+"     "+"      ");
                }
                gui4.getselecttripstextarea().append("\n");
                x=x+8;
                y=y+8;
            }
                
                
            } catch (Exception e) {
            }}}
            class  getboattrip implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Trips_interface ti = (Trips_interface) r.lookup("culture");
                ArrayList<String> boatrips = ti.view_boat();
                gui4.getselecttripstextarea().append("TripID"+"   "+"price"+"   "+"location"+"   "+"Describtion"+"\n"+"\n");
                int x = 0;
                int y = 4;
                while(y<boatrips.size()){
                    for(int i=x; i<y; i++){
                

                gui4.getselecttripstextarea().append(boatrips.get(i)+"     "+"      ");
                }
                gui4.getselecttripstextarea().append("\n");
                x=x+8;
                y=y+8;
            }
                
                
            } catch (Exception e) {
            }}}
            
        }
        

        

        




    


