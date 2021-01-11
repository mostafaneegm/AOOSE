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
public interface BookTrip_dataMapper {
     public void insert (Book_Trip bt);
    public void update (Book_Trip bt);
    public void delete (Book_Trip bt);
    public void view (ArrayList<Book_Trip> bt);
}
