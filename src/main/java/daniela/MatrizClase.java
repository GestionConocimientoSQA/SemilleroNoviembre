package daniela;

public class MatrizClase {
    int dato[][];

    //Inicialización del constructor
    public MatrizClase(int[][] dato) {
        this.dato = dato;
    }

    //Creando método
    public int contarFilas(){
        return dato.length;
    }

    public void imprimirInformacion(int longitudFilas){
        //El primer for recorre las filas
        for (int fila=0; fila<longitudFilas; fila++){
            for (int columna=0; columna<dato[fila].length; columna++){
                System.out.println(dato[fila][columna]);
            }
        }
    }
}
