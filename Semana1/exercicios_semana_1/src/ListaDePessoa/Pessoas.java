package ListaDePessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {

    public static double calcMaltura(List<Pessoa> pessoas) {
        double altura = 0;
        for (Pessoa pessoa : pessoas) {
            altura += pessoa.getAltura();
        }

        return altura / pessoas.size();
    }

    public static double calPorceMenIdades(List<Pessoa> pessoas) {
        int qtPs = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
                qtPs++;
            }
        }
        return (qtPs * 100) / pessoas.size();
    }


    public static Pessoa lancarPessoas(String nome, int idade, double altura) {
        return new Pessoa(nome, idade, altura);
    }

    public static List<Pessoa> lancarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(lancarPessoas("João", 15, 1.82));

        pessoas.add(lancarPessoas("Maria", 16, 1.60));

        pessoas.add(lancarPessoas("Teresa", 14, 1.58));

        pessoas.add(lancarPessoas("Carlos", 21, 1.65));

        pessoas.add(lancarPessoas("Paulo", 17, 1.78));

        return pessoas;
    }

    public static void main(String[] args) {


            List<Pessoa> pessoas = lancarPessoas();
            System.out.println("A média da altura é: " + calcMaltura(pessoas)+
                    "\n"+ " \"A porcentagem de pessoas menores de 16 anos é: " + calPorceMenIdades(pessoas)+"%");

        }
    }















