public class FuncionStatic {

    public static String saludar(String nombre){
        String saludo = "Hola. Bienvenido " + nombre; 

        return saludo; //el método saludar devolverá el mensaje saludo con el nombre que se le envía desde el método verificar.
       
    }   

    public static String error(String nombre){
        String error = "No pudimos validar tus datos. ¿" + nombre + " es tu usuario?";

        return error; //el método arror delvolverá el mensaje error con el nombre que se le envía desde el método verificar.
       
    }   

    public static void verificar(String usuario, String contrasenia) {
        
        String usuarioValido = "Juan"; //damos un valor a un usuario con su contraseña para luego comparar con los datos que se introduzcan al llamar al método verificar.
        String contraseniaValida = "MiContrasenia";

        if (usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia)){ //si el usuario y la contraseña introducidos al llamar al método validadar son iguales a los valores almacenados arriba.
            System.out.println(saludar(usuario)); //llama al método saludar mandándole el nombre del usuario introducido.
            return; //Este return es para salir del método.
        }
        
        System.out.println(error(usuario)); //si no son iguales llama al método error mandándole el nombre del usuario introducido.
    
    }
    public static void main(String[] args) { //generamos una clase principal para ejecutar los métodos.
        String usuario = "Juan";
        String contrasenia = "MiContrasenia";

        verificar(usuario, contrasenia); //generamos una llamada al método verificar habiendo creado antes los dos string necesaros.

        String usuario1 = "Juan";
        String contrasenia1 = "MiContrasenia2";

        verificar(usuario1, contrasenia1); //generamos otra llamada para comprobar que el resultado será erróneo.
       
    }
    
}
