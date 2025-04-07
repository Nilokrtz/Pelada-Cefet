package com.estudo_poo.entities;

import java.util.ArrayList;
import java.util.Date;

public class Time extends Jogador{
    
    private ArrayList<Jogador> jogadores;
    private ArrayList<Jogador> jogadoresTitulares;
    private String nomeTime;
    private Date dataCriacao;
    private String cidade;
    private String titulos;
    private ArrayList<Jogador> jogadoresReservas;

    public Time(){
        
    }

    public Time(String nomeTime, ArrayList<Jogador> jogadores, ArrayList<Jogador> jogadoresTitulares, Date dataCriacao, String cidade, String titulos, ArrayList<Jogador> jogadoresReservas) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
        this.jogadoresTitulares = jogadoresTitulares;
        this.dataCriacao = dataCriacao;
        this.cidade = cidade;
        this.titulos = titulos;
        this.jogadoresReservas = jogadoresReservas;
    }
    
    
    
    
    // Métodos
    public void qntCertaJogadores() {
        if (jogadores.size() < 11) {

            System.out.println("A quantidade de jogadores está menor que o necessário.");

        } 
        else if (jogadores.size() > 11) {

            System.out.println("Há mais jogadores que o limite. Esses jogadores serão realocados para reserva.");
            int titulares = 11;

            ArrayList<Jogador> novosTitulares = new ArrayList<Jogador>();
            ArrayList<Jogador> novosReservas = new ArrayList<Jogador>();

            for (int i = 0; i < titulares; i++) {
                novosTitulares.add(this.jogadoresTitulares.get(i));
            }
            for (int i = titulares; i < jogadores.size(); i++) {
                novosReservas.add(this.jogadoresReservas.get(i));
            }
        } 
        else {
            System.out.println("Time completo com 11 jogadores.");
        }
    }
    
    public void adicionarJogadorTime(Jogador jogador){
        jogadores.add(jogador);
    }

    public void removerJogador(){
        
    }
    
    public void listarJogadores(){
        
        for(int i = 0; i<jogadores.size(); i++){
            System.out.println(jogadores.get(i).toString());
        }
    }

    
    // Getters e Setters
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(ArrayList<Jogador> jogadores) {
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

    public ArrayList<Jogador> getJogadoresReservas() {
        return jogadoresReservas;
    }
    public void setJogadoresReservas(ArrayList<Jogador> jogadoresReservas) {
        this.jogadoresReservas = jogadoresReservas;
    }

    public ArrayList<Jogador> getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(ArrayList<Jogador> jogadoresTitulares) {
        this.jogadoresTitulares = jogadoresTitulares;
    }

}