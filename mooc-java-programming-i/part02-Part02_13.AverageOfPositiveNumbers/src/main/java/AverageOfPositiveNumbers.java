
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        int nums=0;
        int i=0;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if(num==0){
                break;
            }else if(num>0){
                nums = nums + num;
                i++;
            }
            
        
        }
        if(i==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println("Average of the numbers: "+ (1.0*nums / i));
        }
        

    }

}

