
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if(parts[0].equals("add")){
                first.add(Integer.parseInt(parts[1]));
            }
            if(parts[0].equals("move")){
                if(Integer.parseInt(parts[1]) > first.contains()){
                    second.add(first.contains());
                    first.remove(Integer.parseInt(parts[1]));
                }
                if(first.contains() >= Integer.parseInt(parts[1])){
                    first.remove(Integer.parseInt(parts[1]));
                    second.add(Integer.parseInt(parts[1]));
                }
            }
            if(parts[0].equals("remove")){
                second.remove(Integer.parseInt(parts[1]));
                
            }
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
