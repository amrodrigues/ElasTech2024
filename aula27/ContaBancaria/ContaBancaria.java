package aula27.ContaBancaria;

public class ContaBancaria {
    private String cliente;
    private int nume_conta;
    private  float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNume_conta() {
        return nume_conta;
    }

    public void setNume_conta(int nume_conta) {
        this.nume_conta = nume_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String cliente, int nume_conta, float saldo) {
        this.cliente = cliente;
        this.nume_conta = nume_conta;
        this.saldo = saldo;
    }
    public float sacar(float valor){
        if (saldo >= valor) {
            saldo -= valor;
            return saldo;
        } else {
            System.out.println("Não possui saldo suficiente para realizar o saque");
            return 0;
        }
    }

    public float depositar (float valor){
        return saldo +=valor;
    }

    public void dadosBancario()
    {
        System.out.println("Cliente: " + cliente + "   saldo: " +saldo);
    }
}
