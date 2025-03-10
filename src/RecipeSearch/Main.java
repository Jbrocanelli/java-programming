package RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipeArrayList = new ArrayList<>();
        UserInterface userInterface = new UserInterface(scanner, recipeArrayList);

        userInterface.start();

        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient = searches recipes by ingredient");

        while (true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")){
                break;
            }
            if (command.equals("list")){
                for (Recipe recipe : recipeArrayList){
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                for (Recipe recipe : recipeArrayList){
                    if (recipe.getName().contains(search)){
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes: ");
                for (Recipe recipe : recipeArrayList){
                    if(recipe.getMinutes() <= maxCookingTime){
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes: ");
                for(Recipe recipe : recipeArrayList){
                    if(recipe.getIngredients().contains(ingredient)){
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}



