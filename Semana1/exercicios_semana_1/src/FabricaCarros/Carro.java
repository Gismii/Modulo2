package FabricaCarros;

public class Carro {
    String fabricante;
    String cor;
    String modelo;

    public Carro(String fabricante) {

        this.fabricante = fabricante;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Carro() {

    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "FabricaCarros.Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
