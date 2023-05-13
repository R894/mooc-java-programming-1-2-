/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    
    }
    public void increaseQuantity(){
        qty++;
    }
    public int price(){
        return unitPrice*qty;
    }
    public String toString(){
        return product +": "+qty;
    }
    public String getName(){
        return product;
    }
    public int getQuality(){
        return qty;
    }
}
