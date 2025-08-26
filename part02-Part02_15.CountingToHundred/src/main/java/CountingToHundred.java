
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        
        for (int input = num; num < 101; num++) {
            System.out.println(num);
        }
    }
}
