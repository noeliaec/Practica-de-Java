package JavaProyectNumbers;

import java.util.Scanner;

public class promedio {
    public static void main(String args[]){
        Scanner console= new Scanner(System.in);

        System.out.print("Ingresa en primer numero: ");
        double numero1 = console.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = console.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        double numero3 = console.nextInt();

        System.out.print("Ingresa el cuarto numeros: ");
        double numero4 = console.nextInt();

        double promedio = (numero1+numero2+numero3+numero4)/4;
        System.out.print("El promedio es "+promedio);

    }
}
