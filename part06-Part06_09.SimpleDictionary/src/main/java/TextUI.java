
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            if (endCommand(word)) {
                break;
            }
            else if (addCommand(word)) {
                System.out.println("Word: ");
                String wordToTrans = scanner.nextLine();
                
                System.out.println("Translation: ");
                String translationWord = scanner.nextLine();
                
                dictionary.add(wordToTrans, translationWord);
                continue;
            }
            else if (searchCommand(word)) {
                System.out.println("To be translated: ");
                String searchWord = scanner.nextLine();
                
                if (!(dictionary.translate(searchWord) == null)) {
                    System.out.println("Translation: " + dictionary.translate(searchWord));
                    continue;
                }
                System.out.println("Word " + searchWord + " was not found");
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
    
    public boolean endCommand(String word) {
        if (word.equals("end")) {
            System.out.println("Bye bye!");
            return true;
        }
        return false;
    }
    
    public boolean addCommand(String word) {
        if (word.equals("add")) {
            return true;
        }
        return false;
    }
    
    public boolean searchCommand(String word) {
        if (word.equals("search")) {
            return true;
        }
        return false;
    }
}
