package Daniel.Semana1.Clase2;

public class Arreglos {

    public static void main(String[] args) {
        String vehiculos [] = {"Ford","Mazda","BMW"};

        for(int i = 0; i<vehiculos.length; i++){
            System.out.println("El nombre de la marca de esta posicion es: " + vehiculos[i]);
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////

        String nombres [];
        nombres = new String[3];

        nombres [0] = "Daniel";
        nombres [1] = "Luis";
        nombres [2] = "Natalia";

        for(int j = 0; j<nombres.length;){
            System.out.println("El nombre de la persona de esta posicion es: " + nombres[j]);
            j++;
        }
    }
}
