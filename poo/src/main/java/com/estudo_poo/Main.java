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
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            Jogador jogador = new Jogador();      
            Time time1 = new Time();
            Time time2 = new Time();

            int escolha = 0;
            int escolhaTime = 0;

            do {
                System.out.println("[ 1 ] Configurar Times \n[ 2 ] Adicionar Jogador e Definir Time \n[ 3 ] Remover Jogador \n[ 4 ] Listar Jogadores Time \n[ 5 ] Sair \nDigite a opção que você deseja executar: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja configurar: ");
                        escolhaTime = sc.nextInt();

                        if (escolhaTime == 1) {
                            time1 = Time.CadastrarTime();
                            System.out.println(time1.toString());
                        } 
                        else if (escolhaTime == 2) {

                            time2 = Time.CadastrarTime();
                            System.out.println(time2.toString());
                        }

                        break;

                    case 2:
                        System.out.println("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja adicionar o jogador: ");
                        escolhaTime = sc.nextInt();


                        if (escolhaTime == 1) {
                            jogador.CadastrarJogador(time1);
                            time1.adicionarJogadorTime(jogador);

                        } 
                        else if (escolhaTime == 2) {
                            jogador.CadastrarJogador(time2);
                            time2.adicionarJogadorTime(jogador);
                        }
                        break;

                    case 3:
                        System.out.println("Essa opção não existe ainda");
                        break;

                    case 4:
                        System.out.println("\n[ 1 ] Time 1 \n[ 2 ] Time 2 \nDigite qual time você deseja listar os jogadores: ");
                        escolhaTime = sc.nextInt();

                        if (escolhaTime == 1) {
                            time1.listarJogadores();

                        } else if (escolhaTime == 2) {
                            time2.listarJogadores();

                        }
                        break;

                    case 5:
                        System.out.println("Saindo do programa...");
                        break;

                    default:
                        System.out.println("Essa opção não existe. Tente novamente!!");
                }

            } while (escolha != 5);

            sc.close();

        } 
        // Ao terminar o programa mudar a messagem: "Erro no programa. Voltando para o menu!"
        catch (Exception e) {
            System.out.println("Deu erro de: " + e);
        }
    }
}