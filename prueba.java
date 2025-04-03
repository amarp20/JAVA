import javax.swing.*;

public class Prueba {

    public static void main(String[] args) {
        // Crear el marco de la ventana
        JFrame ventana = new JFrame("Mostrar Imagen");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        // Cargar la imagen
        ImageIcon imagen = new ImageIcon("C:/Users/amarp20/Desktop/PYTHON/recursos/coche.png");

        // Crear etiqueta y asignarle la imagen
        JLabel etiqueta = new JLabel(imagen);
        ventana.add(etiqueta);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
