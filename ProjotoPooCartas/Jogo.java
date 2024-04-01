package ProjotoPooCartas;

import java.util.Scanner;
import java.util.Random;
public class Jogo {
    Random random = new Random();
    Scanner leitura = new Scanner(System.in);
    private Jogador jogador = null;
    int dano;
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
            jogador = new Guerreiro( "Guerreiro  \uD83D\uDC82\u200D♀\uFE0F" ,100);
        }
        else if(escolha==2)
        {
            jogador = new Mago("Mago  \uD83E\uDDD9\u200D♂\uFE0F\n",100);
        }
        else
        {
            System.out.println("Escolha inválida");
            iniciarJogo();
        }
        Inimigo inimigo = new Inimigo("Inimigo",100);
        jogador.inicializarCartas();
        inimigo.inicializarCartas();
        System.out.println(".....Iniciando batalha... ");
      while (jogador.estaVivo() && inimigo.estaVivo()) {
          jogador.mostrarCartas();
        System.out.println("Escolha uma carta \uD83C\uDCCF para usar:");
        int escolhacarta = leitura.nextInt();
          leitura.nextLine();

        if (escolhacarta >= 1 && escolhacarta <= jogador.getCartas().size()) {
            Cartas cartaEscolhida = jogador.getCartas().get(escolhacarta - 1);
            System.out.println("Você usou a carta: " + cartaEscolhida.getNome());
            dano = cartaEscolhida.getValor();
            jogador.atacar(jogador, dano);
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }

        if (inimigo.estaVivo()) {
            escolhacarta = random.nextInt(5) ;
            Cartas cartaEscolhida = inimigo.getCartas().get(escolhacarta);
            dano = cartaEscolhida.getValor();
            inimigo.receberDano(jogador ,dano);
        }

    }
        if (jogador.estaVivo()) {
            System.out.println("Você venceu! \uD83D\uDE01 ");
        } else {
            System.out.println("Você foi derrotado! \uD83D\uDE2D ");
        }
    }

}
