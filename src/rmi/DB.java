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
    private MongoCollection<Document> transporter;
    private Gson gson = new Gson();



    public DB() {
      
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        client = new MongoClient();
        database = client.getDatabase("TCMS");
        Trips = database.getCollection("Trips"); 
        BookTrips = database.getCollection("BookTrips"); 
        user = database.getCollection("user"); 
        transporter = database.getCollection("Transporter"); 
    }
  
     public void insertBookTrip(Book s) {
        collection.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Student inserted.");
    }
    

}
