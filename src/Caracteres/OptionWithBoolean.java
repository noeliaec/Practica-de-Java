package Caracteres;
import java.util.Scanner;
public class OptionWithBoolean {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in); //Importar la Clase Scanner:La clase Scanner se importa para permitir la entrada de datos desde la consola.

        final String OPTION_1 = "1";
        final String OPTION_2 = "2";
        final String OPTION_3 = "3";
        final String OPTION_4 = "4";
        final double PI = 3.1415; //Definir Constantes: Se definen constantes para las opciones y el valor de π (PI).


        String opcion;
        double alto, base, radio, area; //Declarar Variables: Se declaran las variables opcion, alto, base, radio y area para almacenar la opción seleccionada y los valores de entrada.

        System.out.print(
                "Elige una opción: \n\n"
                        + "1 o A) Rectángulo\n"
                        + "2 o B) Círculo\n"
                        + "3 o C) Triángulo\n"
                        + "4 o D) Cancelar\n"
                        + ">> "
        );
        opcion = entrada.nextLine(); ////Mostrar Menú y Leer Opción: Se muestra un menú con las opciones y se lee la opción ingresada por el usuario.

        if (opcion.equals(OPTION_1) || opcion.equals("A") || opcion.equals("a")) { //Manejar Opciones:
            System.out.print("ALTO >> ");
            alto = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("BASE >> ");
            base = entrada.nextDouble();
            entrada.nextLine();
            area = alto * base;
            System.out.println("El área es " + area);
        } else if (opcion.equals(OPTION_2) || opcion.equals("B") || opcion.equals("b")) {
            System.out.print("RADIO >> ");
            radio = entrada.nextDouble();
            entrada.nextLine();
            area = radio * radio * PI;
            System.out.println("El área es " + area);
        } else if (opcion.equals(OPTION_3) || opcion.equals("C") || opcion.equals("c")) {
            System.out.print("ALTO >> ");
            alto = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("BASE >> ");
            base = entrada.nextDouble();
            entrada.nextLine();
            area = (alto * base) / 2;
            System.out.println("El área es " + area);
        } else if (opcion.equals(OPTION_4) || opcion.equals("D") || opcion.equals("d")) {
            System.out.print("FINALIZADO");
        } else {
            System.out.print("ERROR: No has ingresado una opción válida\n");
            System.out.println("Presiona ENTER para salir...");
            entrada.nextLine();
        }


        /*
        switch(opcion){
            case OPTION_1, "A", "a":
                System.out.print("ALTO >> ");
                alto = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("BASE >> ");
                base = entrada.nextDouble();
                entrada.nextLine();
                area = alto * base ;
                System.out.println("El área es "+area);
                break;

            case OPTION_2, "B", "b":
                final double PI = 3.1415;
                System.out.print("RADIO >> ");
                radio = entrada.nextDouble();
                entrada.nextLine();
                area = radio * radio * PI ;
                System.out.println("El área es "+area);
                break;

            case OPTION_3, "C", "c":
                System.out.print("ALTO >> ");
                alto = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("BASE >> ");
                base = entrada.nextDouble();
                entrada.nextLine();
                area = (alto * base)/2 ;
                System.out.println("El área es "+area);
                break;

            case OPTION_4, "D", "d":
                System.out.print("FINALIZADO");

        }*/

        }
    }