/*Crea una clase Empleado con los atributos nombre y salario, y un método mostrarInfo(). 
Luego crea una clase Gerente que herede de Empleado y añada el atributo departamento. 
Utiliza super() para llamar al constructor de la clase base. */

package Ejercicios;

public class EjercicioEmpleado {
    public static void main(String[] args){
        Gerente Juan = new Gerente("Juan", 100, "TCI");
        Juan.mostrarInfo();

    }
}

class Empleado{
    protected String nombre;
    protected double salario;

    Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento=departamento;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
    }
}