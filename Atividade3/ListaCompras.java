package Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> ListaCompra = new ArrayList<>();
        Scanner leitura= new Scanner(System.in);
        String item ;

        System.out.println("-----Lista de Compras------");
        System.out.println("Digite o nome do item:");
        System.out.println("Digite sair , caso a lista esteja completa");
        item = leitura.next();
        while (!item.equals("sair"))
        {
            ListaCompra.add(item);

            System.out.println("Lista de Compras atualizada:" + ListaCompra);
            System.out.println("-----Lista de Compras------");
            System.out.println("Digite o nome do item:");
            System.out.println("Digite sair , caso a lista esteja completa");
            item = leitura.next();
        }

        System.out.println("Lista de Compras atualizada:" + ListaCompra);
    }
}
