import java.util.Scanner;

public class tabuadaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int num = Integer.valueOf(input.nextLine());

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
