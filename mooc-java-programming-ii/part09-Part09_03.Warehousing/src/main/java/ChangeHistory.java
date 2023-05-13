
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    public void add(double status){
        history.add(status);
    }
    public void clear(){
        history.clear();
    }
    public String toString(){
        return history.toString();
    }
    public double maxValue(){
        if(history.isEmpty()){
            return 0;
        }
        double biggest =0;
        for(double number : history){
            if(number > biggest){
                biggest=number;
            }
        }
        return biggest;
    }
    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double smallest= Double.MAX_VALUE;
        for(double number : history){
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum =0;
        for(double number : history){
            sum += number;
        }
        return sum/history.size();
    }

}
