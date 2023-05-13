
import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipe;
    public Pipe(){
        pipe = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    public T takeFromPipe(){
        if(pipe == null || pipe.isEmpty()){
            return null;
        }
        T toReturn = pipe.get(0);
        pipe.remove(0);
        return toReturn;
    }
    
    public boolean isInPipe(){
        if(pipe == null || pipe.isEmpty()){
            return false;
        }
        return true;
    }
    
}
