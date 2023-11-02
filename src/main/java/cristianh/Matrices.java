package cristianh;

public class Matrices {

    public static void main(String[] args) {
        int matriz[][] = new int[2][3];
        
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;

        matriz[1][0]=1;
        matriz[1][1]=2;
        matriz[1][2]=3;

        MatrizClass datosmatriz= new MatrizClass(matriz);


        int longitudFilas= datosmatriz.contarFilas();

        datosmatriz.verMatriz(longitudFilas);


    }
    
}
