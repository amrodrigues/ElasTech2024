package aula27.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Anna" , 134113, 3000);
        ContaPoupanca contpoup = new ContaPoupanca("Anna", 12323, 3000, 3);
        ContaEspecial contesp = new ContaEspecial("Anna Maria", 31133, 8000, 2000);
        conta1.dadosBancario();
        conta1.sacar(300);
        conta1.dadosBancario();
        conta1.sacar(3000);

        System.out.println("--------");
        contpoup.dadosBancario();
        contpoup.calcularNovoSaldo(5);
        contpoup.dadosBancario();

        System.out.println("--------");
        contesp.dadosBancario();
        contesp.sacar(4000);
        contesp.dadosBancario();
        contesp.sacar(5500);
        contesp.dadosBancario();

    }
}
