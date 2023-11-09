package Andres;

public class Matrices {
    public static void main(String[] args) {
        //1 corchete filas 2 corchete columnas
        int matriz [][] = new int [2][3];//Matriz de 2 filas y 3 columnas
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;

        matriz[1][0]=1;
        matriz[1][1]=2;
        matriz[1][2]=3;

        MatrizClass datosm= new MatrizClass(matriz);

       int longitudfilas = datosm.contarfilas();

       datosm.verMatriz(longitudfilas);

    }
}
