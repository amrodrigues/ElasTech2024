package ProjetoPoo;

public class Jogador {


     private int vida;
     private int ataque;


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Jogador(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }

    public boolean  estaVivo(){
        return vida> 0;
    }

    public void atacar(Inimigo inimigo){
        int calculo = getVida() - getAtaque();
        inimigo.setVida(calculo);
        System.out.println("Ataque do jogador! Vida do inimigo: " + inimigo.getVida());
    }
}
