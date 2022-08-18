import java.util.*;

//Solicite números de 0.0 a 10.0 armazenando em uma coleção de Double,
// até que fim seja digitado e apresente o resultado para :
//Soma (totalizador) de todos números digitados;
//Média de todos números digitados;
//Maior número digitado;
//Menor número digitado;
//Quantidade de números armazenados;
//
//Lembre-se de utilizar o que aprendemos sobre funções e modularização.

public class ListaNumeros {

    public static Double calcularSomatorio(List<Double> numeros) {
        Double somatorio = 0.0;

        for (Double numero : numeros) {
            somatorio += numero;
        }

        return somatorio;
    }

    public static Double getMaiorNumero(List<Double> numeros) {
        numeros = ordenarLista(numeros);
        return numeros.get(numeros.size() - 1);
    }

    public static Double getMenorNumero(List<Double> numeros) {
        return Collections.min(numeros);
    }

    public static List<Double> ordenarLista(List<Double> numeros) {
        numeros.sort(Comparator.naturalOrder());
        return numeros;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        String numeroDigitado = "";

        do{
            System.out.println("Informe um número entre 0.0 e 10.0:");
            numeroDigitado = scanner.next();

            if(!numeroDigitado.equals("fim")) {
                Double numero = Double.valueOf(Integer.parseInt(numeroDigitado));

                if(numero >=0 && numero <= 10) {
                    numeros.add(numero);
                }
            }
        }while(!numeroDigitado.equals("fim"));

        Double somatorio = calcularSomatorio(numeros);

        System.out.println("O somatório dos número digitados foi: " + somatorio +
                "\nO maior número digitado foi: " + getMaiorNumero(numeros) + "\nO menor número digitado foi: "
                + getMenorNumero(numeros) +
                "\nA média dos números é: " + (somatorio/numeros.size()) +
                "\nO total de números digitados foi: " + numeros.size());
    }
}