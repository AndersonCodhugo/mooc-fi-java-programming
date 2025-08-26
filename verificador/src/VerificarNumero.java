import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = Integer.valueOf(input.nextLine());

        if (numero > 0) {
            System.out.println("O número " + numero + " é um número positivo!");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é um número negativo!");
        } else if (numero == 0) {
            System.out.println("Esse número é igual a 0!");
        }
    }
}
