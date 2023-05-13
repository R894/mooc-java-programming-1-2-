
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Warehouse {
    private Map<String, Integer> collection;
    private Map<String, Integer> stocke;
    public Warehouse(){
        collection = new HashMap<>();
        stocke = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        collection.put(product, price);
        stocke.put(product, stock);
        
    }
    public int price(String product){
        if (collection.containsKey(product)){
            return collection.get(product);
        }
        return -99;
    }
    public int stock(String product){
        if(collection.containsKey(product)){
            return stocke.get(product);
        }
        return 0;
    }
    public boolean take(String product){
        if(collection.containsKey(product)){
            int current = stocke.get(product);
            if(current > 0){
                stocke.put(product, current-1);
                return true;
            }
        }
        return false;
    }
    public Set<String> products(){
        return collection.keySet();
    }
}
