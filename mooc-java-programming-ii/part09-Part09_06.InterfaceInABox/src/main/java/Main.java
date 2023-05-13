
public class Main {

    public static void main(String[] args) {
        Box box = new Box(100);
        Book book = new Book("wow","wee",5);
        CD cd = new CD("wow", "wee",5);
        box.add(book);
        box.add(cd);
        
        Box biggerBox = new Box(200);
        biggerBox.add(box);
        
        System.out.println(box);
        System.out.println(biggerBox);
    }

}
