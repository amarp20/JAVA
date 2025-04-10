public class ClaseCoche {
    
    String marca;
    String modelo;
    int velocidad;
    public static void main(String args[]) {
        ClaseCoche miCoche = new ClaseCoche();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.velocidad = 120;
        miCoche.mostrarInfo();
    }
        
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
       
}