
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int first = 0;
            int second = 0;
            int limiter = 100;

        while (true) {
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " +second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if (input.equals("quit")) {
                break;
            }
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            
            if (command.equals("add")) {
                if (first + amount > limiter) {
                    first = limiter;
                } else if (amount > 0) {
                first = first + amount;
                }
            }
            
            if (command.equals("move")) {
                if (amount + second > limiter) {
                    first -= amount;
                    second = limiter;
                } else if (amount > first) {
                    second += first;
                    first = 0;
                } else if (amount > 0) {
                    second += amount;
                    first -= amount;
                }

                if (second > limiter) {
                    second = limiter;
                }
                if (first < 0) {
                    first = 0;
                }
            }
            
            if (command.equals("remove")) {
                 if (amount > second){
                    second = 0;
                } 
                else if (amount > 0){
                    second -= amount;
                }
            }

        }
        
        
    }

}
