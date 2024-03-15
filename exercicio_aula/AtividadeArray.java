package exercicio_aula;

import java.util.Scanner;

public class AtividadeArray {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = leitura.nextInt();

        int[] vetor = new int[tamanho];

        // Preencher o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitura.nextInt();
        }

        // Algoritmo de ordenação (Bubble Sort)
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Trocar os elementos de posição
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibir o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }


    }
}
