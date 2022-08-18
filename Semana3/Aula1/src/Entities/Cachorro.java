package Entities;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");

    }
    public void correr() {
        System.out.println("Cachorro correndo");
    }
}
