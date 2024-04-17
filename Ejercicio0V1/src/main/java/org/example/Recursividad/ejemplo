import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

/**********************************************************************************************************************************************
 *   APLICACIÓN: "Tema1TAREA4BuscaMediaForkJoinRecursivo"        ''''CORRECCIÓN '''''                                                         *
 **********************************************************************************************************************************************
 *   PROGRAMACIÓN DE SERVICIOS Y PROCESOS 2DAM                                                                                                *
 **********************************************************************************************************************************************
 *   @author L.García                                                                                                                         *
 *   @version 1.0 - Versión inicial del programa.                                                                                             *
 *   @since 15NOV2023                                                                                                                         *
 **********************************************************************************************************************************************
 *   COMENTARIOS:                                                                                                                             *
 *      - Calcula la media total de los valores de un array, de forma recursiva hasta un determinado umbral, y luego de forma iterativa.      *
 *      - Uso del framework Fork-Join de Java, recursividad e iteratividad.                                                                   *
 **********************************************************************************************************************************************/

public class CalculaMediaRecursiva extends RecursiveTask<Double> {

    private static final int UMBRAL = 100;
    private static final int LONGITUD_ARRAY = 1_000;
    private int[] a_Array;
    private int a_Inicio, a_Fin;

    // Constructor por defecto.
    public CalculaMediaRecursiva() { }

    // Constructor que inicializa la tarea.
    public CalculaMediaRecursiva(int[] p_Array, int p_Inicio, int p_Fin) {
        this.a_Array = p_Array;
        this.a_Inicio = p_Inicio;
        this.a_Fin = p_Fin;
    }

    // Calcular la media de forma RECURSIVA **************************
    private double getMediaRec() {

        // Calcular la mitad del array.
        int l_Medio = (a_Inicio + a_Fin) / 2;

        // Crear tareas recursivas con cada mitad del array.
        CalculaMediaRecursiva l_Tarea1 = new CalculaMediaRecursiva(a_Array, a_Inicio, l_Medio);
        CalculaMediaRecursiva l_Tarea2 = new CalculaMediaRecursiva(a_Array, l_Medio, a_Fin);

        // Iniciar la ejecución paralela de las dos tareas.
        l_Tarea1.fork();
        l_Tarea2.fork();

        // Obtener los resultados de las tareas.
        double l_ResultadoTarea2 = l_Tarea2.join();
        double l_ResultadoTarea1 = l_Tarea1.join();

        return (l_ResultadoTarea1 + l_ResultadoTarea2) / 2;     // Calcular la media y retornarla.
    }

    // Calcular la media de forma ITERATIVA **************************
    private double getMediaSec() {
        double l_Total = 0;

        // Sumar los números que contiene el array.
        for (int l_Contador = a_Inicio; l_Contador < a_Fin; l_Contador++) {
            l_Total += a_Array[l_Contador];
        }

        l_Total /= (a_Fin - a_Inicio);      // Calcular la media.

        return l_Total;
    }

    @Override
    protected Double compute() {

        double l_Resultado = 0;

        // Si la diferencia entre el inicio y el fin es menor o igual al umbral, calcular la media de forma iterativa.
        if ((a_Fin - a_Inicio) <= UMBRAL) {
            l_Resultado = getMediaSec();
        } else {
            // Si se supera el umbral, dividir la tarea en dos tareas recursivas.
            l_Resultado = getMediaRec();
        }

        return l_Resultado;
    }

    public static int[] rellenarArray() {

        int[] l_ArrayNumeros = new int[LONGITUD_ARRAY];

        // Rellenar el array con los índices
        for (int l_Contador = 0; l_Contador < l_ArrayNumeros.length; l_Contador++) {
            l_ArrayNumeros[l_Contador] = l_Contador;
        }

        return l_ArrayNumeros;
    }

    public static void main(String[] args) {

        // DECLARACIÓN DE VARIABLES ---------------
        CalculaMediaRecursiva l_Tarea = new CalculaMediaRecursiva();
        int[] l_ArrayNumeros = rellenarArray();
        int l_InicioArray = 0;
        int l_FinArray = l_ArrayNumeros.length;
        double l_ResultadoInvoke = 0, l_ResultadoJoin = 0;
        long l_TiempoInicial = System.currentTimeMillis();
        ForkJoinPool l_Pool = new ForkJoinPool();

        System.out.println("Inicio del cálculo de la media.");

        // Crear una instancia de la tarea.
        l_Tarea = new CalculaMediaRecursiva(l_ArrayNumeros, l_InicioArray, l_FinArray);

        // Invocar las tareas paralelas y calcular la media.
        l_ResultadoInvoke = l_Pool.invoke(l_Tarea);
        l_ResultadoJoin = l_Tarea.join();

        // Imprimir resultados..
        System.out.println("Milisegundos empleados: " + (System.currentTimeMillis() - l_TiempoInicial));
        System.out.println("La media según 'invoke' es: " + l_ResultadoInvoke);
        System.out.println("Coincide con la media según 'join' que es: " + l_ResultadoJoin);
    }
}