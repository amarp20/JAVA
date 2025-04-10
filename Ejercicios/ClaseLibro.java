//Crea una clase Libro con atributos titulo, autor y paginas, y un método que muestre su información.

package Ejercicios;

public class ClaseLibro {

    String titulo;
    String autor;
    int paginas;
    public static void main(String args[]) {
        ClaseLibro miCoche = new ClaseLibro();
        miCoche.titulo = "La maté por un plato de lentejas";
        miCoche.autor = "John Wayne";
        miCoche.paginas = 620;
        miCoche.mostrarInfo();
    }
        
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
    
}
