package exercicio_aula;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int i, idade, contadormaior=0;

        for(i =0; i<10 ; i++)
        {
            System.out.println("Digite sua idade");
            idade = leitura.nextInt();
            if(idade >=18)
            {
                contadormaior++;
                System.out.println("Usuário maior de idade");
            }
            else
            {
                System.out.println("Usuário menor de idade");
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade é:" + contadormaior);
    }
}
