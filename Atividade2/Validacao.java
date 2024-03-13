package Atividade2;

import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo e foi armazenado.");
        } else if (numero < 0) {
            int valorAbsoluto = Math.abs(numero);
            System.out.println("O número é negativo, e seu valor absoluto foi armazenado: " + valorAbsoluto);
        } else {
            System.out.println("O número é zero.");
        }

        switch (numero % 2) {
            case 0:
                System.out.println("O número é par.");
                break;
            case 1:
            case -1:
                System.out.println("O número é ímpar.");
                break;
        }

        scanner.close();
    }

}
