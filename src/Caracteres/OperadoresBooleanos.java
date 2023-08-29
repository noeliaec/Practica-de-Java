package Caracteres;

public class OperadoresBooleanos {
    public static void main(String[] args) {
        boolean a, b;
        /*
        AND = (a&&b) circuito corto verifica la primera
              (a&b)  circuito largo verifica
        OR  = (a|b)  circuito corto almenos una es verdadera
            = (a||b) circuito largo se verifica
        XOR = (a^b)  es solo un circuito y es para verificar que solo hay un true
        NOT = (!a)   verifica una falsedad


                +--------------------------------+-------------------------------------+
                |       Operación Booleana       |          Resultado en Java          |
                +--------------------------------+-------------------------------------+
                |            ! (NOT)             |   true si es false, false si es true|
                +--------------------------------+-------------------------------------+
                |            && (AND)            |       true si ambos son true        |
                +--------------------------------+-------------------------------------+
                |            || (OR)             |     true si al menos uno es true    |
                +--------------------------------+-------------------------------------+
                |            ^ (XOR)             |  true si uno es true, pero no ambos |
                +--------------------------------+-------------------------------------+
        */

        a = false;
        b = false;
        if (a & b) {
            System.out.println("Todas son verdaderas");
        } else {
            System.out.println("Alguna es falsa");
        }
    }
}
