package com.estudo_poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.estudo_poo.enums.TipoContato;

public class Jogador extends Pessoa{
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private float altura;
    private String posicao;
    private int camisa;
    private Time time;

    public Jogador(){
        
    }

    
    public Jogador(String nome, Date dataDeNascimento, ArrayList<Contato> contato){
        super(nome, dataDeNascimento, contato);

    }

    public Jogador(String nome, Date dataDeNascimento, ArrayList<Contato> contato, float altura, String posicao, int camisa, Time time) {
        super(nome, dataDeNascimento, contato);
        this.altura = altura;
        this.posicao = posicao;
        this.camisa = camisa;
        this.time = time;
    }




    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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

    public static Jogador CadastrarJogador(Time time) {
        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
    
            System.out.println("Digite sua altura: ");
            float altura = sc.nextFloat();
    
            System.out.print("Digite sua data de nascimento (DD/MM/YYYY): ");
            Date dataDeNascimento = sdf.parse(sc.next());
    
            Contato contato = new Contato(); // Instanciando corretamente
            ArrayList<Contato> contatos = new ArrayList<>();
    
            System.out.print("Me fale o tipo de contato que você colocou:\n[1]EMAIL\n[2]CELULAR\n[3]LINKEDIN\n[4]INSTAGRAM\n[5]WHATSAPP\n[6]TELEFONE\n");
            int opcao = sc.nextInt();
    
            switch (opcao) {
                case 1:
                    contato.setTipo(TipoContato.EMAIL);
                    System.out.println("Digite seu email: ");
                    contato.setContato(sc.next());
                    break;
                case 2:
                    contato.setTipo(TipoContato.CELULAR);
                    System.out.println("Digite seu número: ");
                    contato.setContato(sc.next());
                    break;
                case 3:
                    contato.setTipo(TipoContato.LINKEDIN);
                    System.out.println("Digite seu LinkedIn: ");
                    contato.setContato(sc.next());
                    break;
                case 4:
                    contato.setTipo(TipoContato.INSTAGRAM);
                    System.out.println("Digite seu Instagram: ");
                    contato.setContato(sc.next());
                    break;
                case 5:
                    contato.setTipo(TipoContato.WHATSAPP);
                    System.out.println("Digite seu WhatsApp: ");
                    contato.setContato(sc.next());
                    break;
                case 6:
                    contato.setTipo(TipoContato.TELEFONE);
                    System.out.println("Digite seu telefone: ");
                    contato.setContato(sc.next());
                    break;
                default:
                    System.out.println("Tipo inválido");
                    return null;
            }
    
            contatos.add(contato); // Adicionando o contato à lista
    
            System.out.println("Digite sua posição: ");
            String posicao = sc.next();
    
            System.out.println("Digite o n° da sua camisa: ");
            int camisa = sc.nextInt();
    
            return new Jogador(nome, dataDeNascimento, contatos, altura, posicao, camisa, time);
    
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o jogador: " + e.getMessage());
            return null;
        }
    }
    

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
		sb.append("------------------------------------------------------------\n");
		sb.append(this.getNome() + "\n");
		sb.append(altura + "\n");
		sb.append(sdf.format(this.getDataDeNascimento()) + "\n");
		sb.append(posicao + "\n");
		sb.append(camisa + "\n");
        sb.append(time + "\n");
        sb.append(this.getContato() + "\n");
        sb.append(time + "\n");
		sb.append("------------------------------------------------------------\n");
		
		return sb.toString();
    }


}