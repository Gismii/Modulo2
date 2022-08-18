import Time.Jogador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Jogador> escalacao= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcaoUsuario = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        do {
            System.out.println("1 - Inserir jogador\n2 - Verificar condição dos jogadores");
            opcaoUsuario = scanner.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    for (int i =0; i < 1; i++){

                        System.out.println("Informe o nome do jogador: ");
                        String nomeJogador = scanner.next();
                        System.out.println("Informe o apelido: ");
                        String nomeApelido = scanner.next();
                        System.out.println("Informe a condicao do jogador: ");
                        String condicaoJogador = scanner.next();
                        System.out.println("Informe o numero do jogador: ");
                        int numeroJogador = scanner.nextInt();
                        System.out.println("Informe a posição do jogador: ");
                        String posicaoJogador = scanner.next();
                        System.out.println("Informe a data de nscimento do jogador: ");
                        Date dataNascimentoJogador = sdf.parse(scanner.next());

                        Jogador jogador =
                                new Jogador(numeroJogador,nomeJogador,nomeApelido,condicaoJogador,
                                        posicaoJogador,dataNascimentoJogador);
                        escalacao.add(jogador);

                    }
                    break;
                case 2:
                    escalacao.forEach(jogador -> {
                        if(jogador.verificarCondicaoJogador()) {
                            System.out.println("O jogador " + jogador.getNome() + " está apto para jogar.");
                        } else {
                            System.out.println("O jogador " + jogador.getNome() + " não está apto para jogar.");
                        }
                    });
                    break;

            }
        } while (opcaoUsuario != 9);
    }
}

