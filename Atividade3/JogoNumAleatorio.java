package Atividade3;

import java.util.Random;
import java.util.Scanner;

public class JogoNumAleatorio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int palpite = 0, tentativas = 10, numerodasorte = random.nextInt(100) + 1;
        System.out.println("---------Vamos iniciar o jogo----------");
        System.out.println("Você deve acertar o numero que o robo esta pensando");
        System.out.println("Voce tera 10 tentativas");
        System.out.println("---------------------------------------");

        for (int i = 5; i > 0; i--) {
            System.out.println("O jogo começará em " + i + " segundos...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        while (palpite != numerodasorte) {
            System.out.println("---------------------------------------");
            System.out.println("Digite um numero, para voce acertar");
            System.out.println("---------------------------------------");
            palpite = leitura.nextInt();

            if (palpite == numerodasorte) {
                System.out.println("---------------------------------------");
                System.out.println("Parabens voce acertou");
                System.out.println("---------------------------------------");
            } else {
                if (palpite > numerodasorte) {
                    System.out.println("Digite um numero menor que o ultimo");
                } else {
                    System.out.println("Digite um numero maior que o ultimo");
                }

                tentativas--;

                System.out.println("Você tem " + tentativas + " tentativas");

                if (tentativas == 0) {
                    System.out.println("Acabou suas tentativas");
                    palpite = numerodasorte;
                }

            }

        }
    }
}


