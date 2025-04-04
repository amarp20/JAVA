public class Operadores {

    public static void main(String args[]) {
        int a = 10; //Operadores lógicos
        a += 5;
        a *= 5;
        System.out.println("El valor de a es: " + a);
        
        boolean cond = (5>3);
        System.out.println(cond);
        
        boolean esVerdadero = true;
        esVerdadero = !esVerdadero;
        System.out.println(esVerdadero);
        
        double operacion = Math.pow(3,2)*3;
        System.out.println(operacion);
        
        double otro = Math.sqrt(30);
        System.out.println(otro);
        
        float nota = 7;
        if (nota>=5) {
            System.out.println("Aprobado");
        }else if (nota <5){
            System.out.println("Suspenso");
        }else{
            System.out.println("Error");
        }
        
    }
     
}
/*
or = ||
and = &&
diferente a = !
numero ++ suma uno a numero
numeri -- resta uno a numero
*/