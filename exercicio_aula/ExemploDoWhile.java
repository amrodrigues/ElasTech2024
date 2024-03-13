package exercicio_aula;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        int numero = -5;

        do {
            System.out.println("1- Somar");
            System.out.println("2- Dividir");
            System.out.println("-1- Sair");
            System.out.println("Digite a opção");
            numero = leitura.nextInt();
        }
        while(numero >=0);


    }
}
