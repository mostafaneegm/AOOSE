/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */

    
public final class DataMapperException extends RuntimeException{
    

  private static final long serialVersionUID = 1L;

  
  public DataMapperException(final String message) {
    super(message);
  }

    DataMapperException(String error_occured_reading_Students_from_the_d, SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
