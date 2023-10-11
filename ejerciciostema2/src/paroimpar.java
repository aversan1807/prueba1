import java.util.Scanner;

public class paroimpar {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero % 2==0) {
            System.out.println(" el numero " + numero + " es par ");
        }else  {
            System.out.println(" el numero " + numero + " es impar ");
        }
    }
}
