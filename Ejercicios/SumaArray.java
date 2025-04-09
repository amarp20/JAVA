//Usa un for para sumar los elementos de un array de enteros.

package Ejercicios;

public class SumaArray {
    public static void main(String args[]) {
        int suma = 0;
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++){
            suma +=numeros[i];
        }
        System.out.println(suma);
        
    }
    
}
