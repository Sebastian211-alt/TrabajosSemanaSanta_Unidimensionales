/*

Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:

*/
package Unidimensionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SebasTati
 */
public class TamañoDeArregloInicio_Y_Final_Unidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = JOptionPane.showInputDialog("Introduce un tamaño");
        int num[] = new int[Integer.parseInt(texto)];

        rellenarNumAleatorioArray(num, 0, 9);

        mostrarArray(num);
    }

    public static void rellenarNumAleatorioArray(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {

            lista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }

    }

}
