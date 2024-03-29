package ProjetoPoo;

import java.util.Scanner;

public class Jogo {
    Scanner leitura = new Scanner(System.in);
    private Jogador jogador = null;
    public void iniciarJogo()
    {
        System.out.println("Jogo Iniciado");
        System.out.println("Escolha o jogador:");
        System.out.println("1-Guerreiro");
        System.out.println("2-Mago");
        int escolha =  leitura.nextInt();
        leitura.nextLine();
        if (escolha == 1)
        {
            jogador = new Guerreiro(100, 10);
        }
        else if(escolha==2)
        {
            jogador = new Mago(80, 15);
        }
        else
        {
            System.out.println("Escolha inválida");
           // iniciarJogo();
        }
        Inimigo inimigo = new Inimigo(50, 5);

        System.out.println("Iniciando batalha...");
        while (jogador.estaVivo() && inimigo.estaVivo())

        {
            jogador.atacar(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }
        }

        if(jogador.estaVivo()){
            System.out.println("Parabéns você venceu!");
        } else {
            System.out.println("Voce foi derrotado!");
        }
    }


    public void atacar(Object object)
    {

    }
}
