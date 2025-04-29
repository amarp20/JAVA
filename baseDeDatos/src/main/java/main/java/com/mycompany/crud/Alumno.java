package main.java.com.mycompany.crud;

public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    private String curso;

    public Alumno(int id, String nombre, int edad, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCurso() { return curso; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
