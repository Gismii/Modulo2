import java.util.Objects;

public class Contato {
    String nome;

    String numero;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato that = (Contato) o;
        return Objects.equals(nome, that.nome) && Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.numero;
    }
}

