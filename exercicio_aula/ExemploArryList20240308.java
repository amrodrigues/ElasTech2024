package exercicio_aula;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArryList20240308 {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        //Declarando um arryList
        ArrayList<String> listanomes = new ArrayList<>();

        //adicionando elementos no array
        listanomes.add("Rafael");
        listanomes.add("Jessica");
        listanomes.add("Ericka");

        // Acessando o elemento por indice
        String  nome1 = listanomes.get(0);
        System.out.println("Nome na posicao 0" + nome1);


        // mostrando o array completo
        System.out.println("Lista de nomes" + listanomes);

        for (String nome : listanomes)
        {
            System.out.println(nome);

        }

        // removendo um elemento
        listanomes.remove("Rafael");

        System.out.println("Lista de nomes" );
        for (String nome : listanomes)
        {
            System.out.println(nome);

        }

        // ver o tamanho do Array
        int qtdeArrary = listanomes.size();
        System.out.println("Quantidade de elementos" + qtdeArrary);

        // procurando o elemento dentro do array
        String procurando = "Ericka";
        if (listanomes.contains(procurando))
        {
            System.out.println("Nome existe no array");
        }
        else
        {
            System.out.println("Nome não existe no array");
        }
    }
}
