/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rmi.user_interface;
import rmi_client.login;
import rmi_client.signup;

/**
 *
 * @author Lenovo
 */
public class signup_controller {
    signup guisignup;
    Registry r;

    public signup_controller(signup guisignup, Registry r) {
        this.guisignup = guisignup;
        this.r = r;
        
         guisignup.getsignupbutton().addActionListener(new signupAction());
          
         guisignup.getlogbutton().addActionListener(new loginAcction());
    }
    
    class signupAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                user_interface user=(user_interface)r.lookup("user");
                String type = guisignup.gettype().getText();
                String name=guisignup.getname().getText();
                String username=guisignup.getusername().getText();
                String password=guisignup.getpass().getText();
                String email=guisignup.getemail().getText();
                int phone = Integer.parseInt(guisignup.getphone().getText());
                int license = Integer.parseInt(guisignup.getlicense().getText());
                user.signup(type, username, name, email, phone, password, license);
                JFrame message=new JFrame();
                JOptionPane.showMessageDialog(message,"welcome");
            } catch (RemoteException ex) {
                Logger.getLogger(signup_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(signup_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        }
    
    
    
    }
    class loginAcction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         login l=new login();
         l.setVisible(true);
        }
         






}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
