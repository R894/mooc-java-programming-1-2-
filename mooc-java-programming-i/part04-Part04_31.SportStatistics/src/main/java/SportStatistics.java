
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins =0;
        int losses =0;
        
        try{
            Scanner fileScanner = new Scanner(Paths.get(file));
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if(!parts[0].equals(team) && !parts[1].equals(team)){
                    continue;
                }
                for(int i=2; i<parts.length; i+=2){
                        games++;
                        if(Integer.valueOf(parts[i]) > Integer.valueOf(parts[i+1])){
                            wins++;
                        }else{
                            losses++;
                        }
                }
                if(!parts[0].equals(team)){
                    int helper = wins;
                    wins = losses;
                    losses = helper;
                }
                
            }
            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        }catch(Exception e){
            
        }
    }

}
