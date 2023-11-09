package Herencia;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 4);
        miCoche.arrancar(); // Llama al método heredado de Vehiculo
        miCoche.acelerar(); // Llama al método de Coche
        miCoche.detener();  // Llama al método heredado de Vehiculo
        miCoche.frenar();    // Llama al método de Coche
    }
}
