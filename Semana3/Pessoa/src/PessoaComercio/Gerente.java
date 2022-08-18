package PessoaComercio;

public class Gerente extends Funcionario{
    public Gerente(){

    }
    public void calcularBonus(){

    }

    @Override
    public  double calcularSalario(int diasTrabalahdos) {
        double salarioCalculado;
        salarioCalculado = super.calcularSalario(diasTrabalahdos)*1.5;
        return super.calcularSalario(diasTrabalahdos);
    }
}
