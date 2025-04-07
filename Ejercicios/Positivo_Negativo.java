/*Escribe un programa que diga si un número es positivo, negativo o cero usando if-else-if*/

package Ejercicios;
import java.util.Scanner;

public class Positivo_Negativo {
    public static void main(String args[]) {

        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = input.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo.");
        }else if (numero > 0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es cero.");
            } 
            
        input.close();
    }
}
