package JavaProjectGeometry;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);

        System.out.print("Escribe el valor del radio: ");
        double radio = consola.nextDouble();

        double circunferencia = (radio*2)*3.14;
        double area = radio*radio*3.14;

        System.out.print("C= "+circunferencia+" A= "+area);
    }
}
