package aula19;

public class Main {
    public static  void mensagemInicial(){
        System.out.println("Bem Vindo ao siatema");
    }
    public static  void mensagemUsuario(String nome)
    {
        System.out.println("Bem vindo" + nome);
    }

    public  static int somar(int numero1 ,int numero2){
        return  numero1+numero2;
    }

    public static void main(String[] args) {
        mensagemInicial();
        mensagemUsuario("Anna");

        System.out.println(somar(12, 14));
        int num1 = 2, num2 =3 ;
        System.out.println(somar(num1,num2));
    }
}
