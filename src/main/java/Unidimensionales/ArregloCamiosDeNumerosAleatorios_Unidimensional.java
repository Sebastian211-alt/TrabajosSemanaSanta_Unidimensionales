/*

Dado un arreglo de N elementos se desea obtener otro arreglo tal que sus elementos sea la diferencia de los elementos sucesivos del arreglo dado
Ejemplo: Arreglo dado A = [4,6,8,2,6,9,5,1]
         Arreglo resultante B = [-2,-2,6,-4,-3,4,4]

*/
package Unidimensionales;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class ArregloCamiosDeNumerosAleatorios_Unidimensional {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arreglo1 [] = new int[5];
        
        arreglo1 [0] = 3;
        arreglo1 [1] = 5;
        arreglo1 [2] = 1;
        arreglo1 [3] = 2;
        arreglo1 [4] = 5;
        
        int arreglo2 [] = new int[5];
        
        for (int i = 4; i>=0 ; i--) {
            
            arreglo2 [i] = arreglo1 [i];
            
            System.out.println(arreglo2[i]);
            
        }
    }
    
}
