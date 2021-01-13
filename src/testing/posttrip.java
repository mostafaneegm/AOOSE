/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import rmi.Trips;
import java.rmi.RemoteException;
import java.util.ArrayList;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hp
 */
public class posttrip {
    
    @Test
    public void testposttrips() throws RemoteException{
    
    Trips t = new Trips();
    t.post_trips("safari", 2000, "Sinai", 10);
    assertNotNull(t);
    
    
    }
    
}
