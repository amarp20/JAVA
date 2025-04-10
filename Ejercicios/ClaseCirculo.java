//Escribe una clase Circulo con un atributo radio y un método que calcule el área.

package Ejercicios;

public class ClaseCirculo {

    float radio;
    
    public ClaseCirculo(float radio){
        this.radio = radio;
    }
    public static void main(String args[]) {
        ClaseCirculo Circulo1 = new ClaseCirculo(8.9f);
        Circulo1.calcularArea();
        ClaseCirculo Circulo2 = new ClaseCirculo(14.7f);
        Circulo2.calcularArea();
        
    }
        
    public void calcularArea() {
        
        System.out.println("El área del círculo es" + String.format("%.2f", (2 * Math.PI * radio)));
        
    }
    
}
