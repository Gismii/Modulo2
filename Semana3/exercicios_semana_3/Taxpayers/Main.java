package Taxpayers;

//Hierarchyy.Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
// Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde,
// 50% destes gastos são abatidos no imposto. Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica:
// (50000 * 25%) - (2000 * 50%) = 11500.00
//
//Hierarchyy.Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
// Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00.


import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

    public static void main (String[] args) {

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat money = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        Scanner scanner =new Scanner(System.in);

        Individual_taxpayers individual_taxpayers = new Individual_taxpayers();
        Corporate_taxpayers corporate_taxpayers = new Corporate_taxpayers();
        System.out.println("CORPORATE TAX PAYERS------------------------------------");
        System.out.println("                         ");
        System.out.println("Name: ");
        corporate_taxpayers.setName(scanner.next());
        System.out.println("Income: ");
        corporate_taxpayers.setRendaAnual(scanner.nextDouble());
        System.out.println("Number Employees: ");
        corporate_taxpayers.setNumberEmployees(scanner.nextDouble());
        corporate_taxpayers.calculoCt();

        System.out.println(corporate_taxpayers.getName()+" taxpayer has "+""+
                dinheiro.format(corporate_taxpayers.getTax()-corporate_taxpayers.getRendaAnual())+" dollars to pay.");

        System.out.println("                         ");
        System.out.println("INDIVIDUAL TAX PAYERS------------------------------------");
        System.out.println("                         ");

        System.out.println("Name: ");
        individual_taxpayers.setName(scanner.next());
        System.out.println("Income: ");
        individual_taxpayers.setRendaAnual(scanner.nextDouble());
        System.out.println("Medical Expenses: ");
        individual_taxpayers.setMedicalExpenses(scanner.nextDouble());
        individual_taxpayers.calculoIt();

        System.out.println(individual_taxpayers.getName()+" taxpayer has "+""+
                dinheiro.format(individual_taxpayers.getTax()-individual_taxpayers.getRendaAnual())+" dollars to pay.");

        System.out.println("             ");
        System.out.println("---Total tax revenue: "+dinheiro.format(individual_taxpayers.getTax()-individual_taxpayers.getRendaAnual()
                + corporate_taxpayers.getTax()-corporate_taxpayers.getRendaAnual()));




    }
}
