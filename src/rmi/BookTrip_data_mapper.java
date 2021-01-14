/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class BookTrip_data_mapper implements BookTrip_dataMapper{
DB db= new DB();
    @Override
    public void insert(Book_Trip bt) {
       
       db.BookTrip(bt);
    }

    @Override
    public void update(Book_Trip bt) {
    try {
        db.updateBookin(bt);
    } catch (RemoteException ex) {
        Logger.getLogger(BookTrip_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void delete(Book_Trip bt) {
       db.deleteBook(bt);
    }

    @Override
    public void view(ArrayList<Book_Trip> bt) {
        db.viewbookedTrips();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
