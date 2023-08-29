package Caracteres;
/*
public class OperadorTernario {
     public static void main(String args[]) {
            int i = 1;
            int j = 2;
            int numeroMayor = 0;
            if (i > j) {
                numeroMayor = i;
            } else {
                numeroMayor = j;
            }
            System.out.println("numeroMayor: " + numeroMayor);
        }
    }
*/
// resultado = (condición) ? primerValor : segundoValor;
public class OperadorTernario { //ESCENARIO 1
    public static void main(String[] args) {
        int i = 7;
        int j = 2;
        int k = 5;
        int numeroMayor = 0;
        numeroMayor = (i > j) ? ((i > k) ? i : k) : ((j > k) ? j : k);
        System.out.println("numeroMayor: " + numeroMayor);

        /*
        El primer operador ternario (i > j) ? ((i > k) ? i : k) compara i con j, y
        si i es mayor que j, entonces compara i con k y selecciona el mayor entre i y k.
        El segundo operador ternario ((j > k) ? j : k) compara j con k y
        selecciona el mayor entre j y k.
         */
    }
}
    /*
public class OperadorTernario { //ESCENARIO 2
    public static void main(String args[]) {
        int i = 1;
        int j = 2;
        System.out.println("numeroMayor: " + ((i > j) ? "i es mayor" : "j es mayor"));
    }
}
     */
