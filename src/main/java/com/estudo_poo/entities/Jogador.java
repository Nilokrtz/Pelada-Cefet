package com.estudo_poo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Jogador {
    //System.out.println("Jogador.java");
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private float altura;
    private Date dataDeNascimento;
    private String posicao;
    private int camisa;

    public Jogador(){

    }

    public Jogador(String nome, float altura, Date dataDeNascimento, String posicao, int camisa) {
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
        this.posicao = posicao;
        this.camisa = camisa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
		sb.append("------------------------------------------------------------\n");
		sb.append(nome + "\n");
		sb.append(altura + "\n");
		sb.append(sdf.format(dataDeNascimento) + "\n");
		sb.append(posicao + "\n");
		sb.append(camisa + "\n");
		sb.append("------------------------------------------------------------\n");
		
		return sb.toString();

    }

    public void confirmarPresenca() {
        
    }

    public void alterarPosicao() {
        
    }

}
