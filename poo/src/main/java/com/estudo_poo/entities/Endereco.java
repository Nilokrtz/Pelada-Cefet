package com.estudo_poo.entities;


public class Endereco {
    private String uf;
    private String cidade;
    private String bairro;
    private int numeroCasa;

    public Endereco(String uf, String cidade, String bairro, int numeroCasa) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
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

    public int getNumero_casa(int numeroCasa) {
        return numeroCasa;
    }

    public void setNumero_casa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }







}
