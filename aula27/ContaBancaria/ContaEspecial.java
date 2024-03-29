package aula27.ContaBancaria;

public class ContaEspecial extends  ContaBancaria{
        private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ContaEspecial(String cliente, int nume_conta, float saldo, float limite) {
        super(cliente, nume_conta, saldo);
        this.limite = limite;
    }

    public  float sacar(float valor)
    {
        float novoSaldo = getSaldo() + limite;
        if (novoSaldo >= valor) {
            setSaldo(getSaldo()-valor);
            return getSaldo();
        } else {
            System.out.println("Não possui saldo suficiente para realizar o saque");
            return 0;
        }
    }
}
