//Crea un método que reciba dos números y devuelva el mayor.

package Ejercicios;

public class NumeroMayor {
    
    public static void mayor(int numero1, int numero2) {
        
        if (numero1 > numero2){ 
            System.out.println(numero1); 
        }else if (numero2 > numero1){
            System.out.println(numero2);
        }else{
            System.out.println("Los números son iguales.");
        }
    }
    public static void main(String[] args) { 
        int numero1 = 7;
        int numero2 = 2;
        mayor(numero1, numero2); 
       
    }
}
