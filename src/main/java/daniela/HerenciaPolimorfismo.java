package daniela;

public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        Ingeniero ing = new Ingeniero("Daniela", 25, "Ingeniera");
        System.out.println(ing.Mostrar());

        Conductor Con = new Conductor("Samuel",26, "Cartagena");
        System.out.println(Con.Mostrar());
    }
}
