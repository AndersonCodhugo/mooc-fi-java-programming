
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                numbers.add(reader.nextLine());
            }
            
        } catch (Exception error) {
            System.out.println("Error " + error.getMessage());
        }
        
        for (String item : numbers) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count += 1;
            } else {
                continue;
            }
        }
        
        System.out.println("Numbers: " + count);
    }

}
