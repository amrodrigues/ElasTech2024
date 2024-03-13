package Atividade3;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero, cont=0 ;
        numero =leitura.nextInt();

        for (int i=1; i<= numero ; i++)
        {
            if(numero % i == 0)
            {
                cont++;
            }
        }
        if (cont ==2)
        {

            System.out.println("Numero e Primo");
        }
        else
        {
            System.out.println("Numero  nao e Primo");
        }

    }

}
