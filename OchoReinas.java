/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ochoreinas;

/**
 *
 * @author Jesús
 */
public class OchoReinas {

    public static void main(String[] args) {

        int[][] matriz = {
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0}
        };


        System.out.println(buscaJaques(matriz));
        
    }

    public static int buscaJaques(int matriz[][]) {

        int aux = 0;
        int numJaques = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (matriz[i][j] != 0) {
                    numJaques = numJaques + buscaDiagonalDerechaArriba(i, j, matriz);
                    numJaques = numJaques + buscaDiagonalDerechaAbajo(i, j, matriz);
                    numJaques = numJaques + buscaDiagonalIzquierdaArriba(i, j, matriz);
                    numJaques = numJaques + buscaDiagonalIzquierdaAbajo(i, j, matriz);
                 
                }

            }
        }

        return numJaques;
    }
    
    
    public static int buscaDiagonalDerechaArriba(int columna, int fila, int matriz[][]) {

        int jaques = 0;
        int y = columna - 1;
        int x = fila + 1;

        try {

            while (true) {
                if (matriz[y][x] == 1) {
                    jaques = jaques + 1;
                    y--;
                    x++;
                } else {
                    y--;
                    x++;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return jaques;
    }
    public static int buscaDiagonalIzquierdaArriba(int columna, int fila, int matriz[][]) {

        int jaques = 0;
        int y = columna - 1;
        int x = fila - 1;

        try {

            while (true) {
                if (matriz[y][x] == 1) {
                    jaques = jaques + 1;
                    y--;
                    x--;
                } else {
                    y--;
                    x--;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return jaques;
    }
    public static int buscaDiagonalDerechaAbajo(int columna, int fila, int matriz[][]) {

        int jaques = 0;
        int y = columna + 1;
        int x = fila + 1;

        try {

            while (true) {
                if (matriz[y][x] == 1) {
                    jaques = jaques + 1;
                    y++;
                    x++;
                } else {
                    y++;
                    x++;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return jaques;
    }
    public static int buscaDiagonalIzquierdaAbajo(int columna, int fila, int matriz[][]) {

        int jaques = 0;
        int y = columna + 1;
        int x = fila - 1;

        try {

            while (true) {
                if (matriz[y][x] == 1) {
                    jaques = jaques + 1;
                    y++;
                    x--;
                } else {
                    y++;
                    x--;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return jaques;
    }
}
