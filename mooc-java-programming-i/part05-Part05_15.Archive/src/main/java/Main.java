
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item item = new Item(name, identifier);
            if(!(items.contains(item))){
                items.add(item);
            }
            
        }
        for(Item anItem : items){
            System.out.println(anItem.getIdentifier()+": "+anItem.getName());
        }
    }
}
