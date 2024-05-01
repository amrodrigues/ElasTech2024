package com.soulcodeapi.demo.model;
import jakarta.persistence.*;
@Entity
public class PizzaPedidaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaIngrediente;
    @ManyToOne
    @JoinColumn(name = "idPizzaPedida")
    private PizzaPedida pizzaPedida;
    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingrediente ingrediente;
    public PizzaPedidaIngrediente(){}

    public long getIdPizaaIngrediente() {
        return idPizzaIngrediente;
    }

    public void setIdPizaaIngrediente(long idPizaaIngrediente) {
        this.idPizzaIngrediente = idPizaaIngrediente;
    }

    public PizzaPedida getPizzaPedida() {
        return pizzaPedida;
    }

    public void setPizzaPedida(PizzaPedida pizzaPedida) {
        this.pizzaPedida = pizzaPedida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
