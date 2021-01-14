/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.rmi.RemoteException;
import org.junit.Test;
import rmi.Book_Trip;
import rmi.DB;

/**
 *
 * @author Lenovo
 */
public class booktrip {
      @Test
      public void testbooktrips() throws RemoteException{
          
           Book_Trip t  = new Book_Trip("Sahara", "Friday", "Jan", "2021",1);

        DB db = new DB();
        db.BookTrip(t);
   }
}
