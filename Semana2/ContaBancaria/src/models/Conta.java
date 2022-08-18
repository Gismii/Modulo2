package models;

import java.util.ArrayList;

public class Conta {

    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;
    private ArrayList<Double> movimentacoes;

    public Conta(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = 0.0;
        this.movimentacoes = new ArrayList<>();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public ArrayList<Double> getMovimentacoes() {
        return movimentacoes;
    }

    //        métodos : depositar, sacar, imprimir saldo, imprimir extrato.
    public void depositar(double valor) {
        this.saldoConta = this.saldoConta + valor ;
        getMovimentacoes().add(valor);
    }

    public void sacar(double valor) {
        this.saldoConta = this.saldoConta - valor ;
        getMovimentacoes().add(valor*(-1));
    }

    public void imprimirSaldo() {
        System.out.println("Saldo da conta = " + this.saldoConta);
    }

    public void imprimirExtrato() {
        for (Double movimentacao : getMovimentacoes() ) {
            System.out.println(movimentacao);
        }
    }

}