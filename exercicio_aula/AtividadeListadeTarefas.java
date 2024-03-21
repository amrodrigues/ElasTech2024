package exercicio_aula;

import java.util.ArrayList;
import java.util.Scanner;


public class AtividadeListadeTarefas {
   // pode declarar aqui para se usado em todos metodos
    //static  Scanner leitura = new Scanner(System.in);
    public static void menu (){
        System.out.println("Escolha o tipo de condição da tarefa");
        System.out.println("1-Adicionar");
        System.out.println("2-Excluir");
        System.out.println("3-Mostrar");
        System.out.println("4-Sair");
    }

    public static void listarTarefa( ArrayList<String> listadetarefas){
        System.out.println("---- Lista de Tarefas ---");
        System.out.println(listadetarefas);
        System.out.println("------------------------");

    }

    public static void adicionarTarefa(ArrayList<String> listadetarefas , Scanner leitura, String tarefa) {
        System.out.println("Digite o nome da tarefa para adicionar:");
        tarefa = leitura.nextLine();
        listadetarefas.add(tarefa);
    }

  public static void excluirTarefa(ArrayList<String> listadetarefas , Scanner leitura, String tarefa, int indice)
    {
        System.out.println("Digite parte do nome da tarefa para excluir:");
        tarefa = leitura.nextLine();
        indice =0;
        for (int i = 0; i < listadetarefas.size(); i++) {
            if (listadetarefas.get(i).contains(tarefa)) {
                System.out.println("Entrei aqui");
                indice = i;
                listadetarefas.remove(indice);
            }
        }
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> listadetarefas = new ArrayList<>();
        String tarefa = "";
        int opcao = 0 , indice=0 ;

        menu();
        opcao = leitura.nextInt();
        leitura.nextLine();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    adicionarTarefa(listadetarefas , leitura ,tarefa);
                    break;
                case 2:
                    listarTarefa(listadetarefas);

                    excluirTarefa(listadetarefas, leitura , tarefa , indice) ;


                    listarTarefa(listadetarefas);

                    break;
                case 3:

                    listarTarefa(listadetarefas);

                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
            menu();
            opcao = leitura.nextInt();
            leitura.nextLine();

        }


        System.out.println(listadetarefas);
    }
}

