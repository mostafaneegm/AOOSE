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
import rmi.account_interface;
import rmi_client.login;
import rmi_client.signup;

/**
 *
 * @author Lenovo
 */
public class login_controller {
       login guilogin;
    Registry r;

    public login_controller(login guilogin, Registry r) {
        this.guilogin = guilogin;
        this.r = r;
        
          guilogin.getloginbutton().addActionListener(new loginaction());
          guilogin.getsignupbutton().addActionListener(new signupbtn());
    }


class loginaction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                account_interface  ac= (account_interface ) r.lookup("account");
                String username=guilogin.getusernamejTextField().getText();
                String pass=guilogin.getpasswordjTextField().getText();
                ac.login(username, pass);
                System.out.print("welcome");
                
            } catch (RemoteException ex) {
                Logger.getLogger(login_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(login_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


}

class signupbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            signup s=new signup();
         s.setVisible(true);
        }



}



}
