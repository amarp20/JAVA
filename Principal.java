public class Principal {//Esta es la clase principal al ser pública se puede acceder a ella desde cualquier sitio en este archivo.
    public static void main(String[] args) {
        
    }
    
}

class Persona{//Este es el constructor
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellidos, int edad, String dni){//Este es un método de la clase persona
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    public void imprimir(){
        System.out.println(String.join(" - ", nombre, apellidos, String.valueOf(edad), dni));

    }

}

class Libro{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void imprimirLibro(){
        System.out.println(String.join(" - ", titulo, autor, String.valueOf(paginas)));
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }
} 