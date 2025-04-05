/*Usa un operador unario para incrementar y luego decrementar una variable. */

package Ejercicios;

public class OperadorUnario {
    public static void main(String args[]) {
        int a = 10;

        a++;
        System.out.println("El valor de a + 1 es: " + a);
        a--;
        System.out.println("El valor de a - 1 es: " + a);
        System.out.println("El valor de a negativo es: " + (-a));
        System.out.println("El valor de a positivo es: " + (+a));
        
    }
}