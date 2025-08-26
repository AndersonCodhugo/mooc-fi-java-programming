import java.util.Scanner;

public class RevedaDeCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int precoCarro = 50000;

        System.out.println("Quantos carros foram vendidos? ");
        int vendas = Integer.valueOf(scanner.nextLine());
        System.out.println("Foram vendidos R$" + ((double) precoCarro * vendas) + " em carros");

        System.out.println("Qual o seu salário? ");
        double salario = Double.valueOf(scanner.nextLine());

        double comissao = ((double) precoCarro * 0.05) * vendas;

        System.out.println("Seu salário fixo de R$" + salario + " mais comissão de 5% por carro vendido R$" + comissao);
        System.out.print("Tem um salário final de R$" + (salario + comissao) );
    }
}
