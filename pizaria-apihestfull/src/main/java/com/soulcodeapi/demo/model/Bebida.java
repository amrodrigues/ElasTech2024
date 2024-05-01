package com.soulcodeapi.demo.model;

import jakarta.persistence.*;

@Entity
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebida;

    @Column
    private  String nome;
    @Column
    private float preco;

    public Bebida(){

    }

    public long getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(long idBebida) {
        this.idBebida = idBebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
