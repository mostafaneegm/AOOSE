/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author shrou
 */
public class user extends UnicastRemoteObject implements user_interface 
{
    int id;
    String name;
    String email;
    int phone;
    String userType;
  
    ArrayList <user> u=new ArrayList<>();
    ArrayList <account> acc=new ArrayList<>();
    public user()throws RemoteException {
    }

    public user(int id, String name, String email, int phone, String userType)throws RemoteException {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userType=userType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public user(String name, String email, int phone,String userType)throws RemoteException {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userType=userType;
        
    }

    public String getName()throws RemoteException {
        return name;
    }

    public void setName(String name) throws RemoteException{
        this.name = name;
    }

    public String getEmail() throws RemoteException{
        return email;
    }

    public void setEmail(String email)throws RemoteException {
        this.email = email;
    }

    public int getPhone()throws RemoteException {
        return phone;
    }

    public void setPhone(int phone) throws RemoteException{
        this.phone = phone;
    }

    public ArrayList<user> getU() {
        return u;
    }

    public void setU(ArrayList<user> u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }



    @Override
    public void editprofile(String type,String username,String name, String email, int phone, String password, int licensenumber) throws RemoteException {
 account ac=new account();
 
 if(ac.getUsername()==username && ac.getPassword()==password){
       
     for(int i = 0;i<u.size();i++){
          
                if(u.get(i).getUserType()== "transporter"){
                    
                    Transporter t =(Transporter)u.get(i);
                    t.setUserType(type);
                    t.setEmail(email);
                    t.setName(name);
                    t.setPhone(phone);
                    t.setLicensenumber(licensenumber);
                    ac.setPassword(password);
                    ac.setUsername(username);
               
                    u.set(i,t);
                    break;
                   
                }
//                if(u.get(i).getUserType()== "Client"){
//                    
//                    Client c =(Client)u.get(i);
//                    c.setUserType(type);
//                    c.setEmail(email);
//                    c.setName(name);
//                    c.setPhone(phone);
//                  
//                    ac.setPassword(password);
//                    ac.setUsername(username);
//               
//                    u.set(i,c);
//                    break;
//     
//     
//       }
//                if(u.get(i).getUserType()== "advertiser"){
//                    
//                    Advertiser a =(Advertiser)u.get(i);
//                    a.setUserType(type);
//                    a.setEmail(email);
//                    a.setName(name);
//                    a.setPhone(phone);
//                  
//                    ac.setPassword(password);
//                    ac.setUsername(username);
//               
//                    u.set(i,a);
//                    break;
//                
//                
// }
//                if(u.get(i).getUserType()== "contractor"){
//                    
//                    contractor c=(contractor)u.get(i);
//                    c.setUserType(type);
//                    c.setEmail(email);
//                    c.setName(name);
//                    c.setPhone(phone);
//                    c.setLicensenumber(licensenumber);
//                    ac.setPassword(password);
//                    ac.setUsername(username);
//               
//                    u.set(i,c);
//                    break;
//                }
        
        
    }}}

    @Override
    public void signup(String type,String username, String name, String email, int phone, String password,int licensenumber) throws RemoteException {
                   
//        Client c=new Client();
//        Contractor cont=new Contractor();
//        Advertiser adv=new Advertiser();
          account ac=new account();
          Transporter t=new Transporter();
          if(getUserType()=="transporter"){
          
            if(u.isEmpty()){
                t.setId(1);
            }
            else{
                int x=u.size();
                t.setId(x+1);
            }
            t.setEmail(email);
            t.setName(name);
            t.setPhone(phone);
            ac.setPassword(password);
            ac.setUsername(username);
            u.add(t);
            acc.add(ac);
            
            
            
          }
//           if(getUserType()=="client"){
//           if(u.isEmpty()){
//                c.setId(1);
//            }
//            else{
//                int x=u.size();
//                c.setId(x+1);
//            }
//            c.setEmail(email);
//            c.setName(name);
//            c.setPhone(phone);
//            ac.setPassword(password);
//            ac.setUsername(username);
//            u.add(c);
//            acc.add(ac);
//           
//          
//          }if(getUserType()=="contractor"){
//           if(u.isEmpty()){
//                cont.setId(1);
//            }
//            else{
//                int x=u.size();
//                cont.setId(x+1);
//            }
//            cont.setEmail(email);
//            cont.setName(name);
//            cont.setPhone(phone);
//            ac.setPassword(password);
//            ac.setUsername(username);
//            u.add(cont);
//            acc.add(ac);
//    }
//          if(getUserType()=="advertiser"){
//           if(u.isEmpty()){
//                a.setId(1);
//            }
//            else{
//                int x=u.size();
//                a.setId(x+1);
//            }
//            a.setEmail(email);
//            a.setName(name);
//            a.setPhone(phone);
//            ac.setPassword(password);
//            ac.setUsername(username);
//            u.add(a);
//            acc.add(ac);
//    }

}

    @Override
    public void deleteUser(int id) throws RemoteException {
       user us =new user ();
        if(us.getId()==id){
        u.remove(us);
        }
    }

    @Override
    public void viewuser() throws RemoteException {
        for(int i = 0; i<u.size(); i++){
            System.out.println(u.get(i));
}
    }
}
