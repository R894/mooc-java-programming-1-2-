
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest ="";
        int sum =0;
        int index=0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            if(longest.length() < parts[0].length()){
                longest = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            index++;
        }
        double avg = (double)sum/index;
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+avg);

    }
}
