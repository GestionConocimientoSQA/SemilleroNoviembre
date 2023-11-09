package Polimorfismo;

class Guitarra extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra: ¡Ding, ding, ding!");
    }
}
