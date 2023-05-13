
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class VehicleRegistry {
    private HashMap<LicensePlate,String > owners;
    
    public VehicleRegistry(){
        owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!owners.containsKey(licensePlate)){
            owners.put(licensePlate, owner);
            return true;
        }
        return false; 
    }
    
    public String get(LicensePlate licensePlate){
        return this.owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            this.owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for(LicensePlate i : this.owners.keySet()){
            System.out.println(i);
        }
    }
    public void printOwners(){
        ArrayList<String> buffer = new ArrayList<String>();
        String toAdd = "";
        
        for(LicensePlate i : this. owners.keySet()){
            //System.out.println(this.db.get(i));
            toAdd = this.owners.get(i);
            if(!buffer.contains(toAdd)){
                buffer.add(toAdd);
            }
        }
        
        for(String j : buffer){
            System.out.println(j);
        }
    }
}
