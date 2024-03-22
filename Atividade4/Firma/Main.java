package Atividade4.Firma;

public class Main {
    public static void main(String[] args) {
        Firma colaborador1 = new Firma("Anna", "Rodrigues", 3.500);
        Firma colaborador2 = new Firma("Fernanda", "Souza", 4.500);

        System.out.println( "Colaborador: " + colaborador1.getPrimeiroNome() + colaborador1.getSobrenome());
        System.out.println("Salario: " + colaborador1.getSalarioMensal());
        System.out.println("Salario Anual: " + colaborador1.salarioAnual());
        System.out.println("Ajuste salario +10%: " + colaborador1.ajusteSalario());
        System.out.println("Salario Anual: " + colaborador1.salarioAnual());
        System.out.println("-----------------------");

        System.out.println( "Colaborador:" + colaborador2.getPrimeiroNome() + colaborador2.getSobrenome());
        System.out.println("Salario:" + colaborador2.getSalarioMensal());
        System.out.println("Salario Anual: " + colaborador2.salarioAnual());
        System.out.println("Ajuste salario +10%: " + colaborador2.ajusteSalario());
        System.out.println("Salario Anual: " + colaborador2.salarioAnual());

    }
}
