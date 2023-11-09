package Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[2];
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Piano();

        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}