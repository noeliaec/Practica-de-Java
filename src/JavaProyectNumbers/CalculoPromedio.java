package JavaProyectNumbers;

import java.util.Scanner;
public class CalculoPromedio {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int suma = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        double promedio = (double) suma / cantidadNumeros;
        System.out.println("El promedio es: " + promedio);
    }
}
