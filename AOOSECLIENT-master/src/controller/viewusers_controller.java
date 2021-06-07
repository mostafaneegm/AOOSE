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
import rmi.user_interface;
import rmi_client.viewusers;

/**
 *
 * @author Lenovo
 */
public class viewusers_controller {
    viewusers guiviewusers;
    Registry r;

    public viewusers_controller(viewusers guiviewusers, Registry r) {
        this.guiviewusers = guiviewusers;
        this.r = r;
        guiviewusers.getbuttn().addActionListener(new viewusersAction());
    }
    class viewusersAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                user_interface user =(user_interface) r.lookup("user");
               String x= user.viewuser();
              guiviewusers.getarea().append(x);
            } catch (RemoteException ex) {
                Logger.getLogger(viewusers_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(viewusers_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
    
    
    
    
    
    }
}
