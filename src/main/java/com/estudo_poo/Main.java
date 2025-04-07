package com.estudo_poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import com.estudo_poo.entities.Jogador;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);					
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua altura: ");
        float altura = sc.nextFloat();
        System.out.print("Digite sua data de nascimento (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());
        System.out.println("Digite sua posição: ");
        String posicao = sc.next();
        System.out.println("Digite o n° da sua camisa: ");
        int camisa = sc.nextInt();

        Jogador jogador = new Jogador(nome,altura,data,posicao,camisa);

        System.out.println(jogador.toString());


        sc.close();
    }
}