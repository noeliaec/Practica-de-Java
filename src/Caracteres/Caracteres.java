/*
Escape Sequence             Description
        \t                 insert tab in the text at the point
        \b                 insert backspace in the text at the point
        \n                 insert newline in the text at the point
        \r                 insert carriage return in the text at the point
        \f                 insert a form feed in the text at the point
        \'                 insert a simple quote character in the text at the point
        \"                 insert a double quote character in the text at the point
        \\                 insert a backslash character in the text at the point
 */

package Caracteres;

public class Caracteres {
    public static void main(String args[]){
        System.out.println("Hola\nmundo");
        System.out.println("Hola\bmundo");
        System.out.println("Hola\tmundo");
        System.out.print("------------------------------------------------\n");
        System.out.print("Lista\n");
        System.out.print("\tLeche\n\tPan\n\tHarina\n\tArroz\n");
        System.out.print("------------------------------------------------\n");
        System.out.println("Hola\rmundo");
        System.out.println("Hola\fmundo");
        System.out.print("------------------------------------------------\n");
        System.out.println("Hola\'mundo");
        System.out.println("Hola\"mundo");
    }

}
