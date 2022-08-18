public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void caminha() {
        System.out.println("Gato caminhando.... ");
    }

    public void mia() {
        System.out.println("Miau!");
    }
}