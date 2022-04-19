/*

Escribe un programa que rellene un array de 100 elementos 
con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). 
A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.

Ejemplo:

459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225
426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466
262 422 275 384 399 397 87 218 84 312 480 207 68 108

¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1

459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
466 262 422 275 384 399 397 87 218 84 312 480 207 68 108


 */
package Unidimensionales;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class ArregloDe100Elementos_Unidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] num = new int[6][10];

        int fila;
        int columna;

        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;

        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;

        System.out.print("\n      ");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("   " + columna + "  ");
        }
        System.out.println();

        System.out.print("    ┌");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }
        System.out.println("┐");

        for (fila = 0; fila < 6; fila++) {
            System.out.print("  " + fila + " │");
            for (columna = 0; columna < 10; columna++) {

                num[fila][columna] = (int) (Math.random() * 1001);

                System.out.printf("%5d ", num[fila][columna]);

                // Calcula el mínimo y guarda sus coordenadas
                if (num[fila][columna] < minimo) {
                    minimo = num[fila][columna];
                    filaMinimo = fila;
                    columnaMinimo = columna;
                }

                // Calcula el máximo y guarda sus coordenadas
                if (num[fila][columna] > maximo) {
                    maximo = num[fila][columna];
                    filaMaximo = fila;
                    columnaMaximo = columna;
                }
            }
            System.out.println("│");
        }
        System.out.print("    └");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }

        System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);

    }

}
