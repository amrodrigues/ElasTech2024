package exercicio_aula;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeListadeTarefas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> listadetarefas = new ArrayList<>();
        String tarefa = "";
        int opcao = 0 , indice ;
        System.out.println("Escolha o tipo de condição da tarefa");
        System.out.println("1-Adicionar");
        System.out.println("2-Excluir");
        System.out.println("3-Mostrar");
        System.out.println("4-Sair");

        opcao = leitura.nextInt();
        leitura.nextLine();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa para adicionar:");
                    tarefa = leitura.nextLine();
                    listadetarefas.add(tarefa);
                    break;
                case 2:
                    System.out.println("---- Lista de Tarefas ---");
                    System.out.println(listadetarefas);
                    System.out.println("------------------------");
                    System.out.println("Digite parte do nome da tarefa para excluir:");
                    tarefa = leitura.nextLine();
                    for (int i = 0; i < listadetarefas.size(); i++) {
                        if (listadetarefas.get(i).contains(tarefa)) {
                            System.out.println("Entrei aqui");
                            indice = i;
                            listadetarefas.remove(indice);
                        }
                    }

                   // for(int i = 0 ; i < listadetarefas.size() ; i++){
                  //      System.out.println(" Indice "+ (i+1) + " Tarefa : "+ listadetarefas.get(i));
                  //  }
                 //   System.out.println("Digite o numero da tarefa que quer apagar");
                 //   int apagar = leitura.nextInt();
                //    listadetarefas.remove((apagar-1));
                 //   System.out.println("Tarefa apagada com sucesso");

                    System.out.println("----Nova Lista de Tarefas ---");
                    System.out.println(listadetarefas);
                    System.out.println("------------------------");

                    break;
                case 3:

                    System.out.println("---- Lista de Tarefas ---");
                    System.out.println(listadetarefas);
                    System.out.println("------------------------");

                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
            System.out.println("Escolha o tipo de condição da tarefa");
            System.out.println("1-Adicionar");
            System.out.println("2-Excluir");
            System.out.println("3-Mostrar");
            System.out.println("4-Sair");
            opcao = leitura.nextInt();
            leitura.nextLine();

        }


        System.out.println(listadetarefas);
    }
}

