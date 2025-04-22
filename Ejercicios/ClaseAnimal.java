package Ejercicios;

public class ClaseAnimal {

    String nombre;
    String onomatopeya;
    
    public ClaseAnimal(String nombre, String onomatopeya){
        this.nombre = nombre;
        this.onomatopeya = onomatopeya;
    }
    public static void main(String args[]) {
        ClaseAnimal Animal1 = new ClaseAnimal("León", "Groarrrrrr!!!!!");
        Animal1.mostrarSonido();
        ClaseAnimal Animal2 = new ClaseAnimal("Pingüino", "Chirik!!!");
        Animal2.mostrarSonido();
    }
        
    public void mostrarSonido() {
        
        System.out.println("El " + nombre + " hace " + onomatopeya + ".");
    }
    
}
