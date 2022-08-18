package ContaBancaria;

public class BankOfAmerica {

    int Cc;
    String titular;
    double saldo;

    void depositar(double valor){

        this.saldo = this.saldo + valor;

        
    }
    void sacar(double valor){

        this.saldo = this.saldo + valor;

    }

    void imprimirSaldo() {
        System.out.println("Saldo da conta é "+ this.saldo);
    }
}
