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

        carro1.acelerar(0.0);
        carro1.freiar(0.0);
        carro1.setVelocidadeMaxima(70.0);
        System.out.println("Acelerando o "+carro1.getModelo()+": "+carro1.acelerar(60) + "," + carro1.acelerar(-34.5)+", , Acionando freio: "
                +carro1.freiar(70.0));

        carro2.acelerar(0.0);
        carro2.freiar(0.0);
        carro2.setVelocidadeMaxima(65.5);
        System.out.println("Acelerando o "+carro2.getModelo()+": "+carro2.acelerar(10.0) + ","
                + carro2.acelerar(65.5)+", , Acionando freio: " +carro2.freiar(50.5));

        carro3.acelerar(0.0);
        carro3.freiar(0.0);
        carro3.setVelocidadeMaxima(50.0);
        System.out.println("Acelerando o "+carro3.getModelo()+": "+carro3.acelerar(50.0) + "," + carro3.acelerar(5.5)+", , Acionando freio: "
                +carro3.freiar(7.0));

        carro4.acelerar(0.0);
        carro4.freiar(0.0);
        carro4.setVelocidadeMaxima(120.0);
        System.out.println("Acelerando o "+carro4.getModelo()+": "+carro4.acelerar(120.0) + ", Acionando freio: " + carro4.freiar(25.5)+","
                +carro4.freiar(70.7));

        carro5.acelerar(0.0);
        carro5.freiar(0.0);
        carro5.setVelocidadeMaxima(160.0);
        System.out.println("Acelerando o "+carro5.getModelo()+": "+carro5.acelerar(160.0) + "," + carro5.freiar(43.0)+", Acionando freio: "
                +carro5.freiar(15.0));

        listaCarro.add(carro1);
        listaCarro.add(carro2);
        listaCarro.add(carro3);
        listaCarro.add(carro4);
        listaCarro.add(carro5);

        System.out.println("                          \n");
        System.out.println( listaCarro.get(0));
        System.out.println( listaCarro.get(1));
        System.out.println( listaCarro.get(2));
        System.out.println( listaCarro.get(3));
        System.out.println( listaCarro.get(4));


    }

}




