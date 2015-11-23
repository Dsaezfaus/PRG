package arrays;
import java.util.*;
/*
4.Escribe  un  programa  que  permita introducir  vector  numérico  de  diez elementos, 
visualizarlo y luego visualizar los elementos cuyo contenido sea par, indicando su posición.
Repetir para impar
 */
public class Ejercicio4 {
    public static void main(String[]args){
        int[] num=new int[10];
        Random rn=new Random();
        System.out.println("Escriba diez números");
        
        for(int i=0;i<num.length;i++){
            num[i]=rn.nextInt(100);
        }
        for(int i=0;i<num.length;i++){  
            if(num[i]%2==0){
                System.out.println("El carácter("+num[i]+") de la posición "+(i+1)+" es par.");
            }else System.out.println("El carácter("+num[i]+") de la posición "+(i+1)+" es impar.");
        }
    }
}