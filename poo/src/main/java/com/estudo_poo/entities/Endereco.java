package com.estudo_poo.entities;


public class Endereco {
    private String uf;
    private String cidade;
    private String bairro;
    private int numero_casa;

    public Endereco(String uf, String cidade, String bairro, int numero_casa) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero_casa =numero_casa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    
    }

    public int getNumero_casa(int numero_casa) {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }







}
