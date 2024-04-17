package org.example.Matrices;

public class MostrarMatInvertida2 {

    public static final int NUMX = 6;   // COLUMNAS
    public static final int NUMY = 6;   // FILAS

    public static void main(String[] args) {

        String[][] l_Matriz = new String[NUMY][NUMX];

        AdministrarMatriz(1, l_Matriz);     // RELLENAR MATRIZ
        AdministrarMatriz(2, l_Matriz);     // IMPRIMIR MATRIZ
        AdministrarMatriz(3, l_Matriz);     // INVERTIR VALORES
        AdministrarMatriz(2, l_Matriz);     // MOSTRAR MATRIZ INVERTIDA
    }

    private static void AdministrarMatriz(int p_Opcion, String[][] p_Matriz) {

        switch (p_Opcion) {
            // RELLENAR MATRIZ ------------------
            case 1 -> {
                int l_ContadorX = 0;
                int l_ContadorY = 0;

                for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {

                    for (l_ContadorX = 0; l_ContadorX < NUMX; l_ContadorX++) {

                        p_Matriz[l_ContadorY][l_ContadorX] = String.valueOf(l_ContadorX) + String.valueOf(l_ContadorY);

                    }
                }
            }

            // MOSTRAR MATRIZ ------------------
            case 2 -> {
                int l_ContadorX, l_ContadorY;

                System.out.println();

                for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {

                    for (l_ContadorX = 0; l_ContadorX < NUMX; l_ContadorX++) {

                        // System.out.println("Fila " + l_ContFilas + " Columna " + l_ContColumnas + " -> " + l_Matriz[l_ContFilas][l_ContColumnas]);
                        System.out.print(p_Matriz[l_ContadorY][l_ContadorX] + " ");

                    }
                    System.out.println();
                }
            }

            // INVERTIR MATRIZ ------------------
            case 3 -> {
                String l_NuevaMatriz;
                int l_ContadorY, l_ContadorX;

                for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {
                    for (l_ContadorX = l_ContadorY; l_ContadorX < NUMX; l_ContadorX++) {
                        l_NuevaMatriz = p_Matriz[l_ContadorY][l_ContadorX];
                        p_Matriz[l_ContadorY][l_ContadorX] = p_Matriz[l_ContadorX][l_ContadorY];
                        p_Matriz[l_ContadorX][l_ContadorY] = l_NuevaMatriz;
                    }
                }
            }
        }
    }
}
