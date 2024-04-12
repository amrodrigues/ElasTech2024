package Atividade5;

public class Contador {

    private int qtd_evento;

    public Contador(int qtd_evento) {
        this.qtd_evento = qtd_evento;
    }

    public int getQtd_evento() {
        return qtd_evento;
    }

    public void setQtd_evento(int qtd_evento) {
        this.qtd_evento = qtd_evento;
    }

    public  void zerar() {
        setQtd_evento(0);
    }

    public void incrementar(){
        qtd_evento ++;
    }

    public  void  retornaValor() {
        System.out.println("Valor é " + getQtd_evento());
    }

}
