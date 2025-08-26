
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        for (int input = num2; input < num1 + 1; input++) {
            System.out.println(input);
        }
    }
}
