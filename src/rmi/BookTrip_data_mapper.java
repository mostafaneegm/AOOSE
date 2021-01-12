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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    
//    @Override
//    public synchronized void insert(Book_Trip bt) throws DataMapperException {
//      try{
//       DB db= new DB();
//
//       
//            PreparedStatement ps= db.prepareStatement("INSERT INTO 'BookTrips' ('id','TripName','day', 'month','year') VALUES (?,?,?,?)");
//            ps.setInt(1, bt.getID());
//            ps.setString(2,bt.getTripName());
//            ps.setString(3, bt.getDay());
//            ps.setString(4, bt.getMonth());
//            ps.setString(5,bt.getYear());
//            
//      }catch (SQLException e){
//       throw new DataMapperException("Error ", e);
//      } catch (RemoteException ex) {
//            Logger.getLogger(BookTrip_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//    }
//
//    @Override
//    public void update(Book_Trip bt)  throws DataMapperException {
//        try{
//            DB db=null;
//            
//            PreparedStatement ps = db.prepareStatement("UPDATE `BookTrips` SET 'id'=?, `TripName`=?, `day`=?, `month`=? , `year`=? where `id`=?");
//          ps.setInt(1, bt.getID());
//            ps.setString(2,bt.getTripName());
//            ps.setString(3, bt.getDay());
//            ps.setString(4, bt.getMonth());
//            ps.setString(5,bt.getYear());;
//            
//        } catch(SQLException e)
//        {
//            throw new DataMapperException("Error occured reading Students from the data source.", e);
//
//        } catch (RemoteException ex) {
//            Logger.getLogger(BookTrip_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void delete(Book_Trip bt)  throws DataMapperException {
//      try{
//      DB db= new DB();
//      PreparedStatement ps = db.prepareStatement("DELETE FROM `BookTrips` where `id`=?");
//      ps.setInt(1, bt.getID());
//      ps.executeUpdate();
//      
//      }catch(SQLException e)
//        {
//            throw new DataMapperException("Error occured reading Students from the data source.", e);
//
//        } catch (RemoteException ex) {
//            Logger.getLogger(BookTrip_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @Override
//    public void view(ArrayList<Book_Trip> bt) throws DataMapperException  {
//       try{
//       DB db=new DB();
//       for(int i=0; i<bt.size();i++){
//        PreparedStatement ps = db.prepareStatement("VIEW FROM `BookTrips` where `id`=?");
//       ps.setInt(1, bt.get(i).getID());
//       ps.executeUpdate();
//       
//       }
//       }catch(SQLException e)
//        {
//            throw new DataMapperException("Error occured reading Students from the data source.", e);
//
//        } catch (RemoteException ex) {
//            Logger.getLogger(BookTrip_data_mapper.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
}
