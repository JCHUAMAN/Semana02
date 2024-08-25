
package Programa_sesion2;
import java.util.Scanner;

public class ejercicio01 {
public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    double d, a,b,c, x1, x2;
    System.out.println("Introduzca el primer coeficiente (a):");
    a=entrada.nextDouble();
    System.out.println("Introduzca segundo coeficiente (b):");
    b=entrada.nextDouble();
    System.out.println("Introduzca tercer coeficiente (c):");
    c=entrada.nextDouble();
    
    // calculamos la determinante
    d=((b * b) - 4 * a * c);
        System.out.println("Resultado de la operacion: " + d);
    if (d<0){
    System.out.println("No existen soluciones reales");
    }else {
       x1=(-b+Math.sqrt(d))/ (2*a);
       x2=(-b-Math.sqrt(d))/ (2*a);
            System.out.println("solucion: " + x1);
            System.out.println("solucion: " + x2);
            
            }
    entrada.close();
}
    
}
