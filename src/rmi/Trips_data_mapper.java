package rmi;


import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public  class Trips_data_mapper implements Trips_dataMapper {
    DB db = new DB();
    @Override
    public void insert(Trips t) {
        db.insertTrip(t);
    }

    @Override
    public void update(Trips t) {
        try {
            db.updateTrip(t);
        } catch (RemoteException ex) {
            Logger.getLogger(Trips_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Trips t) {
        db.deleteTrip(t);
    }

    @Override
    public void view(ArrayList<Trips> trip) {
        db.ViewAllTrips();
    }
     
}