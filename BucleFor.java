public class BucleFor {

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        int[] numeros = {10, 20, 30, 40, 50};//Esto es un array, es mutable y cambiable, pero no se pueden eliminar ni incrementar elementos.
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i += 2){
            System.out.println(numeros[i]);
        }
        String nombre = "Alejandro";
        for (int i = 0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
        String nombra = "Alejandro";
        for (int i = 0; i < 1; i++){
            System.out.println(nombra.replace("l", "b" ));
        }
        for (int i = 1; i <=2; i += 1){
            for (int j = 0; j <=1; j += 1){
                System.out.println(i + j);
            }
        }
    }
}