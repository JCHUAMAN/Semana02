package Programa_sesion2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();
        
        double resultado = Math.sqrt(numero);
        System.out.println("La raíz cuadrada del número " + numero + " es: " + resultado);
        
        scanner.close();
    }
}