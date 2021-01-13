/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface transportation_datamapper {
    public void insert (Transportation t);
    public void update (Transportation t);
    public void delete (Transportation t);
    public void view (ArrayList<Transportation> t);
    
    
}
