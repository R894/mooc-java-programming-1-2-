
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        String name="";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            int age = Integer.parseInt(input.split(",")[1]);
            if( age> oldest){
                oldest= age;
                name = input.split(",")[0];
            }
        
        }
        System.out.println("Name of the oldest: "+name);

    }
}
