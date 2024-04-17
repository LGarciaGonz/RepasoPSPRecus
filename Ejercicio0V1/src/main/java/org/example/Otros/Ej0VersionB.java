package org.example.Otros;

public class Ej0VersionB {
    public static void main(String[] args) {

        Buzon a_Buzon = new Buzon();
        // Si el eje de la calzada es true imprimimos una '|'.
//        if (a_Buzon.a_EjeCalzada == true) {
//            System.out.print("|");
//            a_Buzon.a_EjeCalzada = false;
//        }
//        // Si el eje de la calzada es false imprimimos un ' '.
//        else {
//            System.out.print(" ");
//            a_Buzon.a_EjeCalzada = true;
//        }

        // VERSIÓN 1 --------------------------------------------------------------------------
//        char[] l_ArrayChar = {'|', ' '};
//
//        while (true) {
//            System.out.println(l_ArrayChar[0] + "\n" + l_ArrayChar[1]);
//        }


        // VERSIÓN 2 --------------------------------------------------------------------------
//        char[] l_ArrayChar = {'|', ' '};
//        int l_Contador = 0;
//
//        while (true) System.out.println(l_ArrayChar[l_Contador++ % l_ArrayChar.length]);


        // VERSIÓN 3 --------------------------------------------------------------------------
        String l_Caracteres = "| ";
        int l_Contador = 0;

        while (true) System.out.println( l_Caracteres.charAt( l_Contador++ % l_Caracteres.length() )   );
    }
}
