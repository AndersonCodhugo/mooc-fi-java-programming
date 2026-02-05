
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
                
                Recipe newRecipe = new Recipe(name, time);
                
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                }
                this.recipes.add(newRecipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
}
