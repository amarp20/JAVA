import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String args[]) {
        int base;
        int altura;
        int area;
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca la base: ");
        base = input.nextInt();
        System.out.println("Introduzca la altura: ");
        altura = input.nextInt();
        
        area = base * altura;
        
        System.out.println("El área es igua a: " + area);
    }
}