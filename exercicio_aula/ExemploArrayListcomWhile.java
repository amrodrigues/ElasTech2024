package exercicio_aula;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayListcomWhile {
    public static void main (String[] args )
    {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome = "";
        System.out.println("Digite nomes e digite 'sair' para finalizr a operacao");
        while (!nome.equals("sair"))
        {
            System.out.println("Digite o nome:");
            nome = leitura.nextLine();
            nomes.add(nome);
        }

        System.out.println(nomes);
    }
}
