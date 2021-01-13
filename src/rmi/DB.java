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
  
    
    
    
    ///////////////////////bookTrips/////////////
     public void BookTrip(Book_Trip book) {
        BookTrips.insertOne(Document.parse(gson.toJson(book)));
        System.out.println("trip have been booked");
     }
     

     
     public void updateBookin(Book_Trip book) throws RemoteException{
       Document doc = Document.parse(gson.toJson(book));
         BookTrips.replaceOne(Filters.eq("ID", book.getID()), doc);
         BookTrips.replaceOne(Filters.eq("day", book.getDay()), doc);
         BookTrips.replaceOne(Filters.eq("month", book.getMonth()), doc);
         BookTrips.replaceOne(Filters.eq("year", book.getYear()), doc);
         BookTrips.replaceOne(Filters.eq("tripName", book.getTripName()), doc);
          System.out.println("booking have been updated");
     }
     
     public void deleteBook(Book_Trip ID){
     BookTrips.deleteOne(Filters.eq("ID",ID));
     System.out.println("the booked trip have been deleted");
        }
   
     public ArrayList<Book_Trip> viewbookedTrips(){
        ArrayList<Book_Trip> book = new ArrayList();
        ArrayList<Document> docs = BookTrips.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++){
        book.add(gson.fromJson(docs.get(i).toJson(), Book_Trip.class));
        }
        return book;
    
}


    public ArrayList<Book_Trip> viewTripByID(int id){
        
        ArrayList<Book_Trip> book = new ArrayList();
        
        ArrayList<Document> docs = Trips.find(Filters.eq("BookTrips.ID", id)).into(new ArrayList<Document>());
        
        for (int i = 0; i < docs.size(); i++){
        book.add(gson.fromJson(docs.get(i).toJson(), Book_Trip.class));
                    }
        return book;
}

///////////////////////////////user//////////////////////
    
    


     
}
