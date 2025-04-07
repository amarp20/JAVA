/*Usa un if para mostrar un mensaje si una persona puede votar (mayor de 18). */

package Ejercicios;

import java.util.Scanner;

public class MayorEdad {
     public static void main(String args[]) {

        int edad;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad y puede votar.");
        }else if (edad <18 && edad >= 0){
            System.out.println("Usted es menor de edad y no puede votar.");
        }else{
            System.out.println("Usted es un mentiroso.");
            } 
            
        input.close();
    }
    
}
