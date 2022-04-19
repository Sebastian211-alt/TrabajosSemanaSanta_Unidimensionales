/*

Dado un arreglo A de N elemtos se requiere generar otro arreglo que contenga las posiciones 
de los elementos del arreglo dado que sean igales a un valor X dado.

Ejemplo: Arreglo dado A = [4,6,8,2,6,9,6,1]
         x = 6
         Arreglo Resultante B = [2,5,7].

 */
package Unidimensionales;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class ArregloGeneradoDeOtroArreglo_Unidimensional {

    public int[] arreglo1;
    public int[] arreglo2;

    Scanner s = new Scanner(System.in);

    public void leer_arreglo1(int x) {

        arreglo1 = new int[x];

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Dato " + (i + 1));

            int dato = s.nextInt();
            arreglo1[i] = dato;

        }
    }

    public void mostrar_arreglo1() {

        System.out.println("\nDatos del arreglo1: ");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Dato " + (i + 1) + ": " + arreglo1[i]);
        }
    }

    public void mover_datos() {

        System.out.println("\nIntercambiando....");
        arreglo2 = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo2[i] = arreglo1[i];
        }
    }

    public void mostrar_arreglo2() {
        System.out.println("\nDatos del arreglo 2: ");

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("Dato " + (i + 1) + ": " + arreglo2[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArregloGeneradoDeOtroArreglo_Unidimensional objeto = new ArregloGeneradoDeOtroArreglo_Unidimensional();

        System.out.println("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();

        objeto.leer_arreglo1(tam);
        objeto.mostrar_arreglo1();
        objeto.mover_datos();
        objeto.mostrar_arreglo1();
        objeto.mostrar_arreglo2();

    }

}
