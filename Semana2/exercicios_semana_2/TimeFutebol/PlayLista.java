package TimeFutebol;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PlayLista {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Jogadores jogadores = new Jogadores();


  List<Jogadores> listaDeJogadores = new ArrayList<>();
  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


  jogadores = new Jogadores();
  jogadores.setNome("NEYMAR");
  jogadores.setId(1);
  jogadores.setApelido("NEY");
  jogadores.setDataDeNascimento(new Date());
  jogadores.setNumero(10);
  jogadores.setPosição("Goleiro");
  jogadores.setQualidade(5);
  jogadores.setCartões(3);
  System.out.println("       ");
  if (jogadores.cartões == 3) {

      jogadores.setSuspenso(true);

   System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
      System.out.println("---------");
  }
     System.out.println(jogadores);
    System.out.println("---------");


    jogadores = new Jogadores();
    jogadores.setNome("Gismi");
    jogadores.setId(2);
    jogadores.setApelido("Mosquito");
    jogadores.setDataDeNascimento(new Date());
    jogadores.setNumero(9);
    jogadores.setPosição("Atacante");
    jogadores.setQualidade(5);
    jogadores.setCartões(2);
    System.out.println(jogadores);
    System.out.println("       ");
    if (jogadores.getCartões() == 3) {

     System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
    }
      System.out.println("---------");


    jogadores = new Jogadores();
    jogadores.setNome("GalvãoBueno");
    jogadores.setId(3);
    jogadores.setApelido("Bueno");
    jogadores.setDataDeNascimento(new Date());
    jogadores.setNumero(8);
    jogadores.setPosição("Volante");
    jogadores.setQualidade(3);
    jogadores.setCartões(1);
    System.out.println(jogadores);
    System.out.println("       ");
      if (jogadores.getCartões() == 3) {
       System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
      }
        System.out.println("---------");

    jogadores = new Jogadores();
    jogadores.setNome("Mycomi diekison");
    jogadores.setId(4);
    jogadores.setApelido("Diekizinho");
    jogadores.setDataDeNascimento(new Date());
    jogadores.setNumero(7);
    jogadores.setPosição("zagueiro");
    jogadores.setQualidade(7);
    jogadores.setCartões(0);
    System.out.println(jogadores);
    System.out.println("       ");
         if (jogadores.getCartões() == 3) {
          System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
         }
          System.out.println("---------");

    jogadores = new Jogadores();
    jogadores.setNome("Roberto carlis");
    jogadores.setId(5);
    jogadores.setApelido("Cantor");
    jogadores.setDataDeNascimento(new Date());
    jogadores.setNumero(6);
    jogadores.setPosição("Meio campo");
    jogadores.setQualidade(7);
    jogadores.setCartões(0);
    System.out.println(jogadores);
    System.out.println("       ");
           if (jogadores.getCartões() == 3) {
            System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
           }
             System.out.println("---------");


             jogadores = new Jogadores();
             jogadores.setNome("Valdomiro santiago");
             jogadores.setId(6);
             jogadores.setApelido("Profeta");
             jogadores.setDataDeNascimento(new Date());
             jogadores.setNumero(5);
             jogadores.setPosição("Lateral diereita");
             jogadores.setQualidade(10);
             jogadores.setCartões(0);
             System.out.println(jogadores);
             System.out.println("       ");
             if (jogadores.getCartões() == 3) {
              System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
             }
               System.out.println("---------");

               jogadores = new Jogadores();
               jogadores.setNome("Pedro");
               jogadores.setId(7);
               jogadores.setApelido("Pedra");
               jogadores.setDataDeNascimento(new Date());
               jogadores.setNumero(4);
               jogadores.setPosição("Lateral Esquerdo");
               jogadores.setQualidade(10);
               jogadores.setCartões(0);
               System.out.println(jogadores);
               System.out.println("       ");
               if (jogadores.getCartões() == 3) {
                System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
               }
                 System.out.println("---------");

                 jogadores = new Jogadores();
                 jogadores.setNome("Muller");
                 jogadores.setId(8);
                 jogadores.setApelido("Mula");
                 jogadores.setDataDeNascimento(new Date());
                 jogadores.setNumero(3);
                 jogadores.setPosição("atacante");
                 jogadores.setQualidade(2);
                 jogadores.setCartões(0);
                 System.out.println(jogadores);
                 System.out.println("       ");
                 if (jogadores.getCartões() == 3) {
                  System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
                 }
                   System.out.println("---------");

                   jogadores = new Jogadores();
                   jogadores.setNome("Tiago");
                   jogadores.setId(9);
                   jogadores.setApelido("Perna de pau");
                   jogadores.setDataDeNascimento(new Date());
                   jogadores.setNumero(2);
                   jogadores.setPosição("Meia");
                   jogadores.setQualidade(2);
                   jogadores.setCartões(0);
                   System.out.println(jogadores);
                   System.out.println("       ");
                   if (jogadores.getCartões() == 3) {
                    System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
                   }
                     System.out.println("---------");

                     jogadores = new Jogadores();
                     jogadores.setNome("Bruno");
                     jogadores.setId(10);
                     jogadores.setApelido("Pipoca");
                     jogadores.setDataDeNascimento(new Date());
                     jogadores.setNumero(1);
                     jogadores.setPosição("Centravante");
                     jogadores.setQualidade(2);
                     jogadores.setCartões(0);
                     System.out.println(jogadores);
                     System.out.println("       ");
                     if (jogadores.getCartões() == 3) {
                      System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
                     }
                       System.out.println("---------");

                       jogadores = new Jogadores();
                       jogadores.setNome("Kaka");
                       jogadores.setId(11);
                       jogadores.setApelido("K");
                       jogadores.setDataDeNascimento(new Date());
                       jogadores.setNumero(33);
                       jogadores.setPosição("Faz tudo");
                       jogadores.setQualidade(2);
                       jogadores.setCartões(0);
                       System.out.println(jogadores);
                       System.out.println("       ");
                       if (jogadores.getCartões() == 3) {
                        System.out.println(jogadores.getNome() + ":  🚫 Jogador inapto para o jogo");
                       }
                       System.out.println("---------");


                      }
                     }







