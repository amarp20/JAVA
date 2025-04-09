import java.util.Scanner;

public class MenuAmplio {
    public static void main(String args[]) {

        boolean estado = true;
        Scanner input = new Scanner(System.in);
        int contador = 0;

        do {

            System.out.println("Seleccione una opción: ");
            System.out.println("Introduzca 1 para generar otro registro: ");
            System.out.println("Introduzca 2 para ver todos los registro: ");
            System.out.println("Introduzca 3 para generar otro registro: ");
            

            String opcion = input.nextLine();

            switch (opcion) {
                case "1":
                    contador +=1;
                    System.out.println("\nHas seleccionado introducir un registro.\n");
                    break;
                case "2":
                    System.out.println("\nHa generado los siguientes registros: " + contador + "\n");
                    break;
                case "3":
                    System.out.println("\nHa elegido salir, un saludo.\n");
                    estado = false;
                    break;
                default:
                    System.out.println("La opción no es correcta."); 

            }
        } while (estado==true);
        System.out.println("Gracias por jugar.");
        
    }
    
}
