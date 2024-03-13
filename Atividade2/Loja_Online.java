package Atividade2;

import java.util.Scanner;

public class Loja_Online {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Solicitar ao usuário que insira o valor total da compra
        System.out.print("Digite o valor total da sua compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Passo 2: Aplicar descontos conforme as regras
        double desconto = 0.0;

        if (valorCompra > 200) {
            desconto = 0.10;
        } else if (valorCompra >= 100 && valorCompra <= 200) {
            desconto = 0.05;
        }

        double valorComDesconto = valorCompra - (valorCompra * desconto);

        // Passo 3: Exibir o valor final após o desconto
        System.out.println("Valor com desconto: R$ " + valorComDesconto);

        // Implementar menu para escolher o método de pagamento
        System.out.println("\nEscolha o método de pagamento:");
        System.out.println("1. Cartão de crédito");
        System.out.println("2. Boleto bancário");
        System.out.println("3. Transferência bancária");

        int opcaoPagamento = scanner.nextInt();

        // Switch para tratar opções de pagamento
        switch (opcaoPagamento) {
            case 1:
                System.out.println("Você escolheu Cartão de Crédito. O pagamento será processado.");
                break;
            case 2:
                System.out.println("Você escolheu Boleto Bancário. O boleto será gerado.");
                break;
            case 3:
                System.out.println("Você escolheu Transferência Bancária. As instruções serão fornecidas.");
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
        }

        scanner.close();
    }

}
