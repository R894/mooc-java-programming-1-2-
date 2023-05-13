
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Hideout<T> {
    ArrayList<T> element;
    
    public void putIntoHideout(T toHide){
        element = new ArrayList<>();
        element.add(toHide);
    }
    
    public T takeFromHideout(){
        if(element.isEmpty()){
            return null;
        }
        T toReturn = element.get(0);
        element.clear();
        return toReturn;
    }
    
    public boolean isInHideout(){
        if(element == null || element.isEmpty()){
            return false;
        }
        return true;
    }
}
