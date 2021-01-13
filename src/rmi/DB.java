/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author Lenovo
 */

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

public class DB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> Trips;
    private MongoCollection<Document> BookTrips;
    private MongoCollection<Document> user;
    private MongoCollection<Document> transportation;
    private Gson gson = new Gson();



    public DB() {
      
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        client = new MongoClient();
        database = client.getDatabase("TCMS");
        Trips = database.getCollection("Trips"); 
        BookTrips = database.getCollection("BookTrips"); 
        user = database.getCollection("user"); 
        transportation = database.getCollection("transportation"); 
    }
  
     public void insertTrip(Trips t) {
        Trips.insertOne(Document.parse(gson.toJson(t)));
        System.out.println("Booking is inserted.");
    }
    public void deleteTrip(Trips ID){
        Trips.deleteOne(Filters.eq("ID",ID));
    }
    public void updateTrip(Trips ut) throws RemoteException {
        Document doc = Document.parse(gson.toJson(ut));
        Trips.replaceOne(Filters.eq("category", ut.getCategory()), doc);
        Trips.replaceOne(Filters.eq("Description", ut.getDescription()), doc);
        Trips.replaceOne(Filters.eq("location", ut.getLocation()), doc);
        Trips.replaceOne(Filters.eq("price", ut.getPrice()), doc);

    }
    public ArrayList<Trips> getTripbyID(int TripID) {
        ArrayList<Trips> result = new ArrayList();
        ArrayList<Document> docs = Trips.find(Filters.eq("Trip.ID", TripID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Trips.class));
        }
        return result;
    }
    public ArrayList<Trips> getTripbyCategory(String category) {
        ArrayList<Trips> result = new ArrayList();
        ArrayList<Document> docs = Trips.find(Filters.eq("Trip.category", category)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Trips.class));
        }
        return result;
    }
    public ArrayList<Trips> ViewAllTrips() {
        ArrayList<Trips> result = new ArrayList();
        ArrayList<Document> docs = Trips.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Trips.class));
        }
        return result;
    }
    
   /////////TRANSPORTATION///////

    //add
    public void insertTransportation(Transportation t) {
        transportation.insertOne(Document.parse(gson.toJson(t)));
        System.out.println("transportation is inserted.");
    }
    //get ID
    public ArrayList<Transportation> getTransbyID(int TransportationID) {
        ArrayList<Transportation> result = new ArrayList();
        ArrayList<Document> docs = transportation.find(Filters.eq("Transportation.ID", TransportationID)).into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Transportation.class));
        }
        return result;
    }
    //delete
      
    public void deleteTransportation(int ID){
        transportation.deleteOne(Filters.eq("ID",ID));
    }
    //update
    public void updateTransportation(Transportation tt) throws RemoteException {
        Document doc = Document.parse(gson.toJson(tt));
        Trips.replaceOne(Filters.eq("category", tt.getTransporttype()), doc);
        Trips.replaceOne(Filters.eq("Description", tt.getTransportduration()), doc);
        Trips.replaceOne(Filters.eq("location", tt.getTransportLocation()), doc);
    //view all
    }
    public ArrayList<Transportation> ViewAllTransportation() {
        ArrayList<Transportation> result = new ArrayList();
        ArrayList<Document> docs = transportation.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), Transportation.class));
        }
        return result;
    }
    
              
    

}
