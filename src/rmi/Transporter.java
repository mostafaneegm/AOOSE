/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.RemoteException;


/**
 *
 * @author hp
 */
public class Transporter extends user {
    int licensenumber;
    
    public Transporter () throws RemoteException{}
    public Transporter(int licensenumber) throws RemoteException{
        this.licensenumber = licensenumber;
    }

    public Transporter(int licensenumber, String name, String email, int phone) throws RemoteException {
        super(name, email, phone);
        this.licensenumber = licensenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    

    public int getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(int licensenumber) {
        this.licensenumber = licensenumber;
    }
    
    
}
