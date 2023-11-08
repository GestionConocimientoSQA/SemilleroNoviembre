package daniela;

public class Ingeniero extends Persona{

    private String Profesion;

    public Ingeniero(String Nombre, int Edad, String Profesion){
        super(Nombre, Edad);
        this.Profesion= Profesion;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar()+" la profesión es: "+Profesion;
    }
}
