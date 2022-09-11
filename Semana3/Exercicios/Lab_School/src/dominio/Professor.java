package dominio;

public class Professor extends Pessoa {
    private String formacaoAcademica;

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getExperienciaDesenvolvimento() {
        return experienciaDesenvolvimento;
    }

    public void setExperienciaDesenvolvimento(String experienciaDesenvolvimento) {
        this.experienciaDesenvolvimento = experienciaDesenvolvimento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String experienciaDesenvolvimento;
    private String estado;
    public Professor(String nome, String telefone, String dataDeNascimento, String cpf, int identificadorCodigo) {
        super(nome, telefone, dataDeNascimento, cpf, identificadorCodigo);
    }

    public Professor() {

    }


}
