package Entities;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Izzy");
        cachorro.setIdade(10);

        Cavalo cavalo = new Cavalo();
        cavalo.setNome("Pegasus");
        cavalo.setIdade(3);

        Preguica preguica = new Preguica();
        preguica.setNome("Flash");
        preguica.setIdade(20);
//
//        cachorro.emitirSom();
//        cavalo.emitirSom();
//        preguica.emitirSom();
//
//        cachorro.correr();
//        cavalo.correr();
//        preguica.subirArvore();

        //criando a lista de Animal e adicionando animais de sub-tipos diferentes
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        Veterinario veterinario = new Veterinario();

        for ( Animal animal: animais ) {
            veterinario.examinar(animal);
        }

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

    }

}
