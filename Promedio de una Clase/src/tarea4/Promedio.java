
package tarea4;

import java.util.Scanner;


public class Promedio {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nota1;
       int nota2;
       int nota3;
       int nt = 0;
       int resultado;
       
        System.out.println("Ingrese la primera nota:");
        nota1 = sc.nextInt();
        nt += nota1;
        System.out.println("Ingrese la primera nota:");
        nota2 = sc.nextInt();
        nt += nota2;
        System.out.println("Ingrese la tercer nota:");
        nota3 = sc.nextInt();
        nt += nota3;
        
        resultado = nt/3;
        
        System.out.println("El promedio de notas es: "+resultado);
       
        if(resultado>=75) System.out.println("Si aprueba");
        else{
                System.out.println("No aprueba");
                }

        
        
    }
    
}
