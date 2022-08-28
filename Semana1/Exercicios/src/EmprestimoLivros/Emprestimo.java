package EmprestimoLivros;

public class Emprestimo {
    String nomePessoa;

    String tituloDoLivro;

    @Override
    public String toString() {
        return "Emprestimo{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", tituloDoLivro='" + tituloDoLivro + '\'' +
                '}';
    }

    public Emprestimo() {
        this.nomePessoa = nomePessoa;
        this.tituloDoLivro = tituloDoLivro;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getTituloDoLivro() {
        return tituloDoLivro;
    }

    public void setTituloDoLivro(String tituloDoLivro) {
        this.tituloDoLivro = tituloDoLivro;
    }

    public void setTituloDoLivro() {

    }
}
