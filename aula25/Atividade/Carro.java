package aula25.Atividade;

public class Carro extends Veiculo {
    private int numero_portas;

    public Carro(String marca, String modelo, String cor, int ano , int numero_portas) {
        super(marca, modelo, cor, ano);
        this.numero_portas = numero_portas;
    }



    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }

    public void mostraDados3() {
        super.mostraDados();
        System.out.println("Qdt de portas: " + numero_portas);
    }


}
