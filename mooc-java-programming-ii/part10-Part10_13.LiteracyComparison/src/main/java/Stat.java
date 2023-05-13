/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Stat {
    private String country;
    private int year;
    private String gender;
    private double literacy;
    public Stat(String country, int year, String gender, double literacy){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacy = literacy;
    }
    
    public Double getLiteracy(){
        return literacy;
    }
    
    public String toString(){
        return country + " ("+year+"),"+gender+", "+literacy;
    }
    
}
