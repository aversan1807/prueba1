import java.util.Scanner;
public class ejercicioclase {

    static final double CONSTANTE_GRAVITACIONAL = 6.67430e-11;
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

       final double CONSTANTE_GRAVITACIONAL = 6.67430e-11;

        final double CONSTANTE_GRAVITACIONAL_2 = 6.67430e-11;

        System.out.print("ingrese la masa del primer objeto (en kg) ");

        double masa1 = entrada.nextDouble();

        System.out.print("ingrese la masa del segundo objeto en (kg)");

        double masa2 = entrada.nextDouble();

        System.out.print("ingrese la distancia entre los objetos (en metros) ");

        double distancia = entrada.nextDouble();

        double fuerzaGravitacional = getFuerzaGravitacional(CONSTANTE_GRAVITACIONAL, masa1, masa2, distancia);



    }

    public static double getFuerzaGravitacional(double CONSTANTE_GRAVITACIONAL, double masa1, double masa2, double distancia) {
        return (CONSTANTE_GRAVITACIONAL * masa1 * masa2) / (distancia * distancia);
    }
}