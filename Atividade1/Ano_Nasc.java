
import java.util.Scanner;

public class Ano_Nasc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();

        // Calcular ano de nascimento
        int anoAtual = 2024; // Ano atual fictício, ajuste conforme necessário
        int anoNascimento = anoAtual - idade;
        int anoNascimento1 = anoNascimento - 1;
        // Mostrar resultados
        System.out.println("\nCadastro Concluído:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascimento , se você já fez aniversário: " + anoNascimento);
        System.out.println("Ano de Nascimento , caso você não tenha feito  aniversário: " + anoNascimento1);

        scanner.close();
    }
}
