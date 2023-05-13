
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        File file = new File("literacy.csv");
        try{
            Scanner scanner = new Scanner(file);
            ArrayList<Stat> list = new ArrayList<>();
            while(scanner.hasNextLine()){
                String[] split = scanner.nextLine().split(",");
                String country = split[3];
                int year = Integer.valueOf(split[4]);
                String gender = split[2].substring(0, split[2].length()-4);
                double literacy = Double.valueOf(split[5]);

                list.add(new Stat(country,year,gender,literacy));
                
            }
            list.stream().sorted((stat1, stat2) -> {return stat1.getLiteracy().compareTo(stat2.getLiteracy());}).forEach(stat1 -> System.out.println(stat1));
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
}
