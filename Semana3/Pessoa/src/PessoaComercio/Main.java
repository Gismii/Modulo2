package PessoaComercio;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();
        funcionario.setNome("Gismi");
        funcionario.setCpf("46464646464");
        System.out.println("Salario do funcionario é " + funcionario.calcularSalario(30) );

        Fiscal fiscal= new Fiscal();
        funcionario.setNome("Gismi");
        funcionario.setCpf("46464646464");
        System.out.println("Salario do funcionario é " + fiscal.calcularSalario(30) );

        Gerente gerente= new Gerente();
        funcionario.setNome("Gismi");
        funcionario.setCpf("46464646464");
        System.out.println("Salario do funcionario é " + gerente.calcularSalario(30) );


    }
}