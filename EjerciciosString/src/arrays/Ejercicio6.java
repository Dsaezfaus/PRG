package arrays;
import java.util.*;
/*
6. Escribe un programa que permita introducir vector de diez elementos
numéricos, visualizarlo y luego indicar cuales elementos son pares y
ocupan una posición par, indicar contenido y posición.
Repetir para contenido múltiplo de tres y posición impar.
 */
public class Ejercicio6 {
    public static void main(String[]args){
        Random rn=new Random();
        int[]num=new int[10];
        System.out.println("Escriba diez números");
        
        for(int i=1;i<num.length;i++){
            num[i]=rn.nextInt(100);
            if(num[i]%2==0&&i%2==0){
                System.out.println("El número "+num[i]+" es par y se encuentra en la posición "+i+" que es también par." );
            }else if(num[i]%2==1&&i%2==1) System.out.println("El número "+num[i]+" es impar y se encuentra en la posición "+i+" que es también impar.");
            if(num[i]%3==0){
                System.out.println("El número "+num[i]+" es múltiplo de 3 y está en la posición "+i);
            }
        }
    }
}