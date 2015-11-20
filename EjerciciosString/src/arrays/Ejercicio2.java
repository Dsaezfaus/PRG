package arrays;
import java.util.*;
/*
2. Escribe un programa que permita introducir un vector de diez
elementos alfanuméricos y luego visualizar los que ocupen la posición par.
Repetir para los de posición impar.
*/
public class Ejercicio2 {
    public static void main (String args[]){
        Scanner tec = new Scanner (System.in);
        String [] vector=new String[10];
        System.out.println("Introduzca una cadena de carácteres alfanuméricos");
        for(int i=0;i<vector.length;i++){
            vector[i]=tec.next();
        }
        
        for(int i=0;i<vector.length;i++){
        if(i%2==0)
            System.out.println("El numero de la posicion "+i+" es "+vector[i]+" que es par");
            else System.out.println("El numero de la posicion "+i+" es "+vector[i]+" que es impar");
        }
    }
}