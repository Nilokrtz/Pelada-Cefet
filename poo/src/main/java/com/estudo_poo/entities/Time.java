package com.estudo_poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Time{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    
    private ArrayList<Jogador> jogadores;
    private ArrayList<Jogador> jogadoresTitulares;
    private String nomeTime;
    private Date dataCriacao;
    private String cidade;
    private ArrayList<Jogador> jogadoresReservas;

    public Time(){
        
    }

    public Time(String nomeTime, Date dataCriacao, String cidade) {
        this.nomeTime = nomeTime;
        this.dataCriacao = dataCriacao;
        this.cidade = cidade;
        this.jogadores = new ArrayList<>();
        this.jogadoresTitulares = new ArrayList<>();
        this.jogadoresReservas = new ArrayList<>();
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
            System.out.println("Time completo com 11 jogadores!");
        }
    }
    
    public static Time CadastrarTime() {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Scanner sc = new Scanner(System.in);


            System.out.print("Digite o nome do Time: ");
            String nomeTime = sc.nextLine();

            System.out.print("Digite a data de criação do time (dd/MM/yyyy): ");
            Date dataCriacao = sdf.parse(sc.next());

            sc.nextLine();
            System.out.print("Digite a cidade de criação: ");
            String cidade = sc.nextLine();

            return new Time(nomeTime, dataCriacao, cidade);

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o Time: " + e.getMessage());
            return null;
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

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
		sb.append("------------------------------------------------------------\n");
		sb.append(nomeTime + "\n");
        sb.append(sdf.format(dataCriacao) + "\n");
        sb.append(cidade + "\n");
		sb.append("------------------------------------------------------------\n");
		
		return sb.toString();
    }

}