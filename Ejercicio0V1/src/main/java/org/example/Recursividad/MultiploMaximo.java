package org.example.Recursividad;

public class MultiploMaximo {
public static final int NUMARRAY = 20;
    public static final int UMBRAL = 5;

    public static void main(String[] args) {
        cargarNumeros();
    }

    public static void cargarNumeros() {

        int l_Array[] = new int[NUMARRAY];
        int l_Contador = 0;
        int l_InicioArray = 0, l_FinArray = l_Array.length;

        for (l_Contador = 0 ; l_Contador < NUMARRAY ; l_Contador++) {

            l_Array[l_Contador] = l_Contador;

        }

        buscarMaximoRec(l_Array, l_InicioArray, l_FinArray);

    }

    public static void buscarMaximoRec(int[] p_Array, int p_Inicio, int p_Fin) {

        int l_Mitad = (p_Inicio + p_Fin) / 2;

        for (int l_Contador = p_Inicio ; l_Contador < p_Fin ; l_Contador++) {



        }

    }

}

