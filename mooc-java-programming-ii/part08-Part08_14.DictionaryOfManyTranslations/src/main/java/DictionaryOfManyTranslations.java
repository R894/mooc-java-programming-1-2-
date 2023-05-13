
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> list;
    public DictionaryOfManyTranslations(){
        list = new HashMap<>();
    }
    public void add(String word, String translation){
        if(list.containsKey(word)){
            list.get(word).add(translation);
        }else{
            list.put(word, new ArrayList<>());
            this.add(word, translation);
        }
    }
    public ArrayList<String> translate(String word){
        return list.getOrDefault(word, new ArrayList<>());
    }
    public void remove(String word){
        list.remove(word);
    }
}
