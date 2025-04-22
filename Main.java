class Herencia {// Superclase
    String marca;
    int velocidad;
    
    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }
}
    // Subclase
class Vehiculo extends Herencia {
    int numeroDePuertas;
    
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo();
        miCoche.marca = "Toyota";
        miCoche.velocidad = 120;
        miCoche.numeroDePuertas = 4;
        
        miCoche.mostrarInfo();
        miCoche.acelerar(); // Método heredado
    }
}
