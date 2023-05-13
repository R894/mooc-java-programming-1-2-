
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("")){
            splitAndPrint(input, " ");
            input = scanner.nextLine();
        }
        
    }
    public static void splitAndPrint(String input, String splitBy){
        String[] pieces = input.split(splitBy);
        
        for(int i=0; i<pieces.length; i++){
            System.out.println(pieces[i]);
        
        }
    
    }
}
