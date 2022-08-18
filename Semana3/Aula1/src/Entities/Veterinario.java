package Entities;

public class Veterinario {
    public Veterinario() {
    }

    public void examinar(Animal animal){
        System.out.println("Veterinário examinando " +animal.getNome());
        System.out.println("Animal do tipo " + animal.getClass().getSimpleName());
        animal.emitirSom();
    }
}
