/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Book_Trip {
    private String TripName;
    private String day;
    private String month;
    private String year;
    private int ID;

    public Book_Trip(String TripName, String day, String month, String year,int ID) throws RemoteException {
        this.TripName = TripName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.ID=ID;
    }
    public Book_Trip()throws RemoteException{}
    
ArrayList <Book_Trip> bt=new ArrayList<>();
    
public int getID() throws RemoteException{
        return ID;
    }

    public void setID(int ID) throws RemoteException{
        this.ID = ID;
    }

    public String getTripName() throws RemoteException{
        return TripName;
    }

    public void setTripName(String TripName) throws RemoteException{
        this.TripName = TripName;
    }

    public String getDay() throws RemoteException{
        return day;
    }

    public void setDay(String day) throws RemoteException{
        this.day = day;
    }

    public String getMonth() throws RemoteException{
        return month;
    }

    public void setMonth(String month) throws RemoteException{
        this.month = month;
    }

    public String getYear() throws RemoteException{
        return year;
    }

    public void setYear(String year) throws RemoteException{
        this.year = year;
    }
    
    public void booking(String tripname,String day,String month, String year,int ID) throws RemoteException{
        Book_Trip book=new Book_Trip();
            
        if(bt.isEmpty()){
             
            book.setID(ID);
            
        } else{
            int x=bt.size();
            book.setID(x+1);
             }
   
            book.setTripName(tripname);
            book.setDay(day);
            book.setMonth(month);
            book.setYear(year);
            book.setID(ID);
            bt.add(book);
    }
    
    public void deleteBooking(int ID)throws RemoteException{
    
    if(getID()==ID){
    bt.remove(ID);
    }else {
    System.out.println("ID is not found");
    
    }
    }
    
    public void viewbookedTrip(int ID)throws RemoteException{
    if(getID()==ID){
    getTripName();
    getDay();
    getMonth();
    getYear();
    
    }else{
    System.out.println("not found");
    }
    
    }
    public void editbooking(int ID,String tripname,String day,String month, String year)throws RemoteException{
    for (int i=0; i<bt.size();i++)
    {
    if (bt.get(i).getID()==ID){
    Book_Trip book= (Book_Trip)bt.get(i);
    book.setDay(day);
    book.setMonth(month);
    book.setTripName(tripname);
    book.setYear(year);
    bt.set(i,book);
    }else {
    System.out.println("ID not found sorry");
    }
    
    }
    }
    
    
}
