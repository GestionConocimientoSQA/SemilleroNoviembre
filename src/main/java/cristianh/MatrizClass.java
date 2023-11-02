package cristianh;

public class MatrizClass {
    int datos[][];

    public MatrizClass(int[][] datos) {
        this.datos = datos;
    }

    public int contarFilas(){
        return datos.length;
    }

    public void verMatriz(int longitudFilas){
        for(int f=0;f< longitudFilas;f++){
            for (int c=0; c < datos[f].length;c++){
                System.out.println(datos[f][c]);
            }
        }
    }
}