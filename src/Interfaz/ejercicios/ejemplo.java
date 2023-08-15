package Interfaz.ejercicios;

import javax.swing.*;

public class ejemplo {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Ejemplo Swing");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear un etiqueta y agregarla al panel
        JLabel etiqueta = new JLabel("Hola, mundo!");
        panel.add(etiqueta);

        // Crear un botón y agregarlo al panel
        JButton boton = new JButton("Haz clic");
        panel.add(boton);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
