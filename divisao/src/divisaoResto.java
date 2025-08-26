import java.util.Scanner;

public class divisaoResto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para ser numerador: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite um número inteiro para ser denominador: ");
        int den = Integer.valueOf(scanner.nextLine());

        System.out.println("A divisã exata de " + num + "/" + den + " = " + ((double) num / den));
        System.out.println("A parte inteira de " + (num / den));
        System.out.println("E o resto da divisão " + (num % den));
    }
}
