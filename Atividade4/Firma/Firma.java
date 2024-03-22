package Atividade4.Firma;

public class Firma {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Firma (String primeiroNome, String sobrenome, double salarioMensal)
    {
        this.primeiroNome=primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
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

    public double salarioAnual10()
    {
        double salarioAnual = salarioAnual();
        return salarioAnual*0.10;
    }
}
