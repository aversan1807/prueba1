import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double a = entrada.nextDouble();

        double b = entrada.nextDouble();

        double suma = a + b;

        double resta = a - b;

        double multiplicacion = a * b;

        double division = a / b;

        System.out.println("la suma de a+b es: " + suma);

        System.out.println("la resta de a - b es : " + resta);

        System.out.println("la multiplicacion de a * b es: " + multiplicacion);

        System.out.println("la division de a / b es: " + division);



    }

    double suma(double x, double y){

        double z = x + y;
        return z;

    }

}
