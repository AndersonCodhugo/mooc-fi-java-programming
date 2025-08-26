
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        
        for (int input = 0; input != num + 1; input++ ) {
            System.out.println(input);
        }
    }
}
