package JavaProyectNumbers;

import javax.swing.*;
import java.util.Scanner;

public class divisionEntera {
    public static void main(String arg[]){

        //System.out.print("-----------------------------------------------\n");
        //System.out.print("Escriba la cantidad de pelotas y luego de niños: \n");
        //System.out.print("-----------------------------------------------\n");
        String msj = "Escriba la cantidad de pelotas y luego de niños";
        JOptionPane.showMessageDialog(null,msj);
        //System.out.println("Pelotas: ");

        String pelotas = JOptionPane.showInputDialog("Pelotas");

        //System.out.println("Niños: ");
        String niños = JOptionPane.showInputDialog("Niños");

        int cantXNiño = Integer.parseInt(pelotas)/Integer.parseInt(niños);
        int pelotasSobran = Integer.parseInt(pelotas)%Integer.parseInt(niños);

        JOptionPane.showMessageDialog(null,"la cantidad de pelotas por niños es "+cantXNiño);
        JOptionPane.showMessageDialog(null,"la cantidad de pelotas que sobran es "+pelotasSobran);
        //System.out.println("la cantidad de pelotas por niños es "+cantXNiño);
        //System.out.print("la cantidad de pelotas que sobran es "+pelotasSobran);

    }
}
