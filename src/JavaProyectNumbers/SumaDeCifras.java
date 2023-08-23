package JavaProyectNumbers;

import java.util.Scanner;

public class SumaDeCifras {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        //1234
        System.out.print("Ingrese un numero de 4 cifras: ");
        int numeroCuatroCifras = console.nextInt();
        console.nextLine();

        //1234%10
        int c1= numeroCuatroCifras%10;
        int c2= numeroCuatroCifras/10%10;
        int c3= numeroCuatroCifras/100%10;
        int c4= numeroCuatroCifras/1000;
        int suma = c1+c2+c3+c4;

        System.out.print("La suma de las cifras es: "+suma);
    }

}
