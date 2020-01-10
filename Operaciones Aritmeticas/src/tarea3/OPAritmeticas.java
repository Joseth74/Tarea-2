
package tarea3;
import java.util.Scanner;

public class OPAritmeticas {

    
    public static void main(String[] args) {
       Scanner Aritmetica = new Scanner(System.in);
        int numero1,numero2,suma,resta,multiplicacion,division;
        char operacion;
        
        System.out.println("Digite un numero:  ");
        numero1 = Aritmetica.nextInt();
        System.out.println("Disgite un numero: ");
       numero2 = Aritmetica.nextInt();
       
        System.out.println("¿Que operacion desea realizar? ");
        operacion = Aritmetica.next().charAt(0);
        
        switch(operacion){
            case 'S':
            case 's': suma = numero1+numero2;
                         System.out.println("La suma es: "+suma);break;
            case 'R':
            case 'r': resta = numero1-numero2;
                         System.out.println("La resta es: "+resta);break;
            case 'M':
            case 'm': multiplicacion = numero1*numero2;    
                         System.out.println("La multiplicacion es: "+multiplicacion);break;
            case 'D':
            case 'd': division = numero1/numero2;
                         System.out.println("La divicion es: "+division);break;
    
    }
        
        

        
    }
    
}
