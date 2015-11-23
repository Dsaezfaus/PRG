package arrays;
import java.util.*;
/*
12.Escribe un programa que permita, partiendo de un vector de diez
elementos numéricos V, generar un vector P con los elementos de V
en orden inverso. Visualizar los dos vectores al final.
 */
public class Ejercicio12 {
    public static void main(String[]args){
        Random rn=new Random();
        int[]p=new int[10];
        int[]v=new int[10];
        int contador=0;
        
        for(int i=0;i<10;i++){
            v[i]=rn.nextInt(100);
        }
        for(int i=9;i>=0;i--){
           p[contador]=v[i];
           contador++;
        }
        for(int i=0;i<10;i++){
            System.out.println("En el vector V, el número ["+v[i]+"] esta en la posición ["+i+"]");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.println("En el vector P, el número ["+p[i]+"] esta en la posición ["+i+"]");
        }
    }
}