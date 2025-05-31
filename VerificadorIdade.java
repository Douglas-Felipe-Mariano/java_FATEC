package verificadorIdade;

import java.util.Scanner;

public class VerificadorIdade {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dígite sua idade: \n");
        int idade = scanner.nextInt(); 
        
        if (idade >= 16){
            if (idade > 18) {
            	System.out.println("Pode Votar");
            }else {
            	System.out.println("Voto Opcional");
            }
        } else {
            System.out.print("Não pode votar \n");
        }
    }
}