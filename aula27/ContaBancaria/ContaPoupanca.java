package aula27.ContaBancaria;

public class ContaPoupanca extends  ContaBancaria {
    private  int diaRendimento;

    public float getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String cliente, int nume_conta, float saldo, int diaRendimento) {
        super(cliente, nume_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public float calcularNovoSaldo(float taxaRendimento) {
        float novoSaldo = getSaldo() ;
        novoSaldo = novoSaldo + (1+ taxaRendimento/100);
        setSaldo(novoSaldo);
        return novoSaldo;
    }
}
