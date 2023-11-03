package Daniel.Semana1.Clase2;

public class Matrices {

    public static void main(String[] args) {

        int datos [][];
        datos = new int [2][3];

        datos [0][0] = 1;
        datos [0][1] = 2;
        datos [0][2] = 3;
        datos [1][0] = 4;
        datos [1][1] = 5;
        datos [1][2] = 6;

        ClaseyObjetos instancia = new ClaseyObjetos(datos);

        int longitudFilas = instancia.contarFilas();

        instancia.verMatriz(longitudFilas);

       //int longitudFilas = datos.length;

       /* for(int f = 0; f<longitudFilas; f++){
            for(int c = 0; c<datos[f].length; c++){
                System.out.println("El numero de esta posicion es: " + datos[f][c]);
            }
        }*/
    }
}
