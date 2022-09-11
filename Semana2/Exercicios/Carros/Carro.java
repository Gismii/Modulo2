package Carros;

 //[M2S02] Ex 1 - Classe e Objeto Carro
//Crie uma classe com nome Carro
//Seus atributos são: id(int), modelo(String), cor(String), preco(double), velocidade(double);
//Seus métodos são: getters para todos os atributos e setter apenas para o atributo preco;
//
//No construtor da classe defina a velocidade sempre como 0.0 ,
// todos os outros atributos deverão estar no parâmetro deste construtor.
// Todos os atributos devem ser privados (private) para que não seja possível acesso direto ao atributo.
//
//Após criar a classe com todos seus atributos e métodos ,
// através de uma classe Main com método main (utilizado para executar nosso código), crie instância de 5 objetos do tipo Carro.

public class Carro {


    public Carro(int id, String modelo, String cor, double preco, double velocidade) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.velocidade = velocidade;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public double getVelocidade() {
        return velocidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Carro() {
        velocidade = 0.0;
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.velocidade = velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String modelo;
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    private double preco;

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    private double velocidade;


    // [M2S02] Ex 2 - Métodos Classe Carro
    //Baseado no exercício anterior, agora será necessário definição de velocidade máxima como atributo da classe.
    // Sendo então necessário criar os métodos get e set para registrar e recuperar a velocidade máxima atingida e,
    // também os métodos para alterar a velocidade do carro,
    // sendo : acelerar(double speed),
    // frear(double speed).
    // Através do método main da classe Main crie a instância dos objetos com as mesmas características do exercício
    // anterior e realize uma sequência de aceleração e frenagem com cada um dos objetos:
    
    private double velocidadeMaxima;

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", velocidade=" + velocidade +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    public Carro(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {

        this.velocidadeMaxima = velocidadeMaxima;


    }


    public double acelerar(double speed){
        return velocidade +=speed;
    }

    public double freiar(double freio){
        return velocidade=freio;

    }


   }



