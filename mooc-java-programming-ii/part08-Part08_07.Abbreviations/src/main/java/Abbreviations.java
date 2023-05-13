
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
public class Abbreviations {
    private HashMap<String, String> abbs;
    public Abbreviations(){
        abbs = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbs.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return abbs.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        return abbs.get(abbreviation);
    }
}
