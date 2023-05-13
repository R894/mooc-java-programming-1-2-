/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDict = simpleDictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("end")){
                break;
            }
            this.command(command);
        }
    }
    public void command(String command){
        if(command.equals("add")){
            System.out.println("Word:");
            String word = scanner.nextLine();
            System.out.println("Translation:");
            String translation = scanner.nextLine();
            simpleDict.add(word, translation);
            return;
        }
        if(command.equals("search")){
            System.out.println("To be translated:");
            String translate = scanner.nextLine();
            if(simpleDict.translate(translate)==null){
                System.out.println("Word "+translate+" was not found");
                return;
            }
            System.out.println("Translation: "+ simpleDict.translate(translate));
            return;
        }
        System.out.println("Unknown command");
    }
}
