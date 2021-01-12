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
    public Transporter(int licensenumber, int ID, String name, String email, String number) throws RemoteException{
     super(ID,name,email,number);
             this.licensenumber = licensenumber;             
    }

    public int getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(int licensenumber) {
        this.licensenumber = licensenumber;
    }
    public int getID() throws RemoteException {​​
return ID;
}​​



public void setID(int ID) throws RemoteException {​​
this.ID = ID;
}​​



public String getName()throws RemoteException {​​
return name;
}​​



public void setName(String name) throws RemoteException {​​
this.name = name;
}​​



public String getEmail() throws RemoteException {​​
return email;
}​​



public void setEmail(String email) throws RemoteException {​​
this.email = email;
}​​



public String getNumber() throws RemoteException {​​
return number;
}​​



public void setNumber(String number)throws RemoteException {​​
this.number = number;
}​​
    
}
