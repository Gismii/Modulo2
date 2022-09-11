package service;

import dominio.Aluno;                            /*refatorar codigo (letrasMm e conveçoes), verificar organização, encapsolar menu,
                                                           implementar funçoes(tryCatch, upTocase,), implementar interfaces, talvez mudar o idioma do programa.
                                                           verificar arquivo linhaComando*/

import dominio.Pedagogo;
import dominio.Pessoa;
import dominio.Professor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LabSchoolMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();
        int codigo = 1;
        int opcao;


        do {
            System.out.println("               ");
            System.out.println("🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐-Lab_School_System-🌐🌐🌐🌐🌐🌐🌐🌐🌐🌐");
            System.out.println("                                                   ");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------CADASTRO DE PESSOAS--------------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("1 - Alunos , " +
                    "2 - Professores , " +
                    "3 - Funcionários  ");
            System.out.println("               ");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------LISTAR PESSOAS CADASTRADAS------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("4 - Alunos\n" +
                    "5 - Professores\n" +
                    "6 - Funcionários\n" +
                    "7 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------RELATORIO DOS ALUNOS------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("8 -  Ativo\n" +
                    "9  - Irregular\n" +
                    "10 - Atendimento pedagógico\n" +
                    "11 - Inativo\n" +
                    "12 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------RELATORIO DOS PROFESSORES------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("13 - Front-End\n" +
                    "14 - Back-End\n" +
                    "15 - Full-Stack\n" +
                    "16 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------ATENDIMENTO PEDAGOGICO------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("17 - Cadastrar atendiemnto pedagógico");
            System.out.println("18 - Total de atendimentos pedagógicos realizados");

            opcao = entrada.nextInt();


            switch (opcao) {

                case 1:
                    codigo += codigo;
                    Aluno aluno = new Aluno();
                    System.out.println("Insira o nome: ");
                    aluno.setNome(entrada.next());
                    System.out.println("Insira o CPF: ");
                    aluno.setCpf(entrada.next());
                    System.out.println("Insira a data de nascimento: ");
                    aluno.setDataDeNascimento(entrada.next());
                    System.out.println("Insira o numero de telefone: ");
                    aluno.setTelefone(entrada.next());
                    System.out.println("condição atual: ");
                    aluno.setCondicao(entrada.next());
                    System.out.println("Informe a nota do processo seletivo: ");
                    aluno.setNota(entrada.nextDouble());
                    for (int i = 0; i < codigo; i++) {
                        aluno.setIdentificadorCodigo(i);
                    }
                    listaPessoas.add(aluno);
                    break;
                case 2:
                    codigo += codigo;
                    Professor professor = new Professor();
                    System.out.println("Insira o nome: ");
                    professor.setNome(entrada.next());
                    System.out.println("Insira o CPF: ");
                    professor.setCpf(entrada.next());
                    System.out.println("Insira a data de nascimento: ");
                    professor.setDataDeNascimento(entrada.next());
                    System.out.println("Insira o numero de telefone: ");
                    professor.setTelefone(entrada.next());
                    System.out.println("Informe sua situação: ");
                    professor.setEstado(entrada.next());
                    System.out.println("Experiência em desenvolvimento: ");
                    professor.setExperienciaDesenvolvimento(entrada.next());
                    for (int i = 0; i < codigo; i++) {
                        professor.setIdentificadorCodigo(i);
                    }
                    listaPessoas.add(professor);
                    break;
                case 3:
                    codigo += codigo;
                    Pedagogo pedagogo = new Pedagogo();
                    System.out.println("Insira o nome: ");
                    pedagogo.setNome(entrada.next());
                    System.out.println("Insira o CPF: ");
                    pedagogo.setCpf(entrada.next());
                    System.out.println("Insira a data de nascimento: ");
                    pedagogo.setDataDeNascimento(entrada.next());
                    System.out.println("Insira o numero de telefone: ");
                    pedagogo.setTelefone(entrada.next());
                    for (int i = 0; i < codigo; i++) {
                        pedagogo.setIdentificadorCodigo(i);
                    }
                    listaPessoas.add(pedagogo);
                    break;


                case 4:
                    Iterator<Pessoa> obj = listaPessoas.iterator();
                    while (obj.hasNext()){
                        System.out.println(obj.next());
                    }



                    break;

            }


        }while (opcao!=6 );
    }
}


