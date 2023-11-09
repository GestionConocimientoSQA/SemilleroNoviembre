package Daniel.Semana2.Clase3;

import java.util.Scanner;

public class Vehiculos extends Concesionario{
    Scanner teclado = new Scanner(System.in);
    private String nombreMarca;
    public void marca(){
        System.out.println("Digite la marca del vehiculo el cual compro");
        nombreMarca = teclado.next();
        System.out.println("La marca del vehiculo es: "+nombreMarca);
        System.out.println("------------------------------------------------------------");
        System.out.println("Ahora continuemos para conocer la plaza de ubicacion");
        Asesor();
    }

}
