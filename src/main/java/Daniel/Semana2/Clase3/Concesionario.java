package Daniel.Semana2.Clase3;

import java.util.Scanner;

public class Concesionario {
    Scanner teclado = new Scanner(System.in);
    private int numeroPlaza;
    private String nombreAsesor;

    public void Asesor(){
        System.out.println("Digite el nombre del asesor que lo atendio");
        nombreAsesor = teclado.next();
        System.out.println("El nombre del asesor es: "+nombreAsesor);
        System.out.println("-------------------------------------------------------");
        System.out.println("Ahora continuemos para conocer el lugar de su vehiculo");
        Plaza();
    }

    private void Plaza(){
        System.out.println("Digite el numero de plaza la cual fue ubicado su vehiculo");
        numeroPlaza = teclado.nextInt();
        System.out.println("La plaza donde se encuentra ubicado su vehiculo es: "+numeroPlaza+". Puede acercarse a la plaza para reclamar su vehiculo. Gracias!!");
    }

}
