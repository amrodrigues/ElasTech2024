package aula21.ContaBancaria;

public class ContaBancaria {

    private  String nome;
    private  int saldo =0;

    public void depositar(int valor)
    {
        this.saldo += valor;
        System.out.println("Voce depositou o valor de " + valor);
    }

    public void sacar(int valor){
        this.saldo -= valor;
        System.out.println("Voce sacou o valor de " + valor);
    }

    public void saldo(){

        System.out.println("o saldo é: " + saldo);
    }
}
