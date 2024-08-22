// Realizar un juego para adivinar un número. Para ello pedir un número N, 
//y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
//El proceso termina cuando el usuario acierta.
package Programa_sesion2;
import java.util.Scanner;
public class Programa_sesion2 {
    public static void main(String[] args) {
        int n, num;
        Scanner scanner= new Scanner(System.in);
        // n es el numero que hay que acertar 
        // num guarda los numeros introducidos
        System.out.print ("Introduce N: ");
        n=scanner.nextInt();
        
        System.out.print("Introduce numero: ");
        num=scanner.nextInt();
        
        while(num!=n) // mientras no coincidan ambos numeros
        {
            if(num>n)
                System.out.println("menor");
            else
                System.out.println("mayor");
            
            System.out.print("Introduce un numero: ");
            num=scanner.nextInt();
        }
        // al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("acertaste...");
        scanner.close();
    }
    
}
