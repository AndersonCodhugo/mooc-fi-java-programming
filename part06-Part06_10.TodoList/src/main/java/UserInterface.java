
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (stopCommand(command)) {
                break;
            }
            
            else if (addCommand(command)) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                
                todoList.add(toAdd);
            }
            
            else if (listCommand(command)) {
                todoList.print();
            }
            
            if (removeCommand(command)) {
                System.out.println("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                
                todoList.remove(index);
            }
            
        }
    }
    
    public boolean stopCommand(String command) {
        if (command.equals("stop")) {
            return true;
        }
        return false;
    }
    
    public boolean addCommand(String word) {
        if (word.equals("add")){
            return true;
        }
        return false;
    }
    
    public boolean listCommand(String word) {
        if (word.equals("list")){
            return true;
        }
        return false;
    }
    
    public boolean removeCommand(String word) {
        if (word.equals("remove")){
            return true;
        }
        return false;
    }
    
}
