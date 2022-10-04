package TaxaContaEspecial;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        contaCorrenteEspecial.setSaldo(100.00);
        contaCorrenteEspecial.sacar(20.00);
        contaCorrente.setSaldo(100.00);
        contaCorrente.sacar(30.00);
        System.out.println(contaCorrenteEspecial.getSaldo());
        System.out.println(contaCorrente.getSaldo());
    }
}

