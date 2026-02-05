
import java.io.File;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        
        RecipeManager manager = new RecipeManager();
        manager.fileRead(fileName);
        
        RecipeUI ui = new RecipeUI(scanner, manager);
        ui.start();
    }

}
