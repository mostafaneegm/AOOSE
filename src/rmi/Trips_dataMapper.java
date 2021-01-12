/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface Trips_dataMapper {
       public void insert (Trips t);
    public void update (Trips t);
    public void delete (Trips t);
    public void view (ArrayList<Trips> trip);
    
    
}
