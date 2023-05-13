
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int totalNums=0;
        try{
            Scanner fr = new Scanner(Paths.get(file));
            while(fr.hasNextLine()){
                int num = Integer.valueOf(fr.nextLine());
                if(num <= upperBound && num >= lowerBound){
                    totalNums++;
                }
            
            }
        
        }catch(Exception e){
        }
        System.out.println("Numbers: "+totalNums);
    }

}
