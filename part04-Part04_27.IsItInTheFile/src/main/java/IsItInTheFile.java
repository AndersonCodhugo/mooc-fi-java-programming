
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while(reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if(lines.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
    }
}
