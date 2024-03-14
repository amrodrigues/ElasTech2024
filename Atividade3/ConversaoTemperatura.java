package Atividade3;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;
        double temperatura, valor;

        System.out.println("----------Conversão de Temperatura--------");

        System.out.println("Escolha o tipo de Conversao");
        System.out.println("1-Celsius");
        System.out.println("2-Fahrenheit ");
        System.out.println("3-Sair");
        opcao = leitura.nextInt();
        while (opcao == 1 || opcao == 2)
        {
        System.out.println("Digite a temperatura:");
        temperatura = leitura.nextInt();
        switch (opcao) {
            case 1:
                valor = (9.0 / 5.0) * temperatura + 32;
                ;
                System.out.println("Conversao em Celsius:  " + valor);
                break;
            case 2:
                valor = (9.0 / 5.0) * temperatura - 32;
                ;
                System.out.println("Conversao em  Fahrenheit:  " + valor);
                break;

            default:
                System.out.println("Opcao Invalida");
        }
            System.out.println("Escolha o tipo de Conversao");
            System.out.println("1-Celsius");
            System.out.println("2-Fahrenheit ");
            System.out.println("0-Sair");
            opcao = leitura.nextInt();
        }
    }
}
