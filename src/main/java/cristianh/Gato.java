package cristianh;

public class Gato extends Animal{

    String raza="";

    public Gato(String color, String nombre, String raza) {
        super(color, nombre);
        this.raza = raza;
    }



    @Override
    public void saluda(){
        System.out.println("Miau!!");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
