package Imc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imc imc = new Imc();
        try {
            System.out.println("Insira seu nome completo");
            imc.setNomeCompleto();
            String nomeCompleto = scanner.nextLine();
            System.out.println("Informe seu peso");
            imc.setPeso(Double.parseDouble(scanner.next()));
            System.out.println("Informe sua altura");
            imc.setAltura(Double.parseDouble(scanner.next()));
            System.out.println("O seu imc é " + imc.calcularImc());
        } catch (NumberFormatException e) {
            System.out.println("O valor informado deve ser um número");
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }
    }
}
