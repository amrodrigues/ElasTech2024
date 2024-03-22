package Atividade4.Firma;

public class Firma {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Firma (String primeiroNome, String sobrenome, double salarioMensal)
    {
        this.primeiroNome=primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal> 0) {
            this.salarioMensal = salarioMensal;
        }
        else
        {
            this.salarioMensal = 0;
        }
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double salarioAnual()
    {
        return salarioMensal*12;
    }

    public double ajusteSalario()
    {

        return salarioMensal*=1.10;
    }
}
