/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory ch;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.setBalance(initialBalance);
        ch = new ChangeHistory();
        ch.add(super.getBalance());
        
    }
    public String history(){
        return ch.toString();
    }
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        ch.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount){
        double amt = super.takeFromWarehouse(amount);
        ch.add(super.getBalance());
        return amt;
    }
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+ch.toString());
        System.out.println("Largest amount of product: "+ ch.maxValue());
        System.out.println("Smallest amount of product: "+ ch.minValue());
        System.out.println("Average: " + ch.average());
    }
}
