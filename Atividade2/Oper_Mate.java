package Atividade2;

import java.util.Scanner;

public class Oper_Mate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Solicitar o primeiro número
        System.out.print("Digite o primeiro número: ");
    double numero1 = scanner.nextDouble();

    // Solicitar o segundo número
        System.out.print("Digite o segundo número: ");
    double numero2 = scanner.nextDouble();

    // Realizar operações matemáticas
    double soma = numero1 + numero2;
    double subtracao = numero1 - numero2;
    double multiplicacao = numero1 * numero2;

    // Verificar se o segundo número é diferente de zero antes de realizar a divisão
    double divisao = 0;
        if (numero2 != 0) {
        divisao = numero1 / numero2;
    }

    // Exibir resultados
        System.out.println("Resultados das operações:");
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (numero2 != 0) {
        System.out.println("Divisão: " + divisao);
    } else {
        System.out.println("Não é possível dividir por zero.");
    }

        scanner.close();
}

}
