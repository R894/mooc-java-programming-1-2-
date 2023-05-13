/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Container {
    private int max;
    private int current;
    public Container(){
        max = 100;
        current =0;
    }
    
    public void add(int amount){
        if(current+amount >max){
            current=max;
        }
        if(current+amount <= max && amount >0){
            current +=amount;
        }
        
    }
    
    public void remove(int amount){
        
        current = current- amount;
        
        if(current<0){
            current=0;
        }
    }
    public int contains(){
        return current;
    }
    public String toString(){
        return current+"/100";
    }
}
