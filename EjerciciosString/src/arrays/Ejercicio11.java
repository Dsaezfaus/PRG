package arrays;
import java.util.*;
/*
11.Escribe un programa que permita introducir un vector P de diez
elementos numéricos, visualizar su contenido, crear un vector V con
los elementos de P que sean mayores de diez. Visualizar luego el
contenido de V.
 */
public class Ejercicio11 {
    public static void main(String[]args){
        Random rn=new Random();
        int[]p=new int[10];
        int[]v=new int[10];
        int ind=0;
        
        for(int i=0;i<10;i++){
            p[i]=rn.nextInt(20);
            System.out.println("En el vector P, el número "+p[i]+" esta en la posición "+i);
        }
        for(int i=0;i<10;i++){
            if(p[i]>10){
                v[ind]=p[i];
                ind++;
            }       
        }
        System.out.println("");
        for(int i=0;i<ind;i++){
            System.out.println("En el vector V, el número "+v[i]+", que es mayor de 10 esta en la posición "+i);
        }
    }
}
    