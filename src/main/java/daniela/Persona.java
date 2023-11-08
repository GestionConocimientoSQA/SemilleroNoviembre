package daniela;

//Super clase
public class Persona {

    private String Nombre;
    private int Edad;

    public Persona(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String Mostrar(){
        return "El nombre es: "+Nombre+ " la Edad es: "+Edad;
    }
}
