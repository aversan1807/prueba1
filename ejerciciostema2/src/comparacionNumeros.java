import java.util.Scanner;
public class comparacionNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce primer numero entero");
        int n1 = entrada.nextInt();

        System.out.println("Introduce segundo numero entero");
        int n2 = entrada.nextInt();

        if(n1 > n2) {
            System.out.println("El numero mayor es " +n1);

        }else{
            System.out.println("El numero mayor es" +n2);
        }

    }
}
