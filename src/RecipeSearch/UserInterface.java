package RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeArrayList;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipeArrayList){
        this.scanner = scanner;
        this.recipeArrayList = recipeArrayList;
    }

    public void start(){
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                // if row is empty move to next recipe
                if(row.isEmpty()){
                    continue;
                }
                String name = row;
                int minutes = Integer.valueOf(reader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while(reader.hasNextLine()){
                    String ingredient = reader.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipeArrayList.add(new Recipe(name, minutes, ingredients));
            }
        } catch (Exception e){
            System.out.println("Error reading file: " + file);
        }
    }
}
