package daniela;

public class Conductor extends Persona{

    private String LugarTrabajo;

    public Conductor(String nombre, int edad, String LugarTrabajo) {
        super(nombre, edad);
        this.LugarTrabajo = LugarTrabajo;
    }

    public String Mostrar() {
        return super.Mostrar()+" y su lugar de trabajo es: "+LugarTrabajo;
    }
}
