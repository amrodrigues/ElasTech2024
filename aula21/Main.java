package aula21;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa1.getNome());
        pessoa1.setNome( "Rafael 2");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
    }
}
