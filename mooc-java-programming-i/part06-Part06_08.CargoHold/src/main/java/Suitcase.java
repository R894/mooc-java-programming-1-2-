/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private int currentWeight=0;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight){
        this.maxWeight=maxWeight;
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        if((item.getWeight()+currentWeight) <= maxWeight){
            items.add(item);
            currentWeight += item.getWeight();
        }
    }
        
        
    
    public String toString(){
        if(items.size() ==0){
            return "no items (0 kg)";
        }
        if(items.size() ==1){
            return items.size() +" item ("+currentWeight+" kg)";
        }
        return items.size() +" items ("+currentWeight+" kg)";
    }
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        return currentWeight;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item currentHeaviest = items.get(0);
        for(Item item:items){
            if(item.getWeight() > currentHeaviest.getWeight()){
                currentHeaviest = item;
            }
        }
        return currentHeaviest;
    }
}
