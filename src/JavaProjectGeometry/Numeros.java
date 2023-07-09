package JavaProjectGeometry;

import java.util.Scanner;

public class Numeros {
    public static void main (String args[]){
        Scanner console = new Scanner(System.in);
            int base;
            int altura;

            System.out.print("Ingrese la base del cuadrado: ");
            base = console.nextInt();
            console.nextLine();
            System.out.print("Ingrese la altura del cuadrado: ");
            altura = console.nextInt();
            console.nextLine();

            int perimetro;
            int superficie;

            perimetro = base*2+altura*2;
            superficie = base*altura;

            System.out.println("El perimetro es "+perimetro);
            System.out.print("La superficie es "+superficie);

    }
}
