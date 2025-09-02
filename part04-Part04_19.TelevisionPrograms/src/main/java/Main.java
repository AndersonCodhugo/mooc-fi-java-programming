import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String title = String.valueOf(scanner.nextLine());
            
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(title, duration));
        }
        System.out.println("Program's maximum duration: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram tvProgram : programs) {
            if (tvProgram.getDuration() <= input)
                System.out.println(tvProgram);
        }
    }
}
