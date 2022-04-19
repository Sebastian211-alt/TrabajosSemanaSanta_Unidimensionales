/*

Dado un arreglo A de N elementos se desea generar tres arreglos que contenga 
los elementos negativos, cero, y positivos del arreglo

 */
package Unidimensionales;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class CantidadDePositivos_Negativos_Cereos_Unidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Primer Numero: ");
        int num = sc.nextInt();

        System.out.println("Ingrese el Segundo Numero: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el Tercer Numero: ");
        int num3 = sc.nextInt();

        System.out.println("Ingrese el Cuarto Numero: ");
        int num4 = sc.nextInt();

        System.out.println("Ingrese el Quinto Numero: ");
        int num5 = sc.nextInt();

        System.out.println("Ingrese el Sexto Numero: ");
        int num6 = sc.nextInt();

        System.out.println("Ingrese el Septimo Numero: ");
        int num7 = sc.nextInt();

        System.out.println("Ingrese el Octavo Numero: ");
        int num8 = sc.nextInt();

        System.out.println("Ingrese el Noveno Numero: ");
        int num9 = sc.nextInt();

        System.out.println("Ingrese el Decimo Numero: ");
        int num10 = sc.nextInt();

        int numeros[] = new int[10];

        numeros[0] = num;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;
        numeros[4] = num5;
        numeros[5] = num6;
        numeros[6] = num7;
        numeros[7] = num8;
        numeros[8] = num9;
        numeros[9] = num10;

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {

                positivos++;

            }

            if (numeros[i] < 0) {

                negativos++;

            }
            if (numeros[i] == 0) {

                ceros++;

            }
        }

        System.out.println("La Cantidad de positivos son: " + positivos);
        System.out.println("La Cantidad de negativos son: " + negativos);
        System.out.println("La Cantidad de ceros son: " + ceros);

    }
}
