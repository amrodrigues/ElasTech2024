package Atividade4.Suprimento;

import java.security.PublicKey;

public class Suprimento {
    private  int numeroItem;
    private String descricaoItem;
    private int qtdeItem;
    private double precouniItem;

    public  Suprimento(int numeroItem, String descricaoItem, int qtdeItem , double precouniItem)
    {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;

        if (qtdeItem > 0)
        {
            this.qtdeItem = qtdeItem;
        }
        else
        {
            this.qtdeItem = 0;
        }

        if (qtdeItem > 0)
        {
            this.precouniItem = precouniItem;
        }
        else
        {
            this.qtdeItem = 0;
        }

    }


    public double getPrecouniItem() {
        return precouniItem;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public void setPrecouniItem(double precouniItem) {
        this.precouniItem = precouniItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public double getInvoiceAmount()
    {
        return  (double)qtdeItem*precouniItem ;
    }
}
