
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
public class StorageFacility {
    HashMap<String, ArrayList<String>> storage;
    public StorageFacility(){
        storage = new HashMap<>();
    }
    public void add(String unit, String item){
        if(storage.containsKey(unit)){
            storage.get(unit).add(item);
        }else{
            storage.put(unit, new ArrayList<>());
            this.add(unit,item);
        }
    }
    public ArrayList<String> contents(String storageUnit){
        return storage.getOrDefault(storageUnit, new ArrayList<String>());
    }
    
    public void remove(String storageUnit, String item){
        storage.get(storageUnit).remove(item);
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for(String key : storage.keySet()){
            if(!storage.get(key).isEmpty()){
                list.add(key);
            }
        }
        return list;
    }
}
