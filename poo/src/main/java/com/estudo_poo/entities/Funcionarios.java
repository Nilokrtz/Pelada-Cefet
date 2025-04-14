package com.estudo_poo.entities;
import java.util.ArrayList;

public class Funcionarios {

    private String cpf;
    private String nomeCompleto;
    private String dataNascimento;
    private float salario;
    private String funcao;
    private ArrayList<Contato> tipoContato;
    public ArrayList<Contato> getTipoContato() {
        return tipoContato;
    }
    
    public void setTipoContato(ArrayList<Contato> tipoContato) {
        this.tipoContato = tipoContato;
    }
    private ArrayList<Contato> contato;

    public ArrayList<Contato> getContato() {
        return contato;
    }

    public void setContato(ArrayList<Contato> contato) {
        this.contato = contato;
    }
    
    public Funcionarios() {
    
    }
    
    public Funcionarios(String cpf, String nomeCompleto, String dataNascimento, float salario, String funcao, ArrayList<Contato> contato, ArrayList<Contato> tipoContato) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.funcao = funcao;
        this.tipoContato = new ArrayList<>();
        this.contato = new ArrayList<>();
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