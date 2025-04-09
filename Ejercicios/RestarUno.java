//Declara una variable int y usa un while para restar 1 hasta llegar a 0.

package Ejercicios;

import java.util.Scanner;

public class RestarUno {
    public static void main(String args[]) {

        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número para mostrar una secuencia de resta de uno en uno: ");
        numero = input.nextInt();

        while (numero > 0) {
            numero--;
            System.out.println(numero);
            }
    } 
}
