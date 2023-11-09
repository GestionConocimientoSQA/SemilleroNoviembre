package JUANCA;

public class Perro extends Animal{

    private String raza="";


    public Perro(String color, String nombre, String raza) {
        super(color, nombre);
        this.raza = raza;
    }



    @Override
    public void saluda(){
        System.out.println("Gua Gua!!");
        super.saluda();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
