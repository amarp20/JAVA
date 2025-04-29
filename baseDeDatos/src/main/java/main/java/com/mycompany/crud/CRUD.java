package main.java.com.mycompany.crud;

import java.util.*;

public class CRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlumnoDAO dao = new AlumnoDAO();
    
        while (true) {
            System.out.println("\nMENÚ DE OPCIONES CRUD");
            System.out.println("1. Insertar nuevo alumno");
            System.out.println("2. Listar todos los alumnos");
            System.out.println("3. Actualizar alumno existente");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt(); sc.nextLine();
    
            try {
                switch (opcion) {
                    case 1:
                        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Edad: "); int edad = sc.nextInt(); sc.nextLine();
                        System.out.print("Curso: "); String curso = sc.nextLine();
                        dao.insertar(new Alumno(id, nombre, edad, curso));
                        System.out.println("Alumno insertado correctamente.");
                        break;
                    case 2:
                        List<Alumno> alumnos = dao.obtenerTodos();
                        if (alumnos.isEmpty())
                            System.out.println("No hay alumnos registrados.");
                        else
                            alumnos.forEach(System.out::println);
                        break;
                    case 3:
                        System.out.print("ID del alumno a actualizar: "); int idUpd = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo nombre: "); String nomUpd = sc.nextLine();
                        System.out.print("Nueva edad: "); int edadUpd = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo curso: "); String cursoUpd = sc.nextLine();
                        dao.actualizar(new Alumno(idUpd, nomUpd, edadUpd, cursoUpd));
                        System.out.println("Alumno actualizado correctamente.");
                        break;
                    case 4:
                        System.out.print("ID a eliminar: "); int idDel = sc.nextInt();
                        dao.eliminar(idDel);
                        System.out.println("Alumno eliminado correctamente.");
                        break;
                    case 5:
                        System.out.println("Gracias por utilizar el sistema. ¡Hasta pronto!");
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Se ha producido un error: " + e.getMessage());
            }
        }
    }
}
