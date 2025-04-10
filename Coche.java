public class Coche {
    
    String marca;
    String modelo;
    int velocidad;
        
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
       
}