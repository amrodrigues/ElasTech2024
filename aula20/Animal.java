package aula20;

public class Animal {
    // atributos
    private String nome;
    private int idade;
    //String especie;
    // String cor;
    // String genero;
    //  String grupo;

    public Animal(String nome, int idade) {
        //, String especie, String cor, String genero, String grupo
        this.nome = nome;
        this.idade = idade;
        // this.especie = especie;
        // this.cor = cor;
        // this.genero = genero;
        // this.grupo = grupo;

    }
        public String getNome () {
            return nome;
        }

        public int getIdade () {
            return idade;
        }

public void aniversairioanimal()
{
     idade++;
}
}
