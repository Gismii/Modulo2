package SomatorioDeNumeros;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SomatorioDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exception ExcecaoAcimaDeCem = new Exception("A soma nao pode ser maior que cem");
        float media = 0;
        float soma = 0;
        System.out.println("Insira o tamanho do array");
        int t = scanner.nextInt();
        try {
            int array[] = new int [t];
            System.out.println("Entre os valores");
            for(int i=0; i < t; i++){
                array[i] = scanner.nextInt();
                soma += array[i];
                if ( soma > 100){
                    throw ExcecaoAcimaDeCem;
                }
            }media = soma/t;
            System.out.println("Numeros somados:" + t);
            System.out.println("Somas dos numeros:");
            System.out.println("Media dos numeros:" + media);
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("O numero digitado deve ser inteiro");
        }
        catch (Exception c ){
            System.out.println("A soma dos numeros nao pode ser maior que 100");
        }
        finally {
            System.out.println("Encerrar programa");
        }
    }
}
