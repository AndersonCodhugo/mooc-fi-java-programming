
import java.util.Scanner;

public class RecipeUI {
    
    private Scanner scanner;
    private RecipeManager manager;

    public RecipeUI(Scanner scanner, RecipeManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start() {
        System.out.println("Commands:\nlist - list the recipes\nstop - stops the program");
        System.out.println("");
        
        while (true) {
            System.out.println("Enter commad: ");
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
        }
        
    }
}
