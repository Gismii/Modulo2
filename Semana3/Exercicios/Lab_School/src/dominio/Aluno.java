package dominio;

public class Aluno extends Pessoa {
    @Override
    public String toString() {
        return "Aluno{" +
                "condicao='" + condicao + '\'' +
                ", nota=" + nota +
                '}';
    }

    private String condicao;
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public Aluno(String nome, String telefone, String dataDeNascimento, String cpf, int identificadorCodigo ) {
        super(nome, telefone, dataDeNascimento, cpf,  identificadorCodigo);

   }
    public Aluno() {


    }



}

