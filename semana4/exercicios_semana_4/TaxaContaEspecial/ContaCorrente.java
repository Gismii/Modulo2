package TaxaContaEspecial;

public class ContaCorrente {
    private static final Double TAXA_SAQUE = 1.005;
    private Double saldo;
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void deposiar(Double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void sacar(Double valorSaque){
        this.saldo -= valorSaque * TAXA_SAQUE;
    }
    public Double consultarSaldo(){
        return this.saldo;
    }
}