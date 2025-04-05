/*Declara dos variables int y usa operadores aritméticos para mostrar sus resultados.*/

package Ejercicios;

public class MostrarResultados {
    public static void main(String args[]) 
    {
        int a = 10;
        int b = 7;
        double c = Math.pow(a, b);
        double d = a;
        double e = b;

        System.out.println("El valor de a + b es: " + (a + b));
        System.out.println("El valor de a - b es: " + (a - b));
        System.out.println("El valor de a * b es: " + (a * b));
        System.out.println("El valor de a / b es: " + (a / b));
        System.out.println("El resultado de a elevado a b es: " + c);
        System.out.println("El valor de a / b con decimales es: " + (d / e));
        System.out.println("El resto de la división de a entre b es: " + (a % b));
        System.out.println("El nuevo valor de a tras sumar a + a será: " + (a += a));
        System.out.println("El nuevo valor de b tras restar b - b es: " + (b -= b));
        System.out.println("Ahora el valor de a * a es: " + (a *= a));
        System.out.println("Ahora el valor de b / b da error por no poder dividir 0 entre 0.");

    }
    
}
