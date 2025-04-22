/*Crea una clase base llamada Animal con un método hacerSonido(). 
Luego crea dos clases derivadas: Perro y Gato, que sobrescriban ese método con los sonidos correspondientes. 
Crea instancias de cada clase y llama al método para demostrar el polimorfismo. */

package Ejercicios;

class Animal {
    public void hacerSonido(){
        System.out.println("Este animal hace un sonido genérico.");
    }
}
class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Guau!!!");
    }
}
class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Miau!!!");
    }
}
public class EjercicioHerencia{
    public static void main(String[] args){
        Animal[] animales = {new Perro(), new Gato(), new Animal()};
        for(Animal animal : animales){
            animal.hacerSonido();
        }
    }
}