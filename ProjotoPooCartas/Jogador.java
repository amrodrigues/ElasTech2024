package ProjotoPooCartas;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Cartas> cartas;
     private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCartas(List<Cartas> cartas) {
        this.cartas = cartas;
    }

    public Jogador(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
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
        cartas.add(new Cartas("Terra \uD83C\uDF0D", 20));
    }

    public void mostrarCartas() {
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println((i + 1) + ". " + cartas.get(i).getNome());
        }
    }
        public List<Cartas> getCartas() {
        return cartas;
    }
    public  void atacar(Jogador jogador , int dano){
        int calculo = getVida() -dano;
        jogador.setVida(calculo);
        System.out.println("Ataque do inimigo \uD83D\uDC7F ! Sua vida "+jogador.getNome() +": " + jogador.getVida());
    }
}
