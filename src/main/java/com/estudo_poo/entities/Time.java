package com.estudo_poo.entities;

import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Time extends Jogador{
    
    Stack st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    private Jogador[] jogadores;
    private String nomeTime;
    private Date dataCriacao;
    private String cidade;
    private String titulos;
    private Jogador [] jogadoresReservas;

    public Time(String nomeTime, Jogador[] jogadores, Date dataCriacao, String cidade, String titulos, Jogador[] jogadoresReservas) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
        this.dataCriacao = dataCriacao;
        this.cidade = cidade;
        this.titulos = titulos;
        this.jogadoresReservas = jogadoresReservas;
    }
    

    
    // Métodos
    public void qntCertaJogadores() {
        if (jogadores.length < 11) {

            System.out.println("A quantidade de jogadores está menor que o necessário.");

        } 
        else if (jogadores.length > 11) {

            System.out.println("Há mais jogadores que o limite. Esses jogadores serão realocados para reserva.");
            int titulares = 11;

            jogadoresReservas = new Jogador[jogadores.length - titulares];
            Jogador[] novosTitulares = new Jogador[titulares];
            
            for (int i = 0; i < titulares; i++) {
                novosTitulares[i] = jogadores[i];
            }
            for (int i = titulares; i < jogadores.length; i++) {
                jogadoresReservas[i - titulares] = jogadores[i];
            }
            jogadores = novosTitulares;
        } 
        else {
            System.out.println("Time completo com 11 jogadores.");
        }
    }
    
    public void adicionarJogador(){
        
    }

    public void removerJogador(){
        
    }
    
    public void listarJogadores(){
        int titulares = 11;
        for(int i = 0; i<titulares; i++){
            System.out.println(i + " - " +jogadores[i]);

        }
    }

    
    // Getters e Setters
    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNomeTime() {
        return nomeTime;
    }
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTitulos() {
        return titulos;
    }
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public Jogador[] getJogadoresReservas() {
        return jogadoresReservas;
    }
    public void setJogadoresReservas(Jogador[] jogadoresReservas) {
        this.jogadoresReservas = jogadoresReservas;
    }

}
