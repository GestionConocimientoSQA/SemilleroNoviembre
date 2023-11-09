package JUANCA;

public class Animal {

    private String color="negro";
    private String nombre="";

    public Animal(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public void saluda(){
        System.out.println("Hola soy un animal!!");
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
