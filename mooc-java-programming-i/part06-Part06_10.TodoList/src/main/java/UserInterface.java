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
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            processCommand(command);
        }
    }
    public void processCommand(String command){
        if(command.equals("add")){
            this.add();
        }
        if(command.equals("list")){
            this.list();
        }
        if(command.equals("remove")){
            this.remove();
        }
    }
    public void list(){
        todoList.print();
    }
    public void remove(){
        System.out.println("Which one is removed?");
        todoList.remove(Integer.parseInt(prompt()));
    }
    public String prompt(){
        String prompt = scanner.nextLine();
        return prompt;
    }
    public void add(){
        System.out.println("To add:");
        todoList.add(prompt());
        
    }
}
