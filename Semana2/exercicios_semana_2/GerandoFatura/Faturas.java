package GerandoFatura;

public class Faturas {
    @Override
    public String toString() {
        return "Faturas{" +
                "numero='" + numero + '\'' +
                ", descrição='" + descrição + '\'' +
                ", quantidadeCompradaItem=" + quantidadeCompradaItem +
                ", precoItemUnidade=" + precoItemUnidade +
                '}';
    }

    public Faturas() {
        this.numero = numero;
        this.descrição = descrição;
        this.quantidadeCompradaItem = quantidadeCompradaItem;
        this.precoItemUnidade = precoItemUnidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidadeCompradaItem() {
        return quantidadeCompradaItem;
    }

    public void setQuantidadeCompradaItem(int quantidadeCompradaItem) {
        this.quantidadeCompradaItem = quantidadeCompradaItem;
    }

    public double getPrecoItemUnidade() {
        return precoItemUnidade;
    }

    public void setPrecoItemUnidade(double precoItemUnidade ) {
        this.precoItemUnidade = precoItemUnidade;
    }

    public double getTotalFatura(){
        double total;
        return total=quantidadeCompradaItem * precoItemUnidade;

    }

    String numero="0";
    String descrição= "SEM DESCRIÇÃO";
    int quantidadeCompradaItem = 0;
    double precoItemUnidade =0.0;
}
