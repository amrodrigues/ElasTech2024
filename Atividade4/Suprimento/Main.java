package Atividade4.Suprimento;

import java.lang.invoke.ConstantBootstraps;

public class Main {
    public static void main(String[] args) {
        Suprimento suprimento = new Suprimento(1234 , "escova", 3, 3.4);
        double valorfatura = suprimento.getInvoiceAmount();

        System.out.println("Item: " + suprimento.getDescricaoItem());

        System.out.println("Valor da fatura é: " + valorfatura);
    }
}
