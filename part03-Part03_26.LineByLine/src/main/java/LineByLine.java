
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = String.valueOf(scanner.nextLine());

            String[] pieces = phrase.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            if (pieces.length == 1) {
                break;
            }
        }
            
    }
}
