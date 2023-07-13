/*
Los tipos primitivos de Java
    byte: 1 byte - Números enteros entre -128 y 127
    short: 2 bytes - Números enteros entre -32768 y 32767
    int: 4 bytes - Números enteros entre -2147483648 y 2147483647
    long: 8 bytes - Números enteros entre -9223372036854775808 y 9223372036854775807
    float: 4 bytes-  Números de coma flotante de hasta 6 y 7 dígitos decimales.
    double: 8 bytes - Ídem anterior pero de hasta 15 dígitos decimales.
    boolean: 1 bit - Valores true o false.
    char: 2 bytes - Un caracter simple dentro de los valores ASCII.
 */

package JavaDatos;

import java.util.Scanner;

public class SentenciaIf {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = console.nextInt();

        if (edad<40) {
            System.out.print("Eres joven");
        }
        else if (edad==40) {
            System.out.print("Tienes exactamente 40");
        }
        else {
            System.out.print("Eres viejo");
        }
    }
}
