import java.time.LocalDate;

public class Jogador {
    private String nome;
    private String posicao;
    private String nacionaliddade;
    private Double altura;
    private Double peso;
    private LocalDate dataNascimento;

    public Jogador(String nome, String posicao, LocalDate dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionaliddade() {
        return nacionaliddade;
    }

    public void setNacionaliddade(String nacionaliddade) {
        this.nacionaliddade = nacionaliddade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer calcularIdade() {
        return LocalDate.now().compareTo(this.dataNascimento);
    }

    public Integer calcularTempoAposentadoria() {
        int tempoAposentadoria;
        Integer idadeJogador = calcularIdade();

        if(this.posicao.equals("meio-campo")) {
            tempoAposentadoria = 38 - idadeJogador;
            return tempoAposentadoria > 0 ? tempoAposentadoria : 0;
        } else if(this.posicao.equals("atacante")) {
            tempoAposentadoria = 35 - idadeJogador;
            return tempoAposentadoria > 0? tempoAposentadoria:0;
        }else {
            tempoAposentadoria = 40 - idadeJogador;
            return tempoAposentadoria > 0 ? tempoAposentadoria:0;
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", nacionaliddade='" + nacionaliddade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

        public static void main(String[] args) {
            Jogador jogador1 = new Jogador("André", "atacante", LocalDate.of(1996,06,19));
            Jogador jogador2 = new Jogador("Gustavo", "atacante", LocalDate.of(1976,06,19));
            Jogador jogador3 = new Jogador("Fernando", "meio-campo", LocalDate.of(2022,8,5));
            Jogador jogador4 = new Jogador("Sidney", "meio-campo", LocalDate.of(1976,06,19));
            Jogador jogador5 = new Jogador("Sergio", "goleiro", LocalDate.of(1996,06,19));

            System.out.println("Idade do " + jogador1.getNome() + " é " + jogador1.calcularIdade());
            System.out.println("Idade do " + jogador2.getNome() + " é " + jogador2.calcularIdade());
            System.out.println("Idade do " + jogador3.getNome() + " é " + jogador3.calcularIdade());
            System.out.println("Idade do " + jogador4.getNome() + " é " + jogador4.calcularIdade());
            System.out.println("Idade do " + jogador5.getNome() + " é " + jogador5.calcularIdade());

            System.out.println("Faltam " + jogador1.calcularTempoAposentadoria() + " anos para o jogador " + jogador1.getNome() + " se aposentar.");
            System.out.println("Faltam " + jogador2.calcularTempoAposentadoria() + " anos para o jogador " + jogador2.getNome() + " se aposentar.");
            System.out.println("Faltam " + jogador3.calcularTempoAposentadoria() + " anos para o jogador " + jogador3.getNome() + " se aposentar.");
            System.out.println("Faltam " + jogador4.calcularTempoAposentadoria() + " anos para o jogador " + jogador4.getNome() + " se aposentar.");
            System.out.println("Faltam " + jogador5.calcularTempoAposentadoria() + " anos para o jogador " + jogador5.getNome() + " se aposentar.");
        }
    }
