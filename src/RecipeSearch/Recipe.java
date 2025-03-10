package RecipeSearch;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int minutes;
    private ArrayList<String> ingredients;

    public Recipe(String name, int minutes, ArrayList<String> ingredients){
        this.name = name;
        this.minutes = minutes;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String toString(){
        return name + ", " + "cooking time: " + minutes;
    }
}
