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
import java.rmi.registry.Registry;
import rmi.Book_trip_interface;
import rmi_client.book_trip;

/**
 *
 * @author Lenovo
 */
public class book_trip_controller {
    book_trip gui;
    Registry r;

    public book_trip_controller(book_trip gui, Registry r) {
        this.gui = gui;
        this.r = r;
         gui.getbook_jButton().addActionListener(new bookAction());
        
    }
    class bookAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            Book_trip_interface book=(Book_trip_interface) r.lookup("bookTrips");
             String tripName = gui.getTripName_jTextField().getText();
                String day= gui.getday_jTextField().getText();
                 String month= gui.getmonth_jTextField().getText();
                  String year= gui.getyear_jTextField().getText();
                  book.booking(tripName, day, month, year);
           gui.getJlabel6().setText("booked is done");
            }catch (RemoteException ex) {
                Logger.getLogger(book_trip_controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(book_trip_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }



}
}
