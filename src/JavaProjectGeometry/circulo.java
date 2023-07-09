package JavaProjectGeometry;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Escribe el valor del radio: ");
        double r = consola.nextDouble();

        double pi = 3.1415;

        double circunferencia = (r*2)*pi;
        double area = r*r*pi;

        System.out.print("C= "+circunferencia+" A= "+area);
    }
}
