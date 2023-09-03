package ProyectoFinal;

import java.util.Scanner;

public class AdivinadorAutomaticoDeNumeros {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // PASO 1 : constantes y variables
        String opcion;
        boolean adivino, trampa;
        int min, max, i, maxIntentos, numeroPosible;
        // PASO 2 : mensaje
        System.out.println("Intentaré adivinar el número que tu elijas\n" +
                           "Cuando muestre un número tu deberas ingresar:\n" +
                           "\t > si el número es mayor al que mostre\n" +
                           "\t<si el número es menor al que mostre\n" +
                           "\t = si acierto el número");
        // PASO 3 : Entrada de usuario
        System.out.print("Escribe el número mínimo: ");
        min = entrada.nextInt();
        entrada.nextLine();
        System.out.println();
        // Entrada de usuario
        System.out.print("Escribe el número máximo: ");
        max = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        // PASO 4 :log
        maxIntentos = (int)(Math.log(max-min+1)/Math.log(2)+1); //logaritmo de intentos entre la cantidad minima y maxima de numeros
                                                                //log en base 2 de la cantidad de numeros totales
        // PASO 5 : Respuesta
        System.out.println("EXCELENTE! Adivinare tu número en no más de "+maxIntentos+" intentos\n" +
                           "Presiona ENTER cuando quieras comenzar...");
        entrada.nextLine();
        System.out.println();

        // PASO 6 : booleanos
        adivino = false;
        trampa = false;

        // PASO 7 : BUCLE
        for (i=1; i<=maxIntentos; i++){
            numeroPosible = ((max-min)/2)+min;
            System.out.print("Intento "+i+" -> El numero es... "+numeroPosible+": ");
            opcion= entrada.nextLine();
        // PASO 8 : OPCIONES
            switch (opcion) {
                case  "=":
                    adivino = true;
                    break;
                case  "<":
                    max = numeroPosible - 1;
                    break;
                case  ">":
                    min = numeroPosible + 1;
                    break;
            }
        // PASO 9
            if (adivino) break;

            if ((min>max) || (max<min)) {
                System.out.println("¡¡¡ESTAS HACIENDO TRAMPA!!!");
                trampa = true;
                break;
            }
        }
        // PASO 10
        if ((i == maxIntentos) && (!adivino) && (!trampa)){
            System.out.println("¡GANASTE! No pude encontrar el número");
        }
        else if (adivino){
            System.out.println("¡¡¡GANÉ!!! Ponelo mas dificil");
        }
    }
}
