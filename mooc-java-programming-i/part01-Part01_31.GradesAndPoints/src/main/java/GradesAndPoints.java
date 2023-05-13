
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = Integer.parseInt(scan.nextLine());
        String graderate;
        
        if(grade<0){
            graderate="impossible!";
        }else if( grade>=0 && grade<50 ){
            graderate="failed";
        }else if( grade>=50 && grade<60 ){
            graderate="1";
        }else if( grade>=60 && grade<70 ){
            graderate="2";
        }else if( grade>=70 && grade<80 ){
            graderate="3";
        }else if( grade>=80 && grade<90 ){
            graderate="4";
        }else if( grade>=90 && grade<=100 ){
            graderate="5";
        }else{
            graderate="incredible!";
        }
        System.out.println("Grade: "+graderate);
    }
}
