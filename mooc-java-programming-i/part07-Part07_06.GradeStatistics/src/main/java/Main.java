
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            manager.add(input);
            
        }
        if(manager.allAverage() ==-1){
            System.out.println("Point average (all): 0");
        }else{
            System.out.println("Point average (all): "+manager.allAverage());
        }
        if(manager.passingAverage() ==-1){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): "+manager.passingAverage());
        }
        System.out.println("Pass percentage: "+manager.passPercentage());
        System.out.println("Grade distribution: ");
        manager.gradeDistribution();
        
        
        
    }
}
