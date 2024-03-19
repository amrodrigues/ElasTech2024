package exercicio_aula;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        //set não deixa nomes repetidos
        Set<String> nomes = new HashSet<>();
        // coloca na ordem alfabetica
        Set<String> nomes1 = new TreeSet<>();
        nomes.add("Rafael");
        nomes.add("Ludmila");
        nomes.add("Anna Paula");
        nomes.add("Lays");
        nomes.add("RAFAEL");
        nomes.add("Rafael");

        System.out.println("Nomes "+ nomes);
        nomes1.addAll(nomes);
        System.out.println("Nomes1 "+ nomes1);
    }
}
