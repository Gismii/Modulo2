package PfePj;

public class PessoaFisica extends Contribuintes{

    public PessoaFisica(String nome, double rendaAnual) {
        super(nome, rendaAnual);
    }

    private static final double rendaAnual(){

        return 0;
    }
    private double gastosSaude;


    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}
