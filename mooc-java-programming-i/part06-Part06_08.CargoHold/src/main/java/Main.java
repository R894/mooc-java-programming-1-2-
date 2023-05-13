
public class Main {

    public static void main(String[] args) {
        Item item = new Item("wow", 50);
        Suitcase m = new Suitcase(50);
        
        m.addItem(item);
        m.addItem(item);
        m.addItem(item);
        m.addItem(item);
        m.printItems();
    }

}
