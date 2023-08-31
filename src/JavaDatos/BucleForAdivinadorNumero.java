package JavaDatos;

import java.util.Random;
import java.util.Scanner;

public class BucleForAdivinadorNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        Random numeros = new Random();

        boolean adivino = false; //

        int numeroSecreto = numeros.nextInt(100)+1;

        //System.out.println(numeroSecreto); //Para verificar cuando se acierta el número

        for (int intento=1; intento<=10; intento++) {
            System.out.print("Adivina el número, tienes " + (11 - intento) + " intentos\nIntento " + intento + ": ");
            int numeroLeido = entrada.nextInt();
            entrada.nextLine();

            // OPERADOR TERNARIO
            String resultado = (numeroLeido == numeroSecreto) ? "¡ACERTASTE!" : ((numeroLeido < numeroSecreto) ? "El numero es mayor" : "El numero es menor");
            System.out.println(resultado);

            // BOOLEAN
            if (numeroLeido == numeroSecreto){
                adivino=true;
            }
        }
        if (adivino){
            System.out.println("¡ACERTASTE!");}
        else {
            System.out.println("No acertaste.\nEl numero secreto era "+numeroSecreto);
        }

            /*if (numeroLeido == numeroSecreto) {
                System.out.println("¡ACERTASTE!");
                adivino = true;
                break;
            }
            if (numeroLeido<numeroSecreto) {
                System.out.println("El numero es mayor");
            }
            if (numeroLeido>numeroSecreto) {
                System.out.println("El numero es mayor");
            }
        }
        if (!adivino){
            System.out.println("No acertaste.\nEl numero secreto era "+numeroSecreto);
        }*/


    }
}
