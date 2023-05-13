
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String value = String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        Double doubleValue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string "+value);
        System.out.println("You gave the integer "+intValue);
        System.out.println("You gave the double "+doubleValue);
        System.out.println("You gave the boolean "+boolValue);
        // write your program here

    }
}
