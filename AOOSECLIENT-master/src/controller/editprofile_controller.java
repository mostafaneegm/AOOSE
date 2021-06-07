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
import rmi.user_interface;
import rmi_client.editprofile;

/**
 *
 * @author Lenovo
 */
public class editprofile_controller {
    editprofile guiedit;
    Registry r;

    public editprofile_controller(editprofile guiedit, Registry r) {
        this.guiedit = guiedit;
        this.r = r;
        guiedit.geteditbutton().addActionListener(new editprofileaction());
    }
 class editprofileaction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
              try {
                user_interface user=(user_interface)r.lookup("user");
                String type = guiedit.gettype().getText();
                String name=guiedit.getname().getText();
                String username=guiedit.getusername().getText();
                String password=guiedit.getpass().getText();
                String email=guiedit.getemail().getText();
                int phone = Integer.parseInt(guiedit.getphone().getText());
                int license = Integer.parseInt(guiedit.getlicense().getText());
                user.editprofile(type, username, name, email, phone, password, license);
                JFrame message=new JFrame();
                JOptionPane.showMessageDialog(message,"profile have been edit");
            } catch (RemoteException ex) {
                Logger.getLogger(signup_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(signup_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
 
 
 }
    
}
