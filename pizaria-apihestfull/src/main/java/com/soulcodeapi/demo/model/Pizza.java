package com.soulcodeapi.demo.model;

import jakarta.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizza;
    @Column
    private String nome;
    @Column
    private float precoBase;
    @Column
    private boolean personalizada;

    public Pizza(){

    }

    public long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(long idPizza) {
        this.idPizza = idPizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }
}
