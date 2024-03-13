import java.util.Scanner;

public class Cad_Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite seu Endereço: ");
        String endereco = scanner.nextLine();

        // Mostrar dados informados
        System.out.println("\nDados Informados:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);

        scanner.close();
    }

}
