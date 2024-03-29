package aula27.Animais;

public class Animal {
    private  String nome;
    private String cor;
    private String ambiente;
    private int comprimento;
    private int nPatas =4;
    private double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public void alteraNome(String nome) {
        setNome(nome);
    }
    public void alteraComprimento(int comprimento) {
        setComprimento(comprimento);
    }
    public void alteraPatas(int patas){
        setnPatas(patas);
    }
    public void alteraCor(String cor){
        setCor(cor);
    }
    public void alteraAmbiente(String ambiente){
        setAmbiente(ambiente);
    }
    public void alteraVelocidade(float velocidade){
        setVelocidade(velocidade);
    }

    public Animal(String nome, String cor, String ambiente, int comprimento, int nPatas, double velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.nPatas = nPatas;
        this.velocidade = velocidade;
    }
    public  void dados(){
        System.out.println( "Dados do Animal:" );
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Numero de Patas: " + nPatas);
        System.out.println("Velocidade: "+ velocidade);
    }
}
