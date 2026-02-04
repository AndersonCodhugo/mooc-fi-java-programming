
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.z
        
        Grades register = new Grades();

        GradeUI ui = new GradeUI(scanner);
        ui.start();
    }
}
