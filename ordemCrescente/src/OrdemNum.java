import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdemNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Digite um número: ");
            list.add(Integer.valueOf(scanner.nextLine()));

            System.out.println("Digite outro número: ");
            list.add(Integer.valueOf(scanner.nextLine()));

            System.out.println("Digite mais um número: ");
            list.add(Integer.valueOf(scanner.nextLine()));

            Collections.sort(list);

            for (int num: list) {
                System.out.print(num + " ");
            }
        }
}
