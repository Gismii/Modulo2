import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            imc imc = new imc();
            try {
                System.out.println("Informe seu peso: ");
                imc.setPeso(Double.parseDouble(scanner.next()));
                System.out.println("Informe sua altura: ");
                imc.setAltura(Double.parseDouble(scanner.next()));
                System.out.println("O seu imc é " + imc.calcularIMC());
            } catch (NumberFormatException e) {
                System.out.println("O valor informado deve ser um número.");
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero.");
            }
        }
    }
