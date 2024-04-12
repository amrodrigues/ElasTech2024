package Atividade5;

public class Main {
    public static void main(String[] args) {
            Contador cont = new Contador(10);
            cont.retornaValor();
            cont.incrementar();
            cont.retornaValor();
            cont.zerar();
            cont.retornaValor();

        Pais brasil = new Pais("Brasil", 8515767, 213993437);
        Pais argentina = new Pais("Argentina", 2780400, 44938712);
        Pais chile = new Pais("Chile", 756102, 19116201);

        // Criando um continente e adicionando os países
        Continente americadoSul = new Continente("América do Sul");
        americadoSul.adcionarPais(brasil);
        americadoSul.adcionarPais(argentina);
        americadoSul.adcionarPais(chile);

        // Exibindo informações sobre o continente
        System.out.println("Nome do continente: " + americadoSul.getNome());
        System.out.println("Dimensão total do continente: " + americadoSul.dimensaoTotal() + " km²");
        System.out.println("População total do continente: " + americadoSul.populacaoTotal());
        System.out.println("Densidade populacional do continente: " + americadoSul.densidadePopulacional()) ;

        Pais maiorPopulacao = americadoSul.paisComMaiorPopulacao();
        if (maiorPopulacao != null) {
            System.out.println("País com maior população: " + maiorPopulacao.getNome() + " (" + maiorPopulacao.getPopulacao() + " habitantes)");
        }

        Pais menorPopulacao = americadoSul.paisComMenorDimensao();
        if (menorPopulacao != null) {
            System.out.println("País com menor população: " + menorPopulacao.getNome() + " (" + menorPopulacao.getPopulacao() + " habitantes)");
        }

        Pais maiorDimensao = americadoSul.paisComMaiorDimensao();
        if (menorPopulacao != null) {
            System.out.println("País de maior dimensão territorial: " + menorPopulacao.getNome() + " (" + menorPopulacao.getDimensao() + " km²)");
        }

        Pais menorDimensao = americadoSul.paisComMenorDimensao();
        if (menorDimensao != null) {
            System.out.println("País de menor dimensão territorial: " + menorDimensao.getNome() + " (" + menorDimensao.getDimensao() + " km²)");
        }
        double razãoTerritorial = americadoSul.razaoTerritorial();
        if (razãoTerritorial != 0) {
            System.out.println("Razão territorial (maior/menor): " + razãoTerritorial);
        }
    }
}

