package Atividade3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
         int opcao, num1=0, num2=0, valor;
        do {
            System.out.println("------Calculadora-------");
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("0- Sair");
            System.out.println("Digite a opção:");
            opcao = leitura.nextInt();
            if(opcao > 0)
            {
                System.out.println("Digite o 1 numero:");
                num1 = leitura.nextInt();
                System.out.println("Digite o 2 numero:");
                num2 = leitura.nextInt();
            }


            switch (opcao) {
                case 1:
                    valor = num1 + num2;
                    System.out.println("Resultado da soma:" +valor);
                    break;
                case 2:
                    valor = num1 - num2;
                    System.out.println("Resultado da subtracao:" +valor);
                    break;
                case 3:
                    valor = num1 * num2;
                    System.out.println("Resultado da multiplicacao:" +valor);
                    break;
                case 4:
                    if (num2 > 0)
                    {
                        valor = num1 / num2;
                        System.out.println("Resultado da divisao:" +valor);
                    }
                    else
                    { System.out.println("Numero 2 invalido");}
                    break;
                default:
                    System.out.println("Opcao Invalida");

            }
        }
        while(opcao >0);

    }

}
