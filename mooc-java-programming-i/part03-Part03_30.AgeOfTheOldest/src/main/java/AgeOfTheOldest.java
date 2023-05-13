
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        int index=0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            int age = Integer.parseInt(input.split(",")[1]);
            if( age> oldest){
                oldest= age;
            }
        
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
