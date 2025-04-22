import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Introduce el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        int resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);
    } catch (NumberFormatException e) {
        System.out.println("Por favor, introduce un número válido.");
    } catch (ArithmeticException e1) {
        System.out.println("No se puede dividir por cero.");
    } finally {
        scanner.close();
        System.out.println("Recurso cerrado.");
    }
    }
}