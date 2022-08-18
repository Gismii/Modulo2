package PessoaComercio;

public class Fiscal extends Funcionario {
    public Fiscal() {

    }

    public void fiscalizar() {

    }

    public void autenticar(String senha) {

    }

    @Override
    public  double calcularSalario(int diasTrabalahdos) {
        double salarioCalculado;
        salarioCalculado = super.calcularSalario(diasTrabalahdos)*1.5;
        return super.calcularSalario(diasTrabalahdos);
    }
}
