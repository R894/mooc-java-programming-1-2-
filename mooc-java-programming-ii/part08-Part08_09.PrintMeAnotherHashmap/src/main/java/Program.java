
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for(String key : hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
    
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book book : hashmap.values()){
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }
}
