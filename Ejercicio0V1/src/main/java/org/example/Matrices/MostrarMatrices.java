package org.example.Matrices;

public class MostrarMatrices {

    public static final int NUMX = 6;   // COLUMNAS
    public static final int NUMY = 6;   // FILAS

    public static void main(String[] args) {

        int l_ContadorX = 0;
        int l_ContadorY = 0;
        String[][] l_Matriz = new String[NUMY][NUMX];

        for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {

            for (l_ContadorX = 0; l_ContadorX < NUMX; l_ContadorX++) {

                l_Matriz[l_ContadorY][l_ContadorX] = String.valueOf(l_ContadorX) + String.valueOf(l_ContadorY);

            }
        }

        Mostrar(l_Matriz);
        invertirMatriz(l_Matriz);
    }

    public static void Mostrar(String[][] p_Matriz) {

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

//    public static void MostrarInverso(String[][] l_Matriz) {
//        int l_ContadorX, l_ContadorY;
//
//        System.out.println("\nMatriz invertida:");
//
//        for (l_ContadorX = 0; l_ContadorX < NUMX; l_ContadorX++) {
//
//            for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {
//                System.out.print(l_Matriz[l_ContadorY][l_ContadorX] + " ");
//            }
//
//            System.out.println();
//        }
////    }
//
//
//    public static void MostrarInverso(String[][] l_Matriz) {
//        int l_ContadorX, l_ContadorY;
//
//        System.out.println("\nMatriz invertida:");
//
//        for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {
//
//            for (l_ContadorX = 0; l_ContadorX < NUMX; l_ContadorX++) {
//
//                // System.out.println("Fila " + l_ContFilas + " Columna " + l_ContColumnas + " -> " + l_Matriz[l_ContFilas][l_ContColumnas]);
//                System.out.print(l_Matriz[l_ContadorY][l_ContadorX] + " ");
//
//            }
//            System.out.println();
//        }
//    }


    public static void invertirMatriz(String[][] p_Matriz) {

        String l_NuevaMatriz;
        int l_ContadorY, l_ContadorX;

        for (l_ContadorY = 0; l_ContadorY < NUMY; l_ContadorY++) {
            for (l_ContadorX = l_ContadorY; l_ContadorX < NUMX; l_ContadorX++) {
                l_NuevaMatriz = p_Matriz[l_ContadorY][l_ContadorX];
                p_Matriz[l_ContadorY][l_ContadorX] = p_Matriz[l_ContadorX][l_ContadorY];
                p_Matriz[l_ContadorX][l_ContadorY] = l_NuevaMatriz;
            }
        }

        Mostrar(p_Matriz); // Mostrar la matriz invertida
    }
}
