//Define una clase Alumno con un constructor que reciba nombre y nota, y un método que indique si ha aprobado.

package Ejercicios;

public class ClaseAlumno {

    String nombre;
    int nota;
    
    public ClaseAlumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    public static void main(String args[]) {
        ClaseAlumno Alumno1 = new ClaseAlumno("Manolito", 8);
        Alumno1.mostrarResultado();
        ClaseAlumno Alumno2 = new ClaseAlumno("Pepito", 3);
        Alumno2.mostrarResultado();
    }
        
    public void mostrarResultado() {
        
        if (nota >= 5) {
            System.out.println(nombre + " Ha aprobado");
        }else{
            System.out.println(nombre + " Ha suspendido");
        }
        
    }
    
}
