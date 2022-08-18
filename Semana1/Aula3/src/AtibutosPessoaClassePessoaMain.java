
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AtibutosPessoaClassePessoaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoa = new ArrayList<>();


        Pessoa pessoa1 = new Pessoa();
        pessoa1.Idade = 17;
        pessoa1.nome = "Gismi";
        Pessoa pessoa2 = new Pessoa();
        pessoa2.Idade = 32;
        pessoa2.nome = "Joao";
        Pessoa pessoa3 = new Pessoa();
        pessoa3.Idade = 23;
        pessoa3.nome = "André";

        Pessoa.add(pessoa1);
        Pessoa.add(pessoa2);
        Pessoa.add(pessoa3);



            //System.out.println("pessoa com maior idade é : ");


        }
    }





