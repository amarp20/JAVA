/*Escribe un programa que evalúe una nota del 0 al 100 y devuelva "Excelente", "Bueno", "Regular" o "Insuficiente". */

package Ejercicios;

import java.util.Scanner;

public class ValorarNota {
    public static void main(String args[]) {

        int numero;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca una nota para obtener su valor: ");
        numero = input.nextInt();

        if(numero >=0 && numero < 25) {
            System.out.println("La nota es Insuficiente.");
        }else if(numero >=25 && numero < 50){
            System.out.println("La nota es Regular.");
        }else if(numero >=50 && numero < 75){
            System.out.println("La nota es Buena.");
        }else if(numero >=75 && numero <= 100){
            System.out.println("La nota es Excelente.");
        }else{
            System.out.println("Nota incorrecta.");
            }
            
        input.close();
    }
    
}
