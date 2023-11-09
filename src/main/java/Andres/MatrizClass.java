package Andres;

public class MatrizClass {
    int datos[][];

    public MatrizClass(int[][] datos) {
        this.datos = datos;
    }

    public int contarfilas(){
        return datos.length;
    }

    public void verMatriz(int longitudfilas)
    {
        for (int filas=0; longitudfilas<datos.length; filas++){
            System.out.println("\n");
            for (int columna=0; columna<datos[filas].length;columna++){
                System.out.println(datos[filas][columna] +" ");
            }
        }

    }
}

