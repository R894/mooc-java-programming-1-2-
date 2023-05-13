
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if(num < 5000){
            System.out.println("No tax!");
        } else if(num >= 5000 && num < 25000){
            System.out.println("Tax: "+ (100 + (num-5000)*0.08));
        }else if(num >= 25000 && num < 55000){
            System.out.println("Tax: "+ (1700 + (num-25000)*0.10));
        }else if(num >= 55000 && num < 200000){
            System.out.println("Tax: "+ (4700 + (num-55000)*0.12));
        }else if(num >= 200000 && num < 1000000){
            System.out.println("Tax: "+ (22100 + (num-200000)*0.15));
        }else{
            System.out.println("Tax: "+ (142100 + (num-1000000)*0.17));
        }
    }
}
