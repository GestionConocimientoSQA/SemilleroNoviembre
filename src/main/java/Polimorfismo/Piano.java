package Polimorfismo;

class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el piano: ¡Tin, tin, tin!");
    }
}
