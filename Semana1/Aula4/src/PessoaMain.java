import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoas pessoa;
        Scanner scanner = new Scanner(System.in);
        List<Pessoas> pessoas = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            pessoa = new Pessoas();
            System.out.println("Informe o nome da pessoa:");
            pessoa.nome = scanner.next();
            System.out.println("Informe a idade da pessoa:");
            pessoa.idade = scanner.nextInt();
            pessoas.add(pessoa);
        }
        pessoas.forEach(pessoaLista -> {
            pessoaLista.verificarMaiorIdade(pessoaLista);

        });
    }
}
