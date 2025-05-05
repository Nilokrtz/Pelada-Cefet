package com.estudo_poo.entities;
import java.util.ArrayList;
import java.util.Scanner;

import com.estudo_poo.enums.TipoContato;
public class Funcionarios {

    private String cpf;
    private String nomeCompleto;
    private String dataNascimento;
    private float salario;
    private String funcao;
    private ArrayList<Contato> contatos;
    private ArrayList<Contato> tipoContato;
    private ArrayList<Endereco> enderecos;
    
    /*private ArrayList<Endereco> uf;
    private ArrayList<Endereco> cidade;
    private ArrayList<Endereco> bairro;
    private ArrayList<Endereco> numero_casa;*/

    public Funcionarios() {
        this.contatos = new ArrayList<>();
        this.tipoContato = new ArrayList<>();

        /*this.uf =new ArrayList<>();
        this.cidade =new ArrayList<>();
        this.bairro =new ArrayList<>();
        this.numero_casa =new ArrayList<>();*/
    }
    
    public Funcionarios(String cpf, String nomeCompleto, String dataNascimento, float salario, String funcao) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.funcao = funcao;
        this.contatos = new ArrayList<>();
        this.tipoContato = new ArrayList<>();
        this.enderecos = new ArrayList<>();

        /*this.uf =new ArrayList<>();
        this.cidade =new ArrayList<>();
        this.bairro =new ArrayList<>();
        this.numero_casa =new ArrayList<>();*/
    }

    //TERMINAR ESSA BUDEGA
    public void pegarEndereco() {
        Scanner sc = new Scanner(System.in);
        boolean decisaoEndereco = false;
        int continuar;
        int casa = 1;

        while (decisaoEndereco == false) {
            System.out.print("Me fale a unidade federal: ");
            String infoUf = sc.nextLine();
            
            System.out.print("Me fale a cidade: ");
            String infoCidade = sc.nextLine();
            
            System.out.print("Me fale o bairro: ");
            String infoBairro = sc.nextLine();
            
            System.out.print("Me fale o numero da casa: ");
            int infoNumeroCasa = sc.nextInt();
        
            enderecos.add(new Endereco(infoUf, infoCidade, infoBairro, infoNumeroCasa));
            
            System.out.print("Você deseja adicionar mais um endereço?\n[1]Sim\n[2]Não"); 
            continuar  = sc.nextInt();          
            
            if(continuar ==2 ){
                decisaoEndereco = true;
            }else if(continuar == 1){
                casa++;
                System.out.printf("Ok, me fale o seu as informações do  ", casa, "º  endereço"  );
            }
    
        }

    }
    public void pegarContato() {
        Scanner sc = new Scanner(System.in);
        String leitorTipo;
        String infoContato;
        int continuar;
        boolean decisaoContato = false;

        
        
    
        while (decisaoContato == false) {
            System.out.println("Escolha um tipo de contato:");
    
            for (TipoContato tipo : TipoContato.values()) {
                System.out.println("- " + tipo);
            }
            
            boolean tipoValido = false;
            TipoContato tipoEscolhido = null;
            
            while (!tipoValido) {

                try {
                    System.out.print("\nDigite o tipo de contato: ");
                    leitorTipo = sc.nextLine().toUpperCase();
            
                    for (TipoContato tipo : TipoContato.values()) {
                        if (tipo.name().equalsIgnoreCase(leitorTipo)) {
                            tipoValido = true;
                            tipoEscolhido = tipo;
                            break;
                        }
                    }
            
                    if (!tipoValido) {
                        System.out.println("Tipo de contato inválido. Tente novamente!");
                    }
                } catch (Exception e) {
                    System.out.println("Erro ao adicionar contato: " + e.getMessage());
                }
            }
    
            switch (tipoEscolhido) {
                case EMAIL:
                    System.out.print("\nDigite seu EMAIL: ");
                    infoContato = sc.nextLine();
                    contatos.add(new Contato(TipoContato.EMAIL, infoContato));
                    break;
    
                case INSTAGRAM:
                    System.out.print("\nDigite seu INSTAGRAM: ");
                    infoContato = sc.nextLine();
                    contatos.add(new Contato(TipoContato.INSTAGRAM, infoContato));
                    break;
    
                case TELEFONE:
                    System.out.print("\nDigite seu número de TELEFONE: ");
                    infoContato = sc.nextLine();
                    contatos.add(new Contato(TipoContato.TELEFONE, infoContato));
                    break;
    
                case CELULAR:
                    System.out.print("\nDigite seu número de CELULAR: ");
                    infoContato = sc.nextLine();
                    contatos.add(new Contato(TipoContato.CELULAR, infoContato));
                    break;
    
                case LINKEDIN:
                    System.out.print("\nDigite seu LINKEDIN: ");
                    infoContato = sc.nextLine();
                    contatos.add(new Contato(TipoContato.LINKEDIN, infoContato));
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
    
            System.out.println("\nContato adicionado com sucesso!\n");
            
            System.out.print("\n[1] SIM \n[2] NÃO \nVocê deseja adicionar mais um contato?"); 
            continuar  = sc.nextInt();  

            if(continuar ==2 ){
                decisaoContato = true;
            }
            else if(continuar == 1){
                decisaoContato = false;
            }
            else{
                System.out.println("Opção Inválida");
            }
        
            
                
    
        }
    }
    
    public void listarContatos(){
        
        for(int i = 0; i<contatos.size(); i++){
            System.out.println(contatos.get(i));
        }
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContato(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Contato> getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(ArrayList<Contato> tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}


