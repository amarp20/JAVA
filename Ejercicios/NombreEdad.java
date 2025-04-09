//Crea un método que reciba el nombre y la edad de una persona y devuelva un mensaje personalizado.

package Ejercicios;

public class NombreEdad {

    public static String mensaje(String nombre, int edad) {
        return nombre + " Tu edad es " + edad + " años.";
    }

    public static void main(String[] args) { 
        String nombre = "Alejandro";
        int edad = 45;
        
        System.out.println(mensaje(nombre, edad)); 
    }  
    
}
