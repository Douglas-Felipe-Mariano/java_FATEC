package calculadoraDeDesconto;

import java.util.Scanner;

public class CalculadoraDeDesconto{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dígite o valor do produto");

        double preco = scanner.nextDouble();

        System.out.println("Agora dite o valo em procentagem do desconto");
        double desconto = scanner.nextInt();

        double porcentagemDesconto = desconto/100; 

        double precoFinal = preco -(preco * porcentagemDesconto);

        System.out.printf("O valor R$%.2f com desconto de %.1f%% resulta em R$%.2f%n", preco, desconto, precoFinal);

        scanner.close();

    }
}