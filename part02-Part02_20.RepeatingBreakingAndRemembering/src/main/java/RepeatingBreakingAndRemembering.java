
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num >= 0) {
                sum += num;
                count++;
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
