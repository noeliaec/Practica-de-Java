package JavaDatos;

import javax.swing.*;
public class Variables {
    public static void main (String[] args){

        String frase = JOptionPane.showInputDialog("Ingrese la frase");

        String msj = "La frase <"+frase+"> es correcta";

        JOptionPane.showMessageDialog(null,msj);

    }
}
