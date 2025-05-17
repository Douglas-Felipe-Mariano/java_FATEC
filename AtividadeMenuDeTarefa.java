import java.util.Scanner;
import java.util.ArrayList;

public class AtividadeMenuDeTarefa {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String novaTarefa;
        int remover;
        ArrayList<String> tarefas = new ArrayList<>();
        

    do {
        // menu de navegação
        System.out.println("Menu de Cadastro");
        System.out.println("1- Adicionar Tarefa");
        System.out.println("2- Listar Tarefas");
        System.out.println("3- Remover Tarefa");
        System.out.println("4- Sair");
        System.out.println("Escolha uma opção");
        opcao = scanner.nextInt();
        scanner.nextLine();
        

        switch (opcao) {
            case 1:
                // adiciona tarefa
                System.out.println("Informe o Nome da Tarefa:");
                novaTarefa = scanner.nextLine();
                tarefas.add(novaTarefa);
                System.out.print("\n");

                break;
            case 2:
                // lista as tarefas atuais 
                System.out.println("Tarefas Atuais:");
                for (String tarefa : tarefas){
                    System.out.println(tarefa + "\n");
                }
                break;
            case 3:
                System.out.println("Tarefas Atuais:");
                // i = variavel de indice
                int i=1;
                // lista as tarefas
                for (String tarefa : tarefas){
                    System.out.println("[" + i + "]" + "-" + tarefa + "\n");
                    i++;
                }             
                System.out.println("Qual Tarefa Deseja Excluir:");
                // remove as a tarefa escolhida conforme o indice
                remover = scanner.nextInt();
                tarefas.remove(remover-1);
                System.out.println("Tarefa Removida Com Sucesso \n");
                break;
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
