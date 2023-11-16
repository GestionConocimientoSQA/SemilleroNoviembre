package cristianh;

public class HerenciaPolimorfismo {

    public static void main(String[] args) {

        Animal collecionAnimales[]= new Animal[2];

        collecionAnimales[0]= new Perro("blanco","Paco","pitbull");
        collecionAnimales[1]= new Gato("cafe","Kira","agora");

        Animal animal= new Animal("gris","puerquito");

        Perro perruno = new Perro("cafe","bruno","pincher");

        perruno.setColor("gris");

        Gato gatuno = new Gato("cafe","kata","siames");


        animal.saluda();
        perruno.saluda();
        gatuno.saluda();

        System.out.println(perruno.getNombre());
        System.out.println(gatuno.getNombre());

    }
}
