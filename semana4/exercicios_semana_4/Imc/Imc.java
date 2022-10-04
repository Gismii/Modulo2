package Imc;

import java.util.Scanner;

public class Imc {
    private String nomeCompleto;
    private double peso;
    private double altura;
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto() {
        this.nomeCompleto = nomeCompleto;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) throws NumberFormatException {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) throws NumberFormatException{
        this.altura = altura;
    }
    public double calcularImc() throws ArithmeticException {
        return this.peso/Math.pow(this.altura,2);
    }
}

