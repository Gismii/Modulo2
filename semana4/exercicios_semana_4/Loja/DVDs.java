package Loja;

public class  DVDs extends Produto {
    private String duracao;
    public DVDs(int cod_Barras) {
        super(cod_Barras);
    }
    public void dados (String nome, double preco, String duracao){
        super.dados(nome, preco);
        this.duracao = duracao;
    }
    public String toString(){
        return super.toString() + "\nDuração: " + this.duracao;
    }
}
