package TaxaContaEspecial;

public class ContaCorrenteEspecial extends ContaCorrente{
    private static final Double TAXA_SAQUE = 1.001;
    @Override
    public void sacar(Double valorSaque) {
        this.setSaldo(this.getSaldo() -  valorSaque * TAXA_SAQUE);
    }
}
