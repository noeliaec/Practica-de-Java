package JavaDatos;

import javax.swing.*;
import java.util.Scanner;

public class SentenciaIfWin {
    public static void main(String args[]){

        String msj = "Ingrese la Edad";
        JOptionPane.showMessageDialog(null,msj);

        String EdadStr = JOptionPane.showInputDialog("Edad");

        while (!esNumeroValido(EdadStr)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una edad válida (número entero).");
            EdadStr = JOptionPane.showInputDialog("Edad");
        }

        int Edad = Integer.parseInt(EdadStr);

        if (Edad<40) {
            JOptionPane.showMessageDialog(null,"Eres joven");
        }
        else if (Edad==40) {
            JOptionPane.showMessageDialog(null,"Tienes exactamente 40");
        }
        else {
            JOptionPane.showMessageDialog(null,"Eres viejo");
        }
    }
    public static boolean esNumeroValido(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
