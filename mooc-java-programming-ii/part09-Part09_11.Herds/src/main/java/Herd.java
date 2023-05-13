
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
public class Herd implements Movable {
    private ArrayList<Movable> organisms;
    public Herd(){
        organisms = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : organisms){
            organism.move(dx,dy);
        }
    }
    public void addToHerd(Movable movable){
        organisms.add(movable);
    }
    public String toString(){
        String stringToReturn="";
        for(Movable organism : organisms){
            stringToReturn +=organism+"\n";
        }
        return stringToReturn;
    }
    
}
