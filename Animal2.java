class HerenciaAnimal {
    String nombre;

    public HerenciaAnimal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
}

class Perro extends HerenciaAnimal {
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de la superclase
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
}
public class Animal2 {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        perro.ladrar();
    }
}

