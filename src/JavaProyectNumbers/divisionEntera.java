package JavaProyectNumbers;

import java.util.Scanner;

public class divisionEntera {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);

        System.out.print("-----------------------------------------------\n");
        System.out.print("Escriba la cantidad de pelotas y luego de niños: \n");
        System.out.print("-----------------------------------------------\n");
        System.out.println("Pelotas: ");
        int pelotas = entrada.nextInt();
        System.out.println("Niños: ");
        int niños = entrada.nextInt();

        int cantXNiño = pelotas/niños;
        int pelotasSobran = pelotas%niños;

        System.out.println("la cantidad de pelotas por niños es "+cantXNiño);
        System.out.print("la cantidad de pelotas que sobran es "+pelotasSobran);

    }
}
