package Daniel.Semana2.Clase3;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculos carro = new Vehiculos();
        System.out.println("Compraste un vehiculo en este concesionario?");

        String condicional = teclado.next();

        if(condicional.equalsIgnoreCase("Si")){
            carro.marca();
        }else{
            System.out.println("Lo lamentamos, sin un vehiculo comprado no se puede continuar con la solicitud, gracias.");
        }

    }
}


