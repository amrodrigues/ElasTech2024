package aula20;

public class Main {

    public static void MostarDados( Animal animal1)
    {
        System.out.println(" ====");
        System.out.println("nome do animal: " + animal1.getNome());
        System.out.println("idade do animal: " + animal1.getIdade());
        animal1.aniversairioanimal();
        System.out.println("nova idade do animal: " + animal1.getIdade());
        System.out.println(" ====");
    }
    public static void main(String[] args) {
            Animal animal1 = new Animal("Rafael", 16  );
            MostarDados(animal1);

             Animal animal2 = new Animal("Rafael 2", 20  );
            MostarDados(animal2);
    }
}
