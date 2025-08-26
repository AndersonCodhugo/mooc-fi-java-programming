
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int oldest = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            count = Integer.valueOf(pieces[1]);
            
            if (count > oldest) {
                oldest = count;
                name = pieces[0];
            } else if (oldest > count) {
                count = oldest;
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
