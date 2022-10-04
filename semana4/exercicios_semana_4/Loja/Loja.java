package Loja;

import java.util.ArrayList;
import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        int cod_Barras;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Cds cd0 = new Cds(789789789);
        cd0.dados("BarMain", 20.00, 10);
        Cds cd1 = new Cds(456456456);
        cd1.dados("Avioes", 40.00, 11);
        DVDs dvd0 = new DVDs(123123123);
        dvd0.dados("Gismi e seus teclados", 30.00, "2:00");
        Livros livro0 = new Livros(741741741);
        livro0.dados("Batiman", 50.00, "Klow");
        Livros livro1 = new Livros(258258258);
        livro1.dados("GodOfwar", 35.00, "Guimaraes");
        produtos.add(cd0);
        produtos.add(cd1);
        produtos.add(dvd0);
        produtos.add(livro0);
        produtos.add(livro1);
        for (Produto produto : produtos){
            System.out.println(produto.toString());
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o código de barras do produto: ");
        cod_Barras = entrada.nextInt();
        Loja.LocalizaProd(produtos, cod_Barras);
    }
    public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
    {
        for (Produto produto : produtos){
            if (produto.GetCod_Barras() == cod_Barras){
                System.out.println(produto.toString());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
