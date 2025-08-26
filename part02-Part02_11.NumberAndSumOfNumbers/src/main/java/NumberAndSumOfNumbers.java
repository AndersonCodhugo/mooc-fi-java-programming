
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            } else {
                qtd = qtd + 1;
                sum = sum + num;
            }
        }
        System.out.println("Number of numbers: " + qtd);
        System.out.println("Sum of the numbers: " + sum);
    }
}
