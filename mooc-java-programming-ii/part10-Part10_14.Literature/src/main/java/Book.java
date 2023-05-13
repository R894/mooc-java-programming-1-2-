/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Book {
    private String name;
    private int ageRec;
    public Book(String name, int ageRec){
        this.name = name;
        this.ageRec = ageRec;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return ageRec;
    }
    public String toString(){
        return name + " (Recommended for "+ageRec+" year olds or older)";
    }
}
