package JavaDatos;
import java.util.Scanner;
public class BucleFor {
    /*public static void main (String[] args){
        var entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad: \n"+">> ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i=1;i<=cantidad;i++){
            System.out.print("*");
        }
    }*/
    public static void main (String[] args){
        
        for (int i = 1;i <= 10; i++ ) {
            for (int j = i; j <=10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
