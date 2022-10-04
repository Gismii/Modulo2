package GerandoFatura;

public class Teste {
    public static void main(String[] args) {


        Faturas faturas = new Faturas();

        faturas.setDescrição("CONTA DE LUZ EM ATRASO");
        faturas.setPrecoItemUnidade(100.00);
        faturas.setQuantidadeCompradaItem(6);
        faturas.setNumero("000001");
        System.out.println("                     ");
        System.out.println("MODELO DE FATURA 1: ");
        System.out.println("                     ");
        System.out.println("O valor da sua fatura "+faturas.getDescrição()+" atualizada é N°: "+faturas.getNumero()+", "+" Total: R$"+faturas.getTotalFatura());
        System.out.println("                     ");
        System.out.println("MODELO DE FATURA 2: ");
        System.out.println("                     ");
        System.out.println(faturas+" TOTAL :R$"+faturas.getTotalFatura());


        // ZERANDO A FATURA COM O METODO GET PUXANDO APENAS OS ATRIBUTOS VAZIO//

        faturas = new Faturas();

        faturas.getDescrição();
        faturas.getPrecoItemUnidade();
        faturas.getQuantidadeCompradaItem();
        faturas.getNumero();
        System.out.println("                     ");
        System.out.println("MODELO DE FATURA 1: ");
        System.out.println("                     ");
        System.out.println("O valor da sua fatura "+faturas.getDescrição()+" atualizada é N°: "+faturas.getNumero()+", "+" Total: R$"+faturas.getTotalFatura());
        System.out.println("                     ");
        System.out.println("MODELO DE FATURA 2: ");
        System.out.println("                     ");
        System.out.println(faturas+" TOTAL :R$"+faturas.getTotalFatura());
    }
}
