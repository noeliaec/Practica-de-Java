package Javachiquitito;

import java.util.Scanner;

public class triangulo {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        double base;
        double altura;
        double lado;

        System.out.print("Ingrese la base del triangulo: ");
        base = console.nextDouble();
        console.nextLine();

        System.out.print("Ingrese la altura del triangulo: ");
        altura = console.nextDouble();
        console.nextLine();

        double perimetro;
        double superficie;

        lado = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2)) ;

        perimetro= base+lado* 2;
        superficie= (base*altura)/ 2;


        System.out.println("El perimetro es "+perimetro);
        System.out.print("La superficie es "+superficie);

    }

}
