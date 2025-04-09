//Define un método mostrarTablaDel5() que imprima la tabla de multiplicar del 5.

package Ejercicios;

public class TablaMultiplicar {

    public static void mostrarTablaDel5(){
        for (int i = 0; i <= 10; i++){
           System.out.println("5 X " + i + " = " + (i*5));
        }
   } 
   public static void main(String[] args) { 
       mostrarTablaDel5(); 
   }
    
}
