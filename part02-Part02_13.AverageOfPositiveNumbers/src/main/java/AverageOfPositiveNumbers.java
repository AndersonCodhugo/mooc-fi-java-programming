
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int qtd = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            } else if (num > 0) {
                sum = sum + num;
                qtd = qtd + 1;
            }
        }
        if (qtd >= 1 && sum >= 1) {
            System.out.println(1.0 * sum / qtd);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
