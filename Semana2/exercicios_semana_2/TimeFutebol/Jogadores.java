package TimeFutebol;

import java.util.Date;

public class Jogadores {

    public Jogadores(int id, String nome, String apelido, Date dataDeNascimento, int numero, String posição, int qualidade, int cartões, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.numero = numero;
        this.posição = posição;
        this.qualidade = qualidade;
        this.cartões = cartões;
        this.suspenso = suspenso;
    }

    int id;
    String nome;
    String apelido;
    Date dataDeNascimento;

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    int numero;
    String posição;
    int qualidade;
    int cartões;
    boolean suspenso=false;
    @Override
    public String toString() {
        return "Joagadores{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", numero=" + numero +
                ", posição='" + posição + '\'' +
                ", qualidade=" + qualidade +
                ", cartões=" + cartões +
                ", suspenso=" + suspenso +
                '}';
    }

    public Jogadores() {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.numero = numero;
        this.posição = posição;
        this.qualidade = qualidade;
        this.cartões = cartões;
        this.suspenso = suspenso;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartões() {
        return cartões;
    }

    public void setCartões(int cartões) {
        this.cartões = cartões;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }





}
