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
    String title;
    int pages;
    int pubYear;
    public Book(String title, int pages, int pubYear){
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    public String getName(){
        return title;
    }
    public int getPages(){
        return pages;
    }
    public int getYear(){
        return pubYear;
    }
    @Override
    public String toString() {
        return title + ", " + pages +" pages, "+ pubYear;
    }
}
