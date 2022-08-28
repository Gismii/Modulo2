package MusicCollection;

public class GerenciadorMusica {
    @Override
    public String toString() {
        return "GerenciadorMusica{" +
                "artista='" + artista + '\'' +
                ", titulo='" + titulo + '\'' +
                ", emExecucao=" + emExecucao +
                '}';
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmExecucao() {
        return emExecucao;
    }

    public void setEmExecucao(boolean emExecucao) {
        this.emExecucao = emExecucao;
    }

    String artista;
    String titulo;
    boolean emExecucao;
}
