
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num==0){
                break;
            }else if(num<0){
                i++;
            }
            
        
        }
        System.out.println("Number of negative numbers: "+i);
        

    }

}

