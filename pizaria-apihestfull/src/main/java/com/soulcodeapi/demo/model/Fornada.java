package com.soulcodeapi.demo.model;

import jakarta.persistence.*;

@Entity
public class Fornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFornada;

    @Column
    private int numFornada;
    @Column
    private int qtdPizzas;

    public Fornada(){

    }

    public long getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(long idFornada) {
        this.idFornada = idFornada;
    }

    public int getNumFornada() {
        return numFornada;
    }

    public void setNumFornada(int numFornada) {
        this.numFornada = numFornada;
    }

    public int getQtdPizzas() {
        return qtdPizzas;
    }

    public void setQtdPizzas(int qtdPizzas) {
        this.qtdPizzas = qtdPizzas;
    }
}
