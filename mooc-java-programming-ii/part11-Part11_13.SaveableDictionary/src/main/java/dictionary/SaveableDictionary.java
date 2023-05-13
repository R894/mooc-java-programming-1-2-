package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    public SaveableDictionary(){
        dictionary = new HashMap<>();
    }
    public SaveableDictionary(String file){
        dictionary = new HashMap<>();
        this.file = file;
    }
    public void add(String words, String translation){
        dictionary.put(translation, words);
    }
    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        for(String key : dictionary.keySet()){
            if(dictionary.get(key).equals(word)){
                return key;
            }
        }
        return null;
    }
    public void delete(String word){
        if(dictionary.keySet().contains(word)){
            dictionary.remove(word);
        }
        for(String key : dictionary.keySet()){
            if(dictionary.get(key).contains(word)){
                dictionary.remove(key);
                break;
            }
        }
    }
    public boolean load(){
        try{
            File myFile = new File(this.file);
            Scanner scanner = new Scanner(myFile);
            
            while(scanner.hasNextLine()){
                String split[] = scanner.nextLine().split(":");
                dictionary.put(split[0], split[1]);
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public boolean save(){
        try{
            File myFile = new File(this.file);
            PrintWriter writer = new PrintWriter(myFile);
            for(String key : dictionary.keySet()){
                writer.println(dictionary.get(key)+":"+key);
            }
            writer.close();
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
