/*Declara un booleano y usa operadores lógicos con una condición.*/

package Ejercicios;

public class BooleanoCondicional {
    public static void main(String args[]) {
        boolean verdad = true;
        boolean falso = false;

        if (verdad == true) {
            System.out.println("Correcto");
        }else if (verdad = !verdad){
            System.out.println("Incorrecto");
        }else if (verdad && falso){
            System.out.println("No puede ser");
        } else if(verdad || falso){
            System.out.println("Imposible");
        }else{
            System.out.println("Error");
        }
    }
}
