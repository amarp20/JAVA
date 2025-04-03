public class Variables {

    public static void main(String args[]) {
        int numero = 10;//int solo vale para números.
        var numerin = 10;//var vale para todos
        var nonumero = "Alejandro";
        
        System.out.println("El valor de la variable número es: " + numero);
        System.out.println("El valor de la variable numerín es: " + numerin);
        System.out.println("El valor de la variable nonumero es: " + nonumero);
        
        double valor = 9.99;
        int entero = (int) valor;
        System.out.println(entero);
        
        String anios = "7";
        int aniosEntero = Integer.parseInt(anios);
        System.out.println(aniosEntero + 7);
        
        int number = 7;
        String number2 = Integer.toString(number);
        System.out.println(number2 + "Manolo");
        System.out.println(number2 + 7);
        System.out.println(number2.getClass());
        
        int enterito = 6;
        float flotante = 5.5f;
        boolean cierto = true;
        
        System.out.println(enterito);
        System.out.println(flotante);
        System.out.println(cierto);
    }
}

/*Datos primitivos:
byte, short, int, long

Decimales:
float(Un solo decimal y tiene que acabar en f 5.50f), double
Caracteres y decimales:
char(una sola letra), boolean (true y false)

Por referencias:
String, 
arreglos, listas contadas del mismo tipo int[] numeros = {1,2,3,4} char[] letras = {a,b,c,d} su logitud inicial no se puede modificar,
objetos, instancias de clases definidas por el usuario.

Conversión de tipos:
int x = 100;
int y = x; Conversión automática (Implícita)
double valor = 9.99;
int entero = (int) valor; Convierte el tipo de variable, eliminando la parte que no le interesa (explícito)
String anios = "7";
int aniosEntero = Integer.parseInt(anios);
int number = 7;
String number2 = Integer.toString(number);
*/