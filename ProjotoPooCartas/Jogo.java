package ProjotoPooCartas;

import java.util.Scanner;

public class Jogo {
    Scanner leitura = new Scanner(System.in);
    private Jogador jogador = null;
    public void iniciarJogo()
    {
        System.out.println("Jogo Iniciado \uD83C\uDFAE\n");
        System.out.println("Escolha o jogador:");
        System.out.println("1-Guerreiro  \uD83D\uDC82\u200D♀\uFE0F");
        System.out.println("2-Mago  \uD83E\uDDD9\u200D♂\uFE0F\n");
        int escolha =  leitura.nextInt();
        leitura.nextLine();
        if (escolha == 1)
        {
            jogador = new Guerreiro( 100, 10);
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
        jogador.inicializarCartas();
        System.out.println(".....Iniciando batalha... ");
      while (jogador.estaVivo() && inimigo.estaVivo()) {
          jogador.mostrarCartas();
        System.out.println("Escolha uma carta \uD83C\uDCCF para usar:");
        int escolhacarta = leitura.nextInt();
          leitura.nextLine();

        if (escolhacarta >= 1 && escolhacarta <= jogador.getCartas().size()) {
            Cartas cartaEscolhida = jogador.getCartas().get(escolha - 1);
            System.out.println("Você usou a carta: " + cartaEscolhida.getNome());
            int dano = cartaEscolhida.getValor();
            inimigo.receberDano(dano);
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }

        if (inimigo.estaVivo()) {
            inimigo.atacar(jogador);
        }
          if (jogador.estaVivo()) {
              System.out.println("Você venceu! \uD83D\uDE01 ");
          } else {
              System.out.println("Você foi derrotado! \uD83D\uDE2D ");
          }
    }
    }

}
