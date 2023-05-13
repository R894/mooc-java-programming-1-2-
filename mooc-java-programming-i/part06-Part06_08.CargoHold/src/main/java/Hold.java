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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int currentWeight;
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.currentWeight=0;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(currentWeight + suitcase.totalWeight() <= maxWeight){
            suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }
    public String toString(){
        return suitcases.size()+ " suitcases ("+ currentWeight+" kg)";
    }
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
