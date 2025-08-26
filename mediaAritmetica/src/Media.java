import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite o segundo número:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite o terceiro número:");
        int num3 = Integer.valueOf(scanner.nextLine());

        int soma = num1 + num2 + num3;
        System.out.println("A média dos valores é de: " + ((1.0 * soma) / 3));
    }
}
