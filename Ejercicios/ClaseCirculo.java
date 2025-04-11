//Escribe una clase Circulo con un atributo radio y un método que calcule el área.

package Ejercicios;

public class ClaseCirculo {

    double radio;
    
    public ClaseCirculo(double radio){
        this.radio = radio;
    }
    public static void main(String args[]) {
        ClaseCirculo Circulo1 = new ClaseCirculo(8.9);
        Circulo1.calcularArea();
        ClaseCirculo Circulo2 = new ClaseCirculo(14.7);
        Circulo2.calcularArea();
        
    }
        
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2); 
        String areaDosDecimales = String.format("%.2f", area); 
        System.out.println("El área del círculo es " + areaDosDecimales); 
    } 
}
