import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {
    public static int obterIntValido() {
        Integer numero = null;

        while (numero == null){
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println("Informe um número:");
                numero = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Informe um número válido");
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        int n = obterIntValido();
        int n1 = obterIntValido();

        System.out.println(n + " - " + n1);
    }
}
