package ProjotoPooCartas;

public class Inimigo extends Jogador {
    public Inimigo(String nome, int vida) {
        super(nome,vida);
    }



    public void receberDano(Jogador jogador, int dano) {
        int calculo = this.getVida() - dano;
        setVida(calculo);
        if (getVida() < 0) {
            setVida(0);
        }
        System.out.println("Ataque do  "+jogador.getNome() +" Vida inimigo \uD83D\uDC7F:" + this.getVida());
    }
}
