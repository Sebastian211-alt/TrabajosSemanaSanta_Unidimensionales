/*

Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.

 */
package Unidimensionales;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class AlmacenarNumeros_Unidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] resultado = new int[10];
        int contador = 0;
        int cuentaArray = 0;
        int prim = 0;
        int prueba = 0;

        System.out.print("\nIntroduzca 10 números: ");

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        
        System.out.println("=========================");

        System.out.println("Índice\tValor");
        
        System.out.println("=========================");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t" + num[i]);
        }

        for (int i = 0; i < 10; i++) {
            do {

                prim++;
                prueba = num[i] % prim;

                if (prueba == 0) {
                    contador++;

                } else {

                }
            } while (prim != num[i]);

            if (contador == 2) {

                resultado[cuentaArray] = num[i];
                cuentaArray++;

            } else {

            }

            contador = 0;
            prim = 0;
        }

        for (int i = 0; i < 10; i++) {
            do {
                prim++;
                prueba = num[i] % prim;

                if (prueba == 0) {
                    contador++;
                } else {

                }
            } while (prim != num[i]);

            if (contador != 2) {

                resultado[cuentaArray] = num[i];
                cuentaArray++;

            } else {

            }

            contador = 0;
            prim = 0;
        }
        System.out.println("");
        System.out.println("=========================");
       
        System.out.println("\nArray final");

        System.out.println("Índice\tValor");

        //mostramos el array
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + resultado[i]);
        }
        
        System.out.println("==========================");
    }

}
