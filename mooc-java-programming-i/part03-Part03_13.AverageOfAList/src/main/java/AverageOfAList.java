
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int num1=0;
        int sum=0;
        for(int number : list){
            sum=sum+number;
            num1++;
                   
        }
        double avg = ((double)sum)/num1;
        System.out.println("Average: "+avg);
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
