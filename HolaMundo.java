import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        String nombre;//Declaramos las variables que vamos a usar luego asignándoles un tipo.
        Scanner scan;
        
        System.out.println("Hola Mundo");
        
        scan = new Scanner(System.in); // le digo que scan va a recibir su valor desde fuera.
        System.out.println("Introduce tu nombre: ");
        nombre = scan.next();//Aquí declaramos que lo que reciba scan lo almacene en nombre, ya que nombre es un string.
        System.out.println("Tu nombre es " + nombre);//Aquí decimos que nos imprima el mensaje y la variable nombre.
        nombre = "María";
        System.out.println("Hola " + nombre);//Ejecutará de nuevo un saludo, en este caso sin introducir el dato desde fuera, se lo hemos dado en la línae anterior.
    }
}
