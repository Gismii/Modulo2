package FormaDePagamento;

import java.util.Scanner;
public class FormaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("imforme o valor de pagamento:");
        double valorCobranca = scanner.nextDouble();
        System.out.println("escolha a forma de pagamento;\n1-Pix\n2-Boleto\n3-Cartao");
        int opcaousuario = scanner.nextInt();
        switch (opcaousuario) {
            case 1:
                System.out.println("O valor final da cobranca é RS" + valorCobranca * 0.85);
                break;
            case 2:
                System.out.println("O valor final da cobranca é RS" + valorCobranca * 0.90);
                break;
            case 3:
                System.out.println("1-Cartao de credito\n2-Cartao de debito");
                opcaousuario = scanner.nextInt();
                switch (opcaousuario) {
                    case 1:
                        System.out.println("Imforme a quantidade de parcelas:");
                        int quantidadeParcela = scanner.nextInt();
                        System.out.println("O valor final da cobranca é RS" + valorCobranca + "\nEm" +
                                quantidadeParcela + "de " + valorCobranca / quantidadeParcela);
                        break;
                    case 2:
                        System.out.println("O valor final da cobranca é RS" + valorCobranca * 0.95);
                        break;
                }
        }
    }
}

