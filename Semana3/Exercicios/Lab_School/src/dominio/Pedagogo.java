package dominio;

public class Pedagogo extends Pessoa{

    public Pedagogo(String nome, String telefone, String dataDeNascimento, String cpf, int identificadorCodigo) {
        super(nome, telefone, dataDeNascimento, cpf, identificadorCodigo);
    }

    public Pedagogo() {

    }

    private  Integer atendimentoPedagogicoRealizado(int atendiomento){

        return atendiomento;


    }
}
