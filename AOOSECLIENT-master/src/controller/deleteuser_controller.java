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
import rmi_client.deleteuser;

/**
 *
 * @author Lenovo
 */
public class deleteuser_controller {
    deleteuser guideleteuser;
    Registry r;

    public deleteuser_controller(deleteuser guideleteuser, Registry r) {
        this.guideleteuser = guideleteuser;
        this.r = r;
        guideleteuser.getdeletebtn().addActionListener(new deleteuserbtn());
    }
    class deleteuserbtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                user_interface user=(user_interface)r.lookup("user");
                int id=Integer.parseInt(guideleteuser.getidfeild().getText());
                user.deleteUser(id);
                
                JFrame message = new JFrame();
                JOptionPane.showMessageDialog(message,"user is deleted");
                
                
            } catch (RemoteException ex) {
                Logger.getLogger(deleteuser_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(deleteuser_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
