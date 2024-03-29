package ProjetoPoo;

public class Inimigo extends Jogador {
    public Inimigo(int vida, int ataque) {
        super(vida, ataque);
    }

    public  void atacar(Jogador jogador){
        int calculo = getVida() - getAtaque();
        jogador.setVida(calculo);
        System.out.println("Ataque do inimigo! Sua vida: " + jogador.getVida());
    }
}
