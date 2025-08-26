
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0; 
        int oldest = 0; 
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            count = Integer.valueOf(pieces[1]);
            
            if (count > oldest) {
                oldest = count; 
            } else if (oldest > count) {
                count = oldest;
            }
            
        }
        System.out.println("Age of the oldest: "+ oldest);
    }
}
