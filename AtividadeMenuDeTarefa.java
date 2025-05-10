import java.util.Scanner;
import java.util.ArrayList;

public class AtividadeMenuDeTarefa {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        // String[] tarefas = new String[10];
        String novaTarefa;
        ArrayList<String> tarefas = new ArrayList<>();
        

    do {

        System.out.println("Menu de Cadastro");
        System.out.println("1- Adicionar Tarefa");
        System.out.println("2- Listar Tarefas");
        System.out.println("3- Remover Tarefa");
        System.out.println("4- Sair");
        System.out.println("Escolha uma opção");
        opcao = scanner.nextInt();
        

        switch (opcao) {
            case 1:
                System.out.println("Informe o Nome da Tarefa:");
                novaTarefa = scanner.nextLine();
                tarefas.add(novaTarefa);

                break;
            case 2:
                System.out.println("Tarefas Atuais:");
                for (String tarefa : tarefas){
                    System.out.println(tarefas);
                }
                break;
            case 3:
                System.out.println("Tarefas Atuais:");
                System.out.println("Qual deseja Excluir?:");
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Invalida, tente novamente");
                break;
        }
    } while (opcao != 4);

    scanner.close();
    }

}
