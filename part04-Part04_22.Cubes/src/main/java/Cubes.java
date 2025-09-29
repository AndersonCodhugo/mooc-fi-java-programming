
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String num = String.valueOf(scanner.nextLine());
            if (!(num.equals("end"))) {
                int number = Integer.valueOf(num);
                System.out.println((number * number) * number);
            } else {
                break;
            }
        }
    }
}
