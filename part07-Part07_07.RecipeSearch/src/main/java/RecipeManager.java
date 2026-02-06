
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }
    
    public void fileRead(String fileName) {
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String name = reader.nextLine();
                int time = Integer.valueOf(reader.nextLine());
                
                ArrayList<String> recipeIngredients = new ArrayList<>();
                
                
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipeIngredients.add(ingredient);
                }
                this.recipes.add(new Recipe(name, time, recipeIngredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
}
