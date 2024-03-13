package Atividade3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);

        int numero , valor ;

        System.out.println("Digite um numero:");

        numero =leitura.nextInt();

        for (int i =1; i<=10 ; i++)
        {
            valor = numero*i;
            System.out.println(numero +" x "+ i +" :"+ valor);
        }

    }
}
