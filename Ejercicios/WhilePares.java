/*Escribe un bucle while que imprima los números pares entre 2 y 20. */

package Ejercicios;

public class WhilePares {
    public static void main(String args[]) {

        int numero = 2;
        while (numero <=20) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }
    }
    
}
