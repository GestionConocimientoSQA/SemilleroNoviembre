package Daniel.Semana1.Clase2;

public class ClaseyObjetos {

    int datos[][];

    //Inicializar datos
    public ClaseyObjetos(int[][] datos) {
        this.datos = datos;
    }

    public int contarFilas(){
        return datos.length;
    }

    public void verMatriz(int longitudFilas){
        for(int f = 0; f<longitudFilas; f++){
            for(int c = 0; c<datos[f].length; c++){
                System.out.println("El numero de esta posicion es: " + datos[f][c]);
            }
        }
    }
}
