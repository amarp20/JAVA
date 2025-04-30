package com.mycompany;

import java.util.List;
import java.util.Scanner;

public class AppTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductoDAO dao = new ProductoDAO();
        int opcion;
        
        try{ //inicio el try aquí para que detecte errores en todo el bucle del menú
            do {
                System.out.println("\n--- MENÚ GESTIÓN DE PRODUCTOS ---");
                System.out.println("1. Insertar producto");
                System.out.println("2. Listar productos");
                System.out.println("3. Actualizar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); //Cada una de las opciones llamará a su método correspondiente en la clase Producto DAO

            
                switch (opcion) {
                    case 1:
                        System.out.print("ID: "); int id = sc.nextInt();sc.nextLine(); //Aunque nos pregunta el id lo pondrá automáticamente por la característica de autoincremento. 
                        System.out.print("Nombre: "); String nombre = sc.nextLine();
                        System.out.print("Precio: "); Double precio = sc.nextDouble(); sc.nextLine();
                        System.out.print("Stock: "); int stock = sc.nextInt();sc.nextLine();
                        dao.insertarProducto(new Producto(id, nombre, precio, stock));
                        System.out.println("Producto insertado correctamente.");
                        break;
                    case 2:
                        List<Producto> productos = dao.listarProductos();
                        if (productos.isEmpty())
                            System.out.println("No hay productos registrados.");
                        else
                            productos.forEach(System.out::println);
                        break;
                    case 3:
                        System.out.print("ID del producto a actualizar: "); int idUpd = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo nombre: "); String nomUpd = sc.nextLine();
                        System.out.print("Nuevo precio: "); Double precioUpd = sc.nextDouble(); sc.nextLine();
                        System.out.print("Nuevo stock: "); int stockUpd = sc.nextInt(); sc.nextLine();
                        dao.actualizarProducto(new Producto(idUpd, nomUpd, precioUpd, stockUpd));
                        System.out.println("Producto actualizado correctamente.");
                        break;
                    case 4:
                        System.out.print("ID a eliminar: "); int idDel = sc.nextInt();
                        dao.eliminarProducto(idDel);
                        System.out.println("Producto eliminado correctamente.");
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema. Gracias por hacer uso de las bases de datos marca ACME!!!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 5);
        } catch (Exception v) {  //Implemento una excepción que recoge errores en los datos introducidos, muestra un mensage y vuelve al menú sin salir de la aplicación.
            System.out.println("Se ha producido un error: " + v.getMessage());
            AppTienda.main(args);  
        }
        sc.close();
    }
}
