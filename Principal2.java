public class Principal2 {
    public static void main(String[] args) {
        Persona p3 = new Persona("Alejandro", "Martín", 45, "28888888W");
        p3.imprimir();

        Libro l1 = new Libro("El señor de los Anillos", "JRR Tolkien", 756);
        l1.imprimirLibro();

        System.out.println(l1);

    }
}
