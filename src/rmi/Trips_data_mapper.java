package rmi;


import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public abstract class Trips_data_mapper implements Trips_dataMapper {
      @Override
    public synchronized void insert (Trips t)
    {
        DB db=null;
        String sql="INSERT INTO 'Trips' ('ID','price','location', 'description','reservation_number') VALUES (?,?,?,?)";
       // PreparedStatement  dbStatement = db.prepareStatement(sql);
}
}