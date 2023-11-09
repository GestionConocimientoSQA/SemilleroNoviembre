package JUANCA;

public class CicloyArray {
    public static void main(String[] args) {
        //String Vehiculos[] = {"Ford","Mazda","BMW"};//Opcion 1
        String Vehiculos[]= new String[3];

        Vehiculos[0]="Ford";
        Vehiculos[1]="Ford";
        Vehiculos[2]="Ford";

        //Opcion1
        for(int index=0; index< Vehiculos.length;index++){
            System.out.println(Vehiculos[index]);
        }
        //Opcion2
        for (String marcas: Vehiculos) {
            System.out.println(marcas);
        }
    }
}
