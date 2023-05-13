
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int firstnum = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int num = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=firstnum; i<=num; i++){
            sum = sum+i;
        }
        System.out.println("The sum is " +sum);
    }
}
