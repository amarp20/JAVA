public class Funciones {
    
    public void restar(int numero){
        
        while (numero > 0) {
            numero--;
            System.out.println(numero);
        }
        System.out.println("");
    }   

    public void imprimirSaludo() {
        System.out.println("¡Hola, bienvenido a Java!\n");
    }

    public void ImprimirLista(){
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
            }
    }
    public static void main(String[] args) {
        Funciones object = new Funciones();
        object.imprimirSaludo();
        Funciones obj = new Funciones();
        obj.restar(4);
        Funciones listar = new Funciones();
        listar.ImprimirLista();
    }
}



