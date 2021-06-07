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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rmi.Trips_interface;
import rmi_client.deletetrip;

/**
 *
 * @author hp
 */
public class deletetrip_controller {
    deletetrip guidelete;
    Registry r;

    public deletetrip_controller(deletetrip guidelete, Registry r) {
        this.guidelete = guidelete;
        this.r = r;
        guidelete.getdeletebtn().addActionListener(new deletebtnaction());
    }
    class deletebtnaction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                Trips_interface t=(Trips_interface)r.lookup("trips");
              int id=  Integer.parseInt(guidelete.getDeleteFeild().getText());
                t.deleteTrip(id);

                JFrame frame=new JFrame();
                JOptionPane.showMessageDialog(frame,"Trip has been deleted");
            } catch (RemoteException ex) {
                Logger.getLogger(deletetrip_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(deletetrip_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
