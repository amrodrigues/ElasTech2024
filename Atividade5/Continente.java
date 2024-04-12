package Atividade5;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private  String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> pais) {
        this.paises = pais;
    }

    public void adcionarPais (Pais pais)
    {
        paises.add(pais);
    }

    public double dimensaoTotal(){
        double dimessaoTotal =0;
        for(Pais pais : paises)
        {
            dimessaoTotal += pais.getDimensao();
        }

        return  dimessaoTotal;
    }

    public long  populacaoTotal(){
        long populacaototal = 0;
        for (Pais pais : paises)
        {
            populacaototal += pais.getPopulacao();
        }


        return populacaototal;
    }

    public double densidadePopulacional(){
        double densidade = populacaoTotal()/dimensaoTotal();
      return densidade;
    }

    public Pais paisComMaiorPopulacao()
    {
        Pais paisMaiorPop = null;
        long maiorPop = Long.MIN_VALUE;
        for (Pais pais :paises)
        {
            if (pais.getPopulacao() > maiorPop)
            {
                paisMaiorPop = pais;
                maiorPop = pais.getPopulacao();
            }
        }


        return  paisMaiorPop;
    }

    public Pais paisComMenorPopulacao()
    {
        Pais paisMenorPop = null;
        long menorPop = Long.MAX_VALUE;
        for (Pais pais :paises)
        {
            if (pais.getPopulacao() > menorPop)
            {
                paisMenorPop = pais;
                menorPop = pais.getPopulacao();
            }
        }

     return  paisMenorPop;
    }


    public Pais paisComMaiorDimensao()
    {
        Pais paisMaiorDim = null;
        double maiorDim = Long.MIN_VALUE;
        for (Pais pais :paises)
        {
            if (pais.getDimensao() > maiorDim)
            {
                paisMaiorDim = pais;
                maiorDim = pais.getDimensao();
            }
        }

        return  paisMaiorDim;
    }

    public Pais paisComMenorDimensao()
    {
        Pais paisMenorDim = null;
        double menorDim = Long.MAX_VALUE;
        for (Pais pais :paises)
        {
            if (pais.getDimensao() > menorDim)
            {
                paisMenorDim = pais;
                menorDim = pais.getDimensao();
            }
        }
          return  paisMenorDim;
    }

    public double razaoTerritorial(){
        Pais paisMaiorDim =  paisComMaiorDimensao();
        Pais paisMenoDim  = paisComMenorDimensao();
        if ( paisMaiorDim != null && paisMenoDim != null && paisMenoDim.getDimensao() !=0)
        {
            return  paisMaiorDim.getDimensao()/paisMenoDim.getDimensao();
        }
        return  0;
    }
}
