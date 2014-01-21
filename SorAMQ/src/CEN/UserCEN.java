package CEN;

import java.util.ArrayList;
import java.util.Hashtable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteve
 */
public abstract class UserCEN {
    
    protected int id;
    protected String name;
    protected String password;
    protected String address;
    
    /*public UserCEN(){
        this.id = -1;
        this.name = "";
        this.password = "";
        this.address = "";
    }*/

    public UserCEN(String name, String password, String address) {
        this.id = -1;
        this.name = name;
        this.password = password;
        this.address = address;
    }
    
    public void insert(){}
    
    public static ArrayList<UserCEN> getAllUsers(){
        ArrayList<Hashtable> values = CAD.UserCAD.getAll();
        ArrayList<UserCEN> all = new ArrayList<UserCEN>();
        for(Hashtable ht : values){
            UserCEN usr = new UserCEN((String) ht.get("name"), (String) ht.get("password"), (String) ht.get("address")) {};
            usr.id = Integer.parseInt(ht.get("id").toString());
            all.add(usr);
        }
        return all;
    }
    
    public static UserCEN getByID(int id){
        Hashtable ht = CAD.UserCAD.getByID(id);        
        
        UserCEN user=new UserCEN((String) ht.get("name"), (String) ht.get("password"), (String) ht.get("address")) {};                 
        user.id = Integer.parseInt(ht.get("id").toString());
        
        return user;
    }
    
    public void delete(){
        if(id != -1){
            CAD.UserCAD.delete(id);
            id = -1;
        }
    }
    
    public void update(String name, String password, String address){
        if(id != -1){
            CAD.UserCAD.updateName(id, name);
            CAD.UserCAD.updatePassword(id, password);
            CAD.UserCAD.updateAddress(id, address);
        }
    }
    
    public void updateName(String name){
        if(id != -1){
            CAD.UserCAD.updateName(id, name);
            this.name = name;
        }
    }
    
    public void updatePassword(String password){
        if(id != -1){
            CAD.UserCAD.updatePassword(id, password);
            this.password = password;
        }
    }
    
    public void updateAddress(String address){
        if(id != -1){
            CAD.UserCAD.updateAddress(id, address);
            this.address = address;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + password + " " + address;
    }
}