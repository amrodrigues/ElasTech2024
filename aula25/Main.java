package aula25;

public class Main {
    public static void main(String[] args) {

          Endereco ep1 = new Endereco("rua teste" ,"ciidade teste", "estado teste");
          Pessoa p1 = new Pessoa("Rafael", 38, ep1);
          p1.mostrarDados();
          Estudante e1 = new Estudante("Rafael", 38, 1311646);
          e1.mostrarDados2();
    }
}
