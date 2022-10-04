package Loja;

public class Produto  {
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cod_Barras=" + cod_Barras +
                '}';
    }

    public Produto(String nome, double preco, int cod_Barras) {
        this.nome = nome;
        this.preco = preco;
        this.cod_Barras = cod_Barras;
    }

    private String nome;
    private double preco;
    private int cod_Barras;
    public Produto (int cod_Barras){
        this.cod_Barras = cod_Barras;
    }
    public void dados (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public int GetCod_Barras(){
        return this.cod_Barras;
    }
}
