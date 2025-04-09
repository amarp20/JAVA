//Escribe un método calcularAreaRectangulo(double base, double altura) que devuelva el área.

package Ejercicios;

public class MetodoArea {

    public static double calcular(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static void main(String[] args) { 
        double base = 15;
        double altura = 20;
        
        System.out.println("El área del rectángulo es: "+calcular(base, altura)); 
    }  
}
