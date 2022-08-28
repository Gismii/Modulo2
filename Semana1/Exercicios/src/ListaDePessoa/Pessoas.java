package ListaDePessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {

    public static double calcularMediaAltura(List<Pessoa> pessoas) {
        double altura = 0;
        for (Pessoa pessoa : pessoas) {
            altura += pessoa.getAltura();
        }

        return altura/pessoas.size();
    }

    public static double calcularPorcentagemMenoresIdade(List<Pessoa> pessoas) {
        int quantidadePessoa = 0;
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
                quantidadePessoa ++;
            }
        }
        return (quantidadePessoa * 100) / pessoas.size();
    }

    public static List<Pessoa> instanciarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(instanciarPessoa("João",15,1.82));
        pessoas.add(instanciarPessoa("Maria",16,1.60));
        pessoas.add(instanciarPessoa("Teresa",14,1.58));
        pessoas.add(instanciarPessoa("Carlos",21,1.65));
        pessoas.add(instanciarPessoa("Paulo",17,1.78));
        return pessoas;
    }

    public static Pessoa instanciarPessoa(String nome, int idade, double altura) {
        return new Pessoa(nome,idade,altura);
    }
    public static void main(String[] args) {
        List<Pessoa> pessoas = instanciarPessoas();
        System.out.println("A média da altura é: " + calcularMediaAltura(pessoas));
        System.out.println("A porcentagem de pessoas menores de 16 anos é: " + calcularPorcentagemMenoresIdade(pessoas)+"%");
    }
}














