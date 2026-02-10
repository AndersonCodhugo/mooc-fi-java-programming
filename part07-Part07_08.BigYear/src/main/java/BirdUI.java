
import java.util.Scanner;

public class BirdUI {
    
    private Scanner scanner;
    private BirdManager manager;
    
    public BirdUI(Scanner scanner, BirdManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                
                System.out.println("Name in Latin");
                String latin = scanner.nextLine();
                this.manager.add(name, latin);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                this.manager.addObservation(name);
            }
            
            if (command.equals("All")) {
                this.manager.printAll();
            }
            
            if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                
                this.manager.printOne(name);
            }
            
        }
    }
}
