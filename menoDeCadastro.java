import java.util.Scanner;

public class menoDeCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
    

    do {

        System.out.println("Menu de Cadastro");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Cadastrar Cliente");
        System.out.println("3- Sair");
        System.out.println("Escolha uma opção");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Produto Cadastrado Com Sucesso!");
                break;
            case 2:
                System.out.println("Cliente Cadastrado Com Sucesso!");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Invalida, tente novamente");
                break;
        }
    } while (opcao != 3);

    scanner.close();
    }
}
