import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividenvo;
        int divisor;
        Integer resultado = null;

        try {
            System.out.println("Informe o dividendo:");
            dividenvo = scanner.nextInt();
            System.out.println("Informe o divisor:");
            divisor = scanner.nextInt();
            resultado = dividenvo/divisor;
        }catch (InputMismatchException e) {
            System.out.println("Informe um valor numérico.");
        }
        catch(ArithmeticException e) {
            System.out.println("Falha ao tentar dividir por 0.");
        }

        System.out.println("O resultado da divisão é: " + resultado);
    }
}