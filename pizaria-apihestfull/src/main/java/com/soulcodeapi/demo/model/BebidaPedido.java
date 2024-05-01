package com.soulcodeapi.demo.model;

import jakarta.persistence.*;

@Entity
public class BebidaPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebidaPedido;
    @ManyToOne
    @JoinColumn(name = "idPizza")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;
    @Column
    private  int quantidade;

    public  BebidaPedido(){

    }

    public long getIdBebidaPedido() {
        return idBebidaPedido;
    }

    public void setIdBebidaPedido(long idBebidaPedido) {
        this.idBebidaPedido = idBebidaPedido;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
