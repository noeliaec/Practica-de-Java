package JavaDatos;

import javax.swing.*;
import java.util.Scanner;

public class IngresarEdad {
    public static void main (String args[]){

        String msj = "Formulario: Ingrese sus datos";
        JOptionPane.showMessageDialog(null,msj);

        String Nombre = JOptionPane.showInputDialog("Nombre");
        String EdadStr = JOptionPane.showInputDialog("Edad");
        String Nacionalidad = JOptionPane.showInputDialog("Nacionalidad");

        int Edad = Integer.parseInt(EdadStr);

        String mensaje = "Tu nombre: " + Nombre + "\n"
                       + "Tu edad: " + Edad + "\n"
                       + "Tu Nacionalidad: " + Nacionalidad;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
