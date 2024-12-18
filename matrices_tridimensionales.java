package matrices_tridimensionales;
import java.util.Scanner;
public class matrices_tridimensionales {
    public static void lectura_matriz_3d(int[][][] m) {
        int columnas = m[0][0].length;
        int filas = m[0].length;
        int profundidad = m.length;

        for (int i = 0; i < profundidad; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columnas; k++) {
                    System.out.print(m[i][j][k]);
                    System.out.print(", ");
                    }
            }
        }
    }
    public static int[][][] escritura_matriz_3d(int[][][] m){
        int columnas = m[0][0].length;
        int filas = m[0].length;
        int profundidad = m.length;
        int[][][] matriz = new int[profundidad][filas][columnas];
        int valor;
        for (int i = 0; i < profundidad; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columnas; k++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce el valor para la posición [" + i + "][" + j + "][" + k + "]: ");
                valor = scanner.nextInt();
                matriz[i][j][k] = valor;
                }
            }
        }
        return matriz;
    }
    public static void main(String[] args){
        int[][][] matriz = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };
        
        int[][][] matriz2 = escritura_matriz_3d(matriz);
        lectura_matriz_3d(matriz2);
    }
}
