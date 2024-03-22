package aula21.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.saldo();
        conta.depositar(20);
        conta.sacar(10);
        conta.saldo();
        conta.depositar(30);
        conta.saldo();
        System.out.println("COnta 2 ==============");

        ContaBancaria conta2 = new ContaBancaria();
        conta2.saldo();
        conta2.depositar(20);
        conta2.sacar(10);
        conta2.saldo();
        conta2.depositar(40);
        conta2.saldo();
    }
}
