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
public interface transporter_datamapper {
    public void insert (Transporter t);
    public void update (Transporter t);
    public void delete (Transporter t);
    public void view (ArrayList<Transporter> t);
    
    
}
