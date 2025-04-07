package com.estudo_poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import com.estudo_poo.entities.Jogador;
import com.estudo_poo.entities.Time;

public class Main {
    public static void main(String[] args) throws ParseException {
    
        try {
            
            Jogador jogador = new Jogador();      
            Time time1 = new Time();
            Time time2 = new Time();
            
            time1.setNomeTime("Time 1");
            time2.setNomeTime("Time 2");
            
            Locale.setDefault(Locale.US);					
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            int escolha = 0;
            int escolhaTime = 0;
            do { 
            
                System.out.println("[ 1 ] Adicionar Jogador \n[ 2 ] Remover Jogador \n[ 3 ] Definir o time de cada Jogador \n[ 4 ] Listar Times \n[ 5 ] Sair \nDigite a opção que você deseja executar: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case (1):
                        jogador.CadastrarJogador();

                        System.out.println("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja adicionar o jogador: ");
                        escolhaTime  = sc.nextInt();
                            
                        if(escolhaTime == 1){
                            time1.adicionarJogadorTime(jogador);
                        }
                        else if(escolhaTime == 2){
                            time2.adicionarJogadorTime(jogador);
                        }

                        break;
                    case(2): 
                        
                        
                        break;

                    case(3):
                        System.out.println("Opção inválida no momento");
                        break;

                    case(4):
                        System.out.println("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja listar os jogadores: ");
                        escolhaTime = sc.nextInt();
                        
                        if(escolhaTime == 1){
                            time1.listarJogadores();
                        }
                        else if(escolhaTime == 2){
                            time2.listarJogadores();
                        }

                        break;
                    default:
                        System.out.println("Essa opção não existe. Tente novamente!!");
                }

            } while (escolha != 5);



            sc.close();
    
            
        } 
        catch (Exception e) {
            System.out.println("Deu erro de: " + e);
        }
    }
}