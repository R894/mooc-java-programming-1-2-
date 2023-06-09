
import java.util.HashMap;


public class IOU {
    private HashMap<String, Double> owed;
    public IOU(){
        owed = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.owed.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.owed.getOrDefault(toWhom, 0.0);
    }
}
