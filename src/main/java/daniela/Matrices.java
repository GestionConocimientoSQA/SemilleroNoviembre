package daniela;

public class Matrices {

    public static void main(String[] args) {
        //Matrices
        int matriz[][] = new int[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;

        MatrizClase datosMatriz = new MatrizClase(matriz);

        //Conocer la longitud de las filas que siempre serán constantes
        int longitudFilas = datosMatriz.contarFilas();

        datosMatriz.imprimirInformacion(longitudFilas);

    }
}
