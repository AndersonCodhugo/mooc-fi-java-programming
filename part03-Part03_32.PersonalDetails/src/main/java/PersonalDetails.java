
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        String name = "";
        String biggest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            sum = sum + Integer.valueOf(pieces[1]);
            name = pieces[0];
            count++;
            
            if (name.length() > biggest.length()) {
                biggest = name;
            } else if (name.length() < biggest.length()) {
                pieces[0] = biggest;
            }
        }
        System.out.println("Longest name: " + biggest);
        System.out.println("Average of the birth years: " + ((double) sum / count));
    }
}
