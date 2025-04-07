/*Crea un bucle do-while que imprima un menú hasta que el usuario elija salir. */
package Ejercicios;

import java.util.Scanner;

public class WhileMenu {
    public static void main(String args[]) {

        int numero;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduzca un número para continuar ó 1 para salir: ");
            numero = input.nextInt();
            System.out.println("Su número es: " + numero);
        } while (numero != 1);
        System.out.println("Gracias por jugar.");
        
    }
    
}