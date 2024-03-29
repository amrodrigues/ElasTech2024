package ProjotoPooCartas;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private List<Cartas> cartas;
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
        cartas = new ArrayList<>();
    }

    public boolean  estaVivo(){
        return vida> 0;
    }

    public void inicializarCartas() {
        cartas.add(new Cartas("Água \uD83D\uDCA7", 15));
        cartas.add(new Cartas("Fogo \uD83D\uDD25", 25));
        cartas.add(new Cartas("Ar \uD83C\uDF2A\uFE0F" , 18));
        cartas.add(new Cartas("Gelo \uD83E\uDDCA", 22));
        cartas.add(new Cartas("Terra \uD83E\uDDCA", 20));
    }

    public void mostrarCartas() {
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartas.get(i).getNome());
        }
    }
        public List<Cartas> getCartas() {
        return cartas;
    }

}
