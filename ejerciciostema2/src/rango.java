import java.util.Scanner;

public class rango {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 0:
                System.out.println("Cero!");
                break;
            case 1:
                System.out.println("Uno!");
                break;
            case 2:
                System.out.println("Dos!");
                break;
            default:
                System.out.println("Fuera de rango!");
        }

        System.out.println("introduce segundo switch");

        switch (opcion)
        {
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3!");
                break;
            case 3:
                System.out.println("Igual a 3!");
                break;
            default:
                System.out.println("Mayor que 3!");
        }

    }
}