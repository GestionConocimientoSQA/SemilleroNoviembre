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

        int longitudFilas= matriz.length;

        for(int f=0;f< longitudFilas;f++){
            for (int c=0; c < matriz[f].length;c++){
                System.out.println(matriz[f][c]);
            }
        }


    }
    
}
