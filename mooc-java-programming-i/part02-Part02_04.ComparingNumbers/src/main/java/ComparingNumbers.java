
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        
        if(num == num2){
            System.out.println(num + " is equal to "+ num2);
        } else if(num > num2){
            System.out.println(num + " is greater than "+ num2);
        }else{
            System.out.println(num + " is smaller than "+ num2);
        }
    }
}
