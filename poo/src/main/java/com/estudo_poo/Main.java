package com.estudo_poo;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import com.estudo_poo.entities.Jogador;
import com.estudo_poo.entities.Time;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        try {
            Locale.setDefault(Locale.US);


            Time time1 = new Time();
            Time time2 = new Time();
            
            time1 = null;
            time2 = null;

            int escolha = 0;
            int escolhaTime = 0;

            do {
                System.out.print("[ 1 ] Configurar Times \n[ 2 ] Adicionar Jogador e Definir Time \n[ 3 ] Remover Jogador \n[ 4 ] Listar Jogadores Time \n[ 5 ] Sair \nDigite a opção que você deseja executar: ");
                escolha = sc.nextInt();
                
                switch (escolha) {
                    case 1:
                        System.out.print("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja configurar: ");
                        escolhaTime = sc.nextInt();

                        if (escolhaTime == 1) {
                            time1 = Time.CadastrarTime();
                            System.out.println(time1.toString());
                            
                        } 
                        else if (escolhaTime == 2) {
                            time2 = Time.CadastrarTime();
                            System.out.println(time2.toString());
                        } 
                        else {
                            System.out.println("Opção de time inválida.");
                        }
                        break;

                    case 2:
                        System.out.print("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja adicionar o jogador: ");
                        escolhaTime = sc.nextInt();

                        Jogador novoJogador = new Jogador();

                        if (escolhaTime == 1) {
                            if (time1 == null) {
                                System.out.println("O Time 1 ainda não foi configurado.");
                                break;
                            }
                            
                            novoJogador = Jogador.CadastrarJogador(time1);
                            
                            if (novoJogador != null) {
                                time1.adicionarJogadorTime(novoJogador);
                            }
                        } 
                        else if (escolhaTime == 2) {
                            if (time2 == null) {
                                System.out.println("O Time 2 ainda não foi configurado.");
                                break;
                            }
                            
                            novoJogador = Jogador.CadastrarJogador(time2);
                            if (novoJogador != null) {
                                time2.adicionarJogadorTime(novoJogador);
                            }
                        } 
                        else {
                            System.out.println("Opção de time inválida.");
                        }
                        break;

                    case 3:
                        System.out.println("Essa opção não existe ainda");
                        break;

                    case 4:
                        System.out.print("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja listar os jogadores: ");
                        escolhaTime = sc.nextInt();

                        if (escolhaTime == 1) {
                            
                            if (time1 == null) {
                                System.out.println("O Time 1 ainda não foi configurado.");
                            } 
                            else {
                                time1.listarJogadores();
                            }
                        } else if (escolhaTime == 2) {
                            
                            if (time2 == null) {
                                System.out.println("O Time 2 ainda não foi configurado.");
                            } 
                            else {
                                time2.listarJogadores();
                            }
                        } 
                        else {
                            System.out.println("Opção de time inválida.");
                        }
                        break;

                    case 5:
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Essa opção não existe. Tente novamente!");
                }


            } while (escolha != 5);

            
            
        } catch (Exception e) {
            // System.out.println("Erro no programa. Voltando para o menu!");
            System.out.println("Detalhes do erro: " + e);
        }finally{
            sc.close();
        }
    }
}
