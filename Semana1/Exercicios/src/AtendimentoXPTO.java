import java.util.Scanner;

//Faça um programa que imprima na tela ao usuário suas opções e após receber a opção escolhida pelo usuário,
// apresente as opções disponíveis para cada departamento ,
// em cada opção de menu deve existir opção para voltar ao Menu anterior ou Sair do atendimento.
//Após acessar a opção final apresente uma mensagem com a opção escolhida, Exemplo:
//	"Você acessou a opção Depto Comercial - Consultar Pedido".
//
//Lembre-se de utilizar o que aprendemos sobre funções e modularização.

public class AtendimentoXPTO {

    public static String msgMain = "Você selecionou a opçao: ";

    public static String msg = "Escolha a opção desejada:";

    public static String turnbackMenu = " Inicio menu: 1 Dep Comercial - 5 Dep Financeiro - 9 Dep RH :";

    public static  String msgExit = " [Digite '13' para sair.]";

    public static String optnOne = "2 Realizar Pedido;\n" +
            "3 Consultar Pedido;\n" +
            "4 Cancelar Pedido;\n";
    public static String optnFive = "6 Realizar um Pagamento;\n" +
            "7 Consultar um Pagamento;\n" +
            "8 Solicitar Reembolso;\n";
    public static String optnNine = "10 Realizar uma candidatura;\n" +
            "11 Consultar vagas disponíveis;\n" +
            "12 Agendar entrevista;\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha=0;
        System.out.println(turnbackMenu);
        while (escolha!=13) {
            escolha = scanner.nextInt();
            int menu;

            switch (escolha) {
                case 1:
                    System.out.println(msg);
                    System.out.println(optnOne);
                    menu = scanner.nextInt();
                    if (menu == 2) {
                        System.out.println(msgMain + "Realizar Pedido ------>"+turnbackMenu+msgExit);

                    }
                    if (menu == 3) {
                        System.out.println(msgMain + "Consultar pedido ------>"+turnbackMenu);

                    }
                    if (menu == 4) {
                        System.out.println(msgMain + "Cancelar pedido ------>"+turnbackMenu);

                    }
                    break;

                case 5:
                    System.out.println(msg);
                    System.out.println(optnFive);
                    menu = scanner.nextInt();
                    if (menu == 6) {
                        System.out.println(msgMain + "Realizar um Pagamento ------>"+turnbackMenu);
                    }
                    if (menu == 7) {
                        System.out.println(msgMain + "Consultar um Pagamento ------>"+turnbackMenu);
                    }
                    if (menu == 8) {
                        System.out.println(msgMain + "Solicitar Reembolso ------>"+turnbackMenu);
                    }

                    break;

                case 9:
                    System.out.println(msg);
                    System.out.println(optnNine);
                    menu = scanner.nextInt();
                    if (menu == 10) {
                        System.out.println(msgMain + "Realizar uma candidatura ------>"+turnbackMenu);
                    }
                    if (menu == 11) {
                        System.out.println(msgMain + "Consultar vagas disponíveis ------>"+turnbackMenu);
                    }
                    if (menu == 12) {
                        System.out.println(msgMain + "Agendar entrevista ------>"+turnbackMenu);
                    }
                    break;
            }
        }
    }
}












