
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        
        int result = 1;
        int i = 1;
        
        while (i < num) {
            i++;
            result = result + i;
        }
        System.out.println("The sum is " + result);
    }
} // 1 2 6 10 15 21 28
