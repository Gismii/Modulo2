import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    String nome;
    int idade;

    static double altura;

    @Override
    public String toString() {
        return "ListaPessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    public static double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ListaPessoas(double altura) {
        this.altura = altura;
    }

    public ListaPessoas() {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void lista() {

        ListaPessoas listaPessoas = new ListaPessoas();

    }


    public static void main(String[] args) {

        List<String> pessoa = new ArrayList<>();

        ListaPessoas listaPessoas = new ListaPessoas();
        double medi=0;
        double fracao=0;

        for (int i = 0; i < 1; i++) {
            listaPessoas.setNome("Joao");
            listaPessoas.setIdade(15);
            listaPessoas.setAltura(1.82);
            medi=getAltura();



            pessoa.add(String.valueOf(listaPessoas));

            listaPessoas.setNome("Maria");
            listaPessoas.setIdade(16);
            listaPessoas.setAltura(1.60);
            medi=medi+getAltura();

            pessoa.add(String.valueOf(listaPessoas));

            listaPessoas.setNome("Teresa");
            listaPessoas.setIdade(14);
            listaPessoas.setAltura(1.58);
           medi=medi+getAltura();

            pessoa.add(String.valueOf(listaPessoas));

            listaPessoas.setNome("Carlos");
            listaPessoas.setIdade(21);
            listaPessoas.setAltura(1.65);
           medi=medi+getAltura();;

            pessoa.add(String.valueOf(listaPessoas));

            listaPessoas.setNome("Paulo");
            listaPessoas.setIdade(17);
            listaPessoas.setAltura(1.78);
            medi=medi+getAltura();

            pessoa.add(String.valueOf(listaPessoas));

        }
        //System.out.println(" Lista de pessoas:\n" + pessoa);
        //System.out.print(" A media de altura dessa lista é "+medi/pessoa.size());



        }


    }





