package Atividade3;

import java.util.Scanner;

public class MediaNumPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num, soma = 0, cont =0;
        double media =0;
        System.out.println("Digite um numero");
        num = leitura.nextInt();
        while (num >0)
        {
            soma += num;
            cont ++;
            System.out.println("Digite um numero");
            num = leitura.nextInt();
        }
        media = (double) soma/cont;
        System.out.println("Media de numeros inteiros postivo é: "+ media);

    }
}
