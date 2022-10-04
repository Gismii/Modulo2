package TratandoExecoesEmArray;

import java.util.Scanner;
public class ExcecaoEmArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        try {
            System.out.println("Lembrando que a primeira posição vai ser 0");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Digite o numero da posição que deseja inserir o valor:");
                i = scanner.nextInt();
                System.out.println("Digite o valor:");
                array[i] = Integer.parseInt(scanner.next());
            }
            scanner.close();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nPosição inexistente");
            System.out.println(e);
        }
        catch(NumberFormatException c){
            System.out.println(c.getMessage() + "\tO valor deve ser um numero");
            System.out.println(c);
        }
        finally{
            System.out.println("\nEncerrar programa");
        }
    }
}

