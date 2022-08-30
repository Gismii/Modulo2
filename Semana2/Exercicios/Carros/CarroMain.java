package Carros;

import java.util.ArrayList;
import java.util.List;

public class CarroMain{

    //ESSA ATIVIDADE NAO PEDIU PARA INSTANCIAR UMA LISTA, PORÉM FOI CRIADO AQUI !!

    public static void main(String[] args){

        Carro carro = new Carro();

        List<Carro> listaCarro = new ArrayList<>();

        Carro carro1 = new Carro(1, "Fusca", "Preto", 12456.00,0.0);
        Carro carro2 = new Carro(2, "Corsa", "Azul", 5678.00,0.0);
        Carro carro3 = new Carro(3, "Celta", "Prata", 1890.00,0.0);
        Carro carro4 = new Carro(4, "Gol", "Branco", 45190.00,0.0);
        Carro carro5 = new Carro(5, "Palio", "Vermelho", 26890.00,0.0);

        listaCarro.add(carro1);
        listaCarro.add(carro2);
        listaCarro.add(carro3);
        listaCarro.add(carro4);
        listaCarro.add(carro5);

        //System.out.println("Lista de carros e suas caracteristicas: "+"  \n  " + listaCarro);
        System.out.println( listaCarro.get(0));
        System.out.println( listaCarro.get(1));
        System.out.println( listaCarro.get(2));
        System.out.println( listaCarro.get(3));
        System.out.println( listaCarro.get(4));

        carro1.acelerar(60);
        carro1.acelerar(25.5);
        carro1.frear(70);

        System.out.println();




    }

}




