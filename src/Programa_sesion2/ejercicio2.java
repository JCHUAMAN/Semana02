package Programa_sesion2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingreso de datos por el usuario
        System.out.println("Introduce el capital inicial:");
        double capitalInicial = entrada.nextDouble();

        System.out.println("Introduce la tasa de interés anual (%):");
        double tasaInteres = entrada.nextDouble() / 100;

        System.out.println("Introduce el número de años:");
        int años = entrada.nextInt();

        // Cálculo del interés compuesto (anual)
        double capitalFinal = capitalInicial * Math.pow(1 + tasaInteres, años);

        System.out.println("El capital final después de " + años + " años es: " + capitalFinal);

        entrada.close();
    }
}
