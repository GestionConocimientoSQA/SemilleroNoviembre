package cristianh;

public class HerenciaPolimorfismo {

    public static void main(String[] args) {




        Perro perruno = new Perro("cafe","bruno","pincher");

        perruno.setColor("gris");

        Gato gatuno = new Gato("cafe","kata","siames");

        perruno.saluda();
        gatuno.saluda();

        System.out.println(perruno.getNombre());
        System.out.println(gatuno.getNombre());

    }
}
