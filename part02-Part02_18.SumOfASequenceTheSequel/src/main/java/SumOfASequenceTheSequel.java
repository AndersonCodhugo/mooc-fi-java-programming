
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int second = Integer.valueOf(scanner.nextLine());
        
        int result = 0;
        
        while (first <= second) {
            result = result + first;
            first++;
        }
        System.out.println("The sum is " + result);
    }
},
