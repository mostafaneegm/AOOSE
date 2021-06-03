/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author Abdullah
 */
public class Notification implements Serializable{
    
    public int client_id;
    public int trip_id;
    public String msg;
    
    
    
}
