package EmprestimoLivros;

import java.util.*;

public class Livros extends Emprestimo{
    public static void main(String[] args) {
        int opcaoSelecionada = 0;
        Scanner scanner = new Scanner(System.in);
        List<String> clientesLivros = new ArrayList<>();


        for (int i =0; i<5; i++){
            System.out.println("--Bem vindos ao emprestimo de Livros--");

            System.out.println("Informe o titulo do livro : ");
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setTituloDoLivro(scanner.next());
            clientesLivros.add(emprestimo.getTituloDoLivro());

            System.out.println("Informe o seu nome : ");
            emprestimo.setNomePessoa(scanner.next());
            clientesLivros.add(emprestimo.getNomePessoa());


        }

        System.out.println("Lista de emprestimos: ");
        System.out.println(clientesLivros);
    }
}