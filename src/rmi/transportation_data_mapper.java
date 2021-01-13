/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class transportation_data_mapper implements transportation_datamapper {
    

    DB db = new DB();

    @Override
    public void insert(Transportation t) {
        db.insertTransportation(t);
    }

    @Override
    public void update(Transportation t) {
        try {
            db.updateTransportation(t);
        } catch (RemoteException ex) {
            Logger.getLogger(transportation_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Transportation t) {
        db.deleteTransportation(t);
    }

    @Override
    public void view() {
        db.ViewAllTransportation();
    }


     
}

