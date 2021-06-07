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
import rmi.Transportation_interface;


import rmi_client.deletetransportation;
/**
 *
 * @author hp
 */
public class deletetransportation_controller {
    deletetransportation guitransportdelete;
    Registry r;

    public deletetransportation_controller(deletetransportation guitransportdelete, Registry r) {
        this.guitransportdelete = guitransportdelete;
        this.r = r;
        
        guitransportdelete.getjButton1DELETEtransportation().addActionListener(new deletebtnn());
    }
    
    class deletebtnn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                Transportation_interface tt = (Transportation_interface)r.lookup("transportation");
                int id = Integer.parseInt(guitransportdelete.getjTextField1DeleteTransportationID().getText());
                tt.deleteTransportaion(id);
                
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Transportation has been deleted");

                
                
            } catch (Exception e) {
            }
        }
    
    }
    
    
    
    
}
