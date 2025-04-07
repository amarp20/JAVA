/*Crea una estructura if-else que imprima "Es par" si un número es divisible por 2 */

package Ejercicios;
import java.util.Scanner;

public class EsPar {
    public static void main(String args[]) {

        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
            } 
            
        input.close();
    }
}
