public class Pessoas {
    String nome;
    Integer idade;

    void verificarMaiorIdade(Pessoas pessoa) {
        if(pessoa.idade >= 18) {
            System.out.println(pessoa.nome + " É maior de idade");
        } else {
            System.out.println(pessoa.nome + " É menor de idade");
        }
    }}