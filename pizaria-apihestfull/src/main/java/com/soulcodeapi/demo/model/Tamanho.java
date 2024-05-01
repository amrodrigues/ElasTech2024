package com.soulcodeapi.demo.model;

import jakarta.persistence.*;

@Entity
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTamanho;

    @Column
    private String nome;

    @Column
    private float desconto;

    public Tamanho(){

    }

    public long getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(long idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
