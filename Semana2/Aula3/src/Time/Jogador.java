package Time;

import java.util.Date;

public class Jogador {
    private  int id;
    private  String nome;
    private  String apelido;
    private Date dataNscimento;
    private  int numero;
    private int qualidade;
    private int cartoes;
    private String posicao;

    private String condicao;


    public Jogador(int numero, String nome, String apelido, String condicao, String posicao, Date dataNascimento) {
        this.numero = numero;
        this.nome = nome;
        this.apelido = apelido;
        this.condicao = condicao;
        this.posicao = posicao;
        this.dataNscimento = dataNascimento;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
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

    public Date getDataNscimento() {
        return dataNscimento;
    }

    public void setDataNscimento(Date dataNscimento) {
        this.dataNscimento = dataNscimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public  boolean verificarCondicaoJogador() {
        if (this.condicao.equals("apto")){
            return  true;

        } else {
            return false;
        }



    }
}
