//Crea una clase CuentaBancaria con saldo y métodos depositar y retirar.

package Ejercicios;

import java.util.Scanner;

public class ClaseCuenta {
    
    float saldo;
    
    public ClaseCuenta(float saldo){
        this.saldo = saldo;
    }
        
    public void depositar(float cantidad) {
        saldo +=cantidad; 
    } 

    public void retirar(float cantidad) {
        saldo -= cantidad;
    } 

    public void mostrarSaldo() {
        String saldoDosDecimales = String.format("%.2f", saldo);
        System.out.println("Saldo actual: " + saldoDosDecimales);
    } 

    public void mostrarMenu() {

        String numero;
        float cantidad;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Elija una opción:\n1 para ingresar fondos.\n2 para retirar fondos.\n3 para mostrar saldo\nCualquier otro para salir. ");
            numero = input.next();
            if (numero.equals("1")){
                System.out.println("Que cantidad quiere ingresar:\n");
                if (input.hasNextFloat()) {
                    cantidad = input.nextFloat();
                    depositar(cantidad);
                    mostrarSaldo();
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    input.next();
                }

            }else if(numero.equals("2")){
                System.out.println("Que cantidad quiere retirar:\n");
                if (input.hasNextFloat()) { 
                    cantidad = input.nextFloat(); 
                    if (cantidad <= saldo) { 
                        retirar(cantidad);
                        mostrarSaldo();
                    } else {
                        System.out.println("Operación no válida, saldo insuficiente.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    input.next();
                }
            }else if(numero.equals("3")){
                mostrarSaldo();   
            }else{
                System.out.println("Gracias por utilizar la red de cajeros marca ACME.");
                break;
            }
        } while (true);
        input.close();
    } 
    public static void main(String args[]) {
        ClaseCuenta Cuenta1 = new ClaseCuenta(0f);
        Cuenta1.mostrarMenu(); 
    }

}
