
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class GradeManager {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    private int passingGrade = 50;
    
    public GradeManager(){
        grades = new ArrayList<>();
        passingGrades = new ArrayList<>();
    }
    
    public void add(int grade){
        if(grade >=0 && grade<=100){
            grades.add(grade);
            if(grade>= passingGrade){
                passingGrades.add(grade);
            }
        } 
    }
    
    private double average(ArrayList<Integer> grades){
        if(grades.isEmpty()){
            return -1;
        }
        int sum =0;
        int size = grades.size();
        for(int grade : grades){
            sum+= grade;
        }
        return ((double) sum)/size;
    }
    
    public double allAverage(){
        return average(grades);
    }
    
    public double passingAverage(){
        return this.average(passingGrades);
    }
    
    public double passPercentage(){
        if(passingGrades.isEmpty()){
            return 0.0;
        }
        int passed = passingGrades.size();
        int size = grades.size();
        double result = (double) (100 * passed) / size;
        return Double.valueOf(result);
    }
    
    private void printStars(int stars){
        for(int i=0; i<stars; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public void gradeDistribution(){
        int gradeFive=0;
        int gradeFour=0;
        int gradeThree=0;
        int gradeTwo=0;
        int gradeOne=0;
        int gradeZero=0;
        
        for(int grade:grades){
            if(grade <50){
                gradeZero++;
            }
            if(grade >=50 && grade <60){
                gradeOne++;
            }
            if(grade >=60 && grade <70){
                gradeTwo++;
            }
            if(grade >=70 && grade <80){
                gradeThree++;
            }
            if(grade >=80 && grade <90){
                gradeFour++;
            }
            if(grade >=90 && grade <=100){
                gradeFive++;
            }
        }
            System.out.print("5: ");
            this.printStars(gradeFive);
            System.out.print("4: ");
            this.printStars(gradeFour);
            System.out.print("3: ");
            this.printStars(gradeThree);
            System.out.print("2: ");
            this.printStars(gradeTwo);
            System.out.print("1: ");
            this.printStars(gradeOne);
            System.out.print("0: ");
            this.printStars(gradeZero);
    }
    
}
