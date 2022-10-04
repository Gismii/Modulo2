

package Hierarchyy;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;


public class Test {
    public static void main(String[] args) {

        //Dados para teste:
        //O salário base para todos funcionários é de R$ 2000.00 ,
        // para Fiscal o salário é o salário base acrescido de 50% ,
        // para Gerente o salário é o salário base multiplicado por 4.
        //Gerente possui um Bônus no valor de 20% do salário base;

        Employee employee = new Employee();
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat money = (DecimalFormat) DecimalFormat.getCurrencyInstance();

        System.out.println(" ");
        System.out.println("Attendant payment: "+dinheiro.format(employee.getPayment())+" dollars.");
        System.out.println("Supervisor payment: "+dinheiro.format(supervisor.getPayment())+" dollars.");
        System.out.println("Manager payment: "+dinheiro.format(manager.getPayment())+" dollars.");
    }
}
