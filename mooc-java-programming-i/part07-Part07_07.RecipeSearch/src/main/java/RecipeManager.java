
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Limi
 */
public class RecipeManager {
    private ArrayList<String> list;
    private ArrayList<Recipe> recipeList;
    private String fileName;
    
    public RecipeManager(String fileName){
        this.fileName= fileName;
        list = new ArrayList<>();
        recipeList = new ArrayList<>();
        initialize();
    }
    
    private void initialize(){
        try{
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                
                if(line.isEmpty()){
                    String name = list.get(0);
                    int cookingTime = Integer.valueOf(list.get(1));
                    ArrayList<String> ingredients = new ArrayList<>();
                    
                    for(int i=2; i<list.size(); i++){
                        ingredients.add(list.get(i));
                    }
                    
                    Recipe recipe = new Recipe(name, cookingTime, ingredients);
                    recipeList.add(recipe);
                    list.clear();
                    
                    continue;
                }
                
                list.add(line);
            }
            String name = list.get(0);
            int cookingTime = Integer.valueOf(list.get(1));
            ArrayList<String> ingredients = new ArrayList<>();
            for(int i=2; i<list.size(); i++){
                        ingredients.add(list.get(i));
            }
            Recipe recipe = new Recipe(name, cookingTime, ingredients);
            recipeList.add(recipe);
            list.clear();
         }catch(Exception e){
                    
        }
    }
    
    public void list(){
        System.out.println("Recipes:");
        for(Recipe recipe : recipeList){
            System.out.println(recipe);
        }
    }
    
    public void findName(String name){
        System.out.println("Recipes:");
        for(Recipe recipe : recipeList){
            if(recipe.getName().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String name){
        System.out.println("Recipes:");
        for(Recipe recipe : recipeList){
            if(recipe.containsIngredient(name)){
                System.out.println(recipe);
            }
        }
    }
    public void findByTime(int time){
        System.out.println("Recipes:");
        for(Recipe recipe:recipeList){
            if(recipe.getCookingTime() <= time){
                System.out.println(recipe);
            }
            
        }
    }
}
