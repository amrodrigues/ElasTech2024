package Atividade2;

import java.util.Scanner;

public class Dia_Semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar ao usuário um dia da semana em formato numérico
        System.out.print("Digite um dia da semana (1 a 7): ");
        int numeroDiaSemana = scanner.nextInt();

        // Utilizar um bloco switch para exibir o nome correspondente ao número
        String nomeDiaSemana;
        switch (numeroDiaSemana) {
            case 1:
                nomeDiaSemana = "Domingo";
                break;
            case 2:
                nomeDiaSemana = "Segunda-feira";
                break;
            case 3:
                nomeDiaSemana = "Terça-feira";
                break;
            case 4:
                nomeDiaSemana = "Quarta-feira";
                break;
            case 5:
                nomeDiaSemana = "Quinta-feira";
                break;
            case 6:
                nomeDiaSemana = "Sexta-feira";
                break;
            case 7:
                nomeDiaSemana = "Sábado";
                break;
            default:
                nomeDiaSemana = "Número inválido";
        }

        // Exibir o nome do dia da semana correspondente
        System.out.println("O dia da semana correspondente ao número " + numeroDiaSemana + " é: " + nomeDiaSemana);


        scanner.close();
    }

}
