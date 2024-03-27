package aula25.Atividade;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat","Uno", "Preto", 2018, 2 );
        carro.mostraDados3();
        System.out.println("-------------------");
        Moto moto = new Moto("Honda", "CG", "Preta", 2022 ,500);
        moto.mostraDados2();
    }
}
