import java.util.Scanner;

public class MathMAxx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        int n1;
        int n2;
        int n3;


        System.out.println("Digite 3 numeros  inteiros: " );

        n1=scanner.nextInt();
        n2=scanner.nextInt();
        n3=scanner.nextInt();

        int maior = Math.max(n1, n2);
            maior = Math.max(maior, n3);


        System.out.println (maior);


    }
}