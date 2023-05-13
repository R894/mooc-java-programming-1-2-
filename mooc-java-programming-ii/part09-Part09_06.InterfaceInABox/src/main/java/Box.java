
import java.util.ArrayList;


public class Box implements Packable {
    private double maxCapacity;
    private double currentCap;
    private ArrayList<Packable> packables;
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double currWeight =0;
        for(Packable packable : packables){
            currWeight += packable.weight();
        }
        return currWeight;
    }
    public void add(Packable packable){
        if(this.weight() + packable.weight() <= this.maxCapacity){
            packables.add(packable);
        }
        
    }
    public String toString(){
        return "Box: "+packables.size() +" items, total weight "+ this.weight() +" kg";
    }
}
