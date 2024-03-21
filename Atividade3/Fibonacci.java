package Atividade3;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20, primeiroTermo=0 ,segundoTermo=1;
        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        for (int i =0; i < n; i++) {

            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;


            }


        }
    }

