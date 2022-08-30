package MusicCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayMusic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<GerenciadorMusica> musicas = new ArrayList<>();

        GerenciadorMusica gerenciadorMusica = new GerenciadorMusica();

        int escolha;

        do {
            System.out.println("1 - Cadastrar Música\n" +
                    "2 - Executar/Parar\n" +
                    "3 - Sair\n");

            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Informe o artista: ");
                    gerenciadorMusica.setArtista(scanner.next());
                    musicas.add(gerenciadorMusica);
                    System.out.println("Informe o titulo: ");
                    gerenciadorMusica.setTitulo(scanner.next());
                    System.out.println("Musica cadastrada com sucesso!!");
                    System.out.println("Deseja ouvir digite 1 - Digite 2 - para retornar ao menu: ");
                    int play = scanner.nextInt();
                    switch (play) {

                        case 1:
                            gerenciadorMusica.isEmExecucao();

                            if (gerenciadorMusica.emExecucao=true) {

                                System.out.println("Musica " + musicas.toString() + "em execução!");
                            }

                    }
                case 2:
                    System.out.println("informe a musica que deseja ouvir: " + musicas.toString() + " ou Pressione [P] para encerrar a musica em execução: ");
                    String nome=scanner.next();
                    if (nome.equals(musicas)==gerenciadorMusica.emExecucao){

                        System.out.println("Musica já em execução!!");

                    } switch (nome){

                    case "p":
                    gerenciadorMusica.setEmExecucao(false);
                    System.out.println("Musica encerrada!!");

                }


            }


        }while (escolha!=3) ;
    }

}
