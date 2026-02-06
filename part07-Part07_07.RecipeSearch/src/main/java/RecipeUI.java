
import java.util.Scanner;

public class RecipeUI {
    
    private Scanner scanner;
    private RecipeManager manager;

    public RecipeUI(Scanner scanner, RecipeManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start() {
        System.out.println("");
        System.out.println("Commands:\nlist - list the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient- searches recipes by ingredient");
        System.out.println("");
        
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe r : manager.getRecipes()) {
                    System.out.println(r);
                }
            }
            
            if (command.equals("find name")) {
                System.out.println("\nSearched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe r : manager.getRecipes()) {
                    if (r.getName().contains(searchedWord)) {
                        System.out.println(r);
                    }
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe r : manager.getRecipes()) {
                    if (r.getCookingTime() <= maxCookingTime) {
                        System.out.println(r);
                    }
                }
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchedIngredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe r : manager.getRecipes()) {
                    if (r.hasIngredient(searchedIngredient)) {
                        System.out.println(r);
                    }
                }
            }
        }
        
    }
}
