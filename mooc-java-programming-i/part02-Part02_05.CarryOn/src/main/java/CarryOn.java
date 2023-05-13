
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans ="";
        while(true){
            System.out.println("Shall we carry on?");
            ans = scanner.nextLine();
            if(ans.equals("no")){
                break;
            }
        }
        
    }
}
