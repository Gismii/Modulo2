import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AgendaTelefonicaMain {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> agenda = new ArrayList<>();
        int opcaoSelecionada = 0;

        do {
            System.out.println("1 - Salvar contato\n2 - Listar Contatos\n 3 - Sair");
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada) {
                case 1:
                    Contato contato = new Contato();
                    System.out.println("Informe o nome do contato");
                    contato.nome = scanner.next();
                    System.out.println("Informe o número do telefone");
                    contato.numero = scanner.next();
                    if (agenda.isEmpty()) {
                        agenda.add(contato);
                    } else {
                        for (int i = 0; i < agenda.size(); i++) {
                            if (!agenda.get(i).equals(contato)) {
                                agenda.add(contato);
                                System.out.println("Contato salvo com sucesso!");
                                
                            }
                        }
                    }
                    break;

                case 2:
                    agenda.forEach(contatoAgenda -> {
                        System.out.println(contatoAgenda.toString());
                    });
                    break;
            }
        } while (opcaoSelecionada != 3);

    }

}



