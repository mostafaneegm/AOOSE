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
public class Book_Trip {
    private String TripName;
    private String day;
    private String month;
    private String year;

    public Book_Trip(String TripName, String day, String month, String year) {
        this.TripName = TripName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getTripName() {
        return TripName;
    }

    public void setTripName(String TripName) {
        this.TripName = TripName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void book(String location,String category){
    
    
    }
}
