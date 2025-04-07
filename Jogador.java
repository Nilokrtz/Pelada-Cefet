package com.estudo_poo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Jogador {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    String nome;
    float altura;
    Date dataDeNascimento;
    String posicao;
    int camisa;
    Time time;

    
    


    public Jogador(){

    }

    public Jogador(String nome, float altura, Date dataDeNascimento, String posicao, int camisa, Time time) {
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
        this.posicao = posicao;
        this.camisa = camisa;
        this.time = time;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void CadastrarJogador(){
        
        try {

            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            System.out.println("Digite sua altura: ");
            float altura = sc.nextFloat();
            System.out.print("Digite sua data de nascimento (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.next());
            System.out.println("Digite sua posição: ");
            String posicao = sc.next();
            System.out.println("Digite o n° da sua camisa: ");
            int camisa = sc.nextInt();
            Time time = new Time();
            
            

            Jogador jogador = new Jogador(nome,altura,data,posicao,camisa,time);    

        } catch (Exception e) {
            System.out.println("Deu erro de " + e);
        }
        
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
        sb.append(time + "\n");
		sb.append("------------------------------------------------------------\n");
		
		return sb.toString();
    }


}
