package JavaProjectGeometry;

import java.util.Scanner;

public class triangulo {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        int base;
        int altura;
        double lado;

        System.out.print("Ingrese la base del triangulo: ");
        base = console.nextInt();
        console.nextLine();

        System.out.print("Ingrese la altura del triangulo: ");
        altura = console.nextInt();
        console.nextLine();

        double perimetro;
        double superficie;

        lado = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2)) ;

        perimetro= base+lado*2;
        superficie= (base*altura)/2;


        System.out.println("El perimetro es "+perimetro);
        System.out.print("La superficie es "+superficie);

    }

}
