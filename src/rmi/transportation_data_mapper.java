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
    public void update(Transporter t) {
        db.updateTransportation(t);
    }

    @Override
    public void delete(Transporter t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void view(ArrayList<Transporter> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


     
}

