package FabricaCarros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowRoomCar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int control =1;
        //Carro carro = new Carro();

        List<Carro> zeroKm = new ArrayList<>();

        for (int i=0; i<control; i++){
            System.out.println("🚗 Informe o fabricante do carro1:  ");
            Carro carro1 = new Carro(scanner.next());

            System.out.println("🚗 Informe a cor do carro1:  ");
            carro1.setCor(scanner.next());

            System.out.println("🚗 Informe o modelo do carro1:  ");
            carro1.setModelo(scanner.next());
            zeroKm.add((carro1));

            System.out.println("🚗 Informe o fabricante do carro2:  ");
            Carro carro2 = new Carro(scanner.next());

            System.out.println("🚗 Informe a cor do carro2:  ");
            carro2.setCor(scanner.next());

            System.out.println("🚗 Informe o modelo do carro2:  ");
            carro2.setModelo(scanner.next());
            zeroKm.add(((carro2)));

            System.out.println("🚗 Informe o fabricante do carro3:  ");
            Carro carro3 = new Carro(scanner.next());

            System.out.println("🚗 Informe a cor do carro3:  ");
            carro3.setCor(scanner.next());

            System.out.println("🚗 Informe o modelo do carro3:  ");
            carro3.setModelo(scanner.next());
            zeroKm.add((carro3));


        }

        System.out.println("🚗 Carro1: "+zeroKm.get(0));
        System.out.println("🚗 Carro2: "+zeroKm.get(1));
        System.out.println("🚗 Carro3: "+zeroKm.get(2));
    }
}
