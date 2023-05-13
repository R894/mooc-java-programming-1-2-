/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Limi
 */
public class Stack {
    
    private ArrayList<String> array;
    
    public Stack(){
        this.array = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        if(array.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(String value){
        array.add(value);
    }
    public ArrayList<String> values(){
        return array;
    }
    public String take(){
        String take = array.get(array.size()-1);
        array.remove(take);
        return take;
    }
}
