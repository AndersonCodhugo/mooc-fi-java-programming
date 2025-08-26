
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String name = String.valueOf(scanner.next());
        
        String thrice = name + name + name;
        
        System.out.println(thrice);

    }
}
