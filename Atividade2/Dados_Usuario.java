package Atividade2;

import java.util.Scanner;

public class Dados_Usuario {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar o nome do usuário
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    // Solicitar a idade do usuário
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    // Exibir mensagem com informações do usuário
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + " anos");

    scanner.close();
}

}
