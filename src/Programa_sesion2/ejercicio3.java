package Programa_sesion2;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingresa el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println("La hipotenusa de un triángulo rectángulo con catetos " + cateto1 + " y " + cateto2 + " es: " + hipotenusa);

        scanner.close();
    }
}
