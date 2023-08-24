package JavaProjectGeometry;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class CalculadoraArea {
    public static void main(String[] args) {

        String[] opciones = {"Cuadrado", "Circulo", "Triangulo"};
        Image icono = new ImageIcon("C:\\Users\\hades\\Downloads\\Geometry.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH); // Cambia la ruta por la ubicación real del icono
        ImageIcon iconoRedimensionado = new ImageIcon(icono);

        int eleccion = JOptionPane.showOptionDialog(
                null,
                "Elija una opción",
                "Calculadora de Área",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                iconoRedimensionado,
                opciones,
                opciones[0]
        );
        if (eleccion == 0) {
            String base = (String) JOptionPane.showInputDialog(null, "Ingrese Base","Cuadrado",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado, null, null);
            String altura = (String) JOptionPane.showInputDialog(null, "Ingrese Altura","Cuadrado",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado, null, null);
            int area = Integer.parseInt(base) * Integer.parseInt(altura);

            JOptionPane.showMessageDialog(null, "El área es " + area,"Cuadrado",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado);
        }

        if (eleccion == 1) {
            double pi = 3.1415;
            String radio = (String) JOptionPane.showInputDialog(null, "Ingrese Radio","Círculo",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado, null, null);
            double area = Integer.parseInt(radio) * Integer.parseInt(radio) * pi;

            DecimalFormat formato = new DecimalFormat("#.00");
            String areaFormateada = formato.format(area);

            JOptionPane.showMessageDialog(null, "El área es " + areaFormateada, "Círculo",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado);
        }

        if (eleccion == 2) {
            String base = (String) JOptionPane.showInputDialog(null, "Ingrese Base","Triángulo",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado, null, null);
            String altura = (String) JOptionPane.showInputDialog(null, "Ingrese Altura","Triángulo",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado, null, null);
            double area = (double) (Integer.parseInt(base) * Integer.parseInt(altura)) / 2;

            JOptionPane.showMessageDialog(null, "El área es " + area,"Triángulo",
                    JOptionPane.PLAIN_MESSAGE,iconoRedimensionado);
        }
    }
}








