package com.estudo_poo;

import com.estudo_poo.entities.Funcionarios;

public class TestMain {
    
    public static void main(String[] args) {
        
        Funcionarios funcionario1 = new Funcionarios();
        
        funcionario1.pegarEndereco();
        funcionario1.pegarContato();
        funcionario1.listarContatos();
    }
}
