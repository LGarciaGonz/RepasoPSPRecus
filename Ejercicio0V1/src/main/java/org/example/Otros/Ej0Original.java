package org.example.Otros;

public class Ej0Original {
    public static void main(String[] args) {

        Buzon a_Buzon = new Buzon();
        // Si el eje de la calzada es true imprimimos una '|'.
        if (a_Buzon.a_EjeCalzada == true) {
            System.out.print("|");
            a_Buzon.a_EjeCalzada = false;
        }
        // Si el eje de la calzada es false imprimimos un ' '.
        else {
            System.out.print(" ");
            a_Buzon.a_EjeCalzada = true;
        }
    }
}
