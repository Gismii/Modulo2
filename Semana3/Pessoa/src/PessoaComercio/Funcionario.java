package PessoaComercio;

public class Funcionario extends Pessoa{
    private static final double salario= 2000.0;    // ess modelo não pode ser modificado o valor, diferente se fosse apneas "privat doubl salrio"!
    public Funcionario(){

    }

    public  void calcularBonus(int diasTrabalhados){
        double bonusCalculado;

    }
    public  double calcularSalario(int diasTrabalahdos){
        double salarioCalculado;
        salarioCalculado=(salario/30) * diasTrabalahdos;
        return  salarioCalculado;

    }
}
