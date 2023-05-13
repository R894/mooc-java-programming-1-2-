
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> map;
    public ShoppingCart(){
        map = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(map.containsKey(product)){
            map.get(product).increaseQuantity();
            
        }else{
            map.put(product, new Item(product, 1, price));
        }
        
    }
    public int price(){
        int price =0;
        for(Item item : map.values()){
            price += item.price();
        }
        return price;
    }
    public void print(){
        for(Item item : map.values()){
            System.out.println(item.getName() +": "+item.getQuality());
        }
    }
}
