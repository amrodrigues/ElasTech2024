package aula0204.Interface;

public class Atleta implements Nadador , Corredor{

    public void correr(){
        System.out.println("correndo");
    }

    public void nadar(){
        System.out.println("Nadando");
    }
}
