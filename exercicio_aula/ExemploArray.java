package exercicio_aula;

import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);

        int[] numeros = new int[3];
        numeros[0] = 9;
        numeros[1] = 10;
        numeros[2] = 5;

        for (int i = 0 ; i<3 ;i++)
        {
            System.out.println("o valor na "+i+" posição do array"+numeros[i]);
        }


    }


    }


