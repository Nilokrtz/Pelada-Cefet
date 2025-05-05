package com.estudo_poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pessoa{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String nome;
    private Date dataDeNascimento;
    private ArrayList<Contato> contato;

    public Pessoa(){
        
    }

    public Pessoa(String nome, Date dataDeNascimento, ArrayList<Contato> contatos) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.contato = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ArrayList<Contato> getContato() {
        return contato;
    }

    public void setContato(ArrayList<Contato> contato) {
        this.contato = contato;
    }
}