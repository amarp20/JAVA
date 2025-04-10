public class ClaseConstructor {

    String marca;
    String modelo;
    int velocidad;
    
    public ClaseConstructor(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public static void main(String args[]) {
        ClaseConstructor miCoche = new ClaseConstructor("Toyota", "Corolla", 120);
        miCoche.mostrarInfo();
    }
        
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
    
}
