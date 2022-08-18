package PfePj;

public class PessoaJuridica extends Contribuintes{

    public PessoaJuridica(String nome, double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int quantidadeFuncionarios;
    @Override
    public double calcularImposto() {
        return 0;
    }
}
