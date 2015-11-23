package arrays;
import java.util.*;
/*
13.
Escribe  un  programa  que  permita,  partiendo  de un  Vector  V  de 
elementos, generar  un  vector  P  de  cincuenta elementos  de 
forma que:  
P(1)=V(1), 
P(2)=V(1)+V(2), 
P(3)=V(1)+V(2)+V(3) .... 
P(50)= V(1)+V(2)+V(3)+...+ V(50)
 */
public class Ejercicio13 {
    public static void main(String[]args){
        Random rn=new Random();
        int[]p=new int[50];
        int[]v=new int[50];
        
        for(int i=0;i<50;i++){
            v[i]=rn.nextInt(100); 
        }
        p[0]=v[0];
        System.out.println("El elemento número 0 en P vale "+p[0]+
                "\n (el valor de [V] "+v[0]+", MÁS la [P] anterior 0)");
        for(int i=1;i<50;i++){
            p[i]=p[i-1]+v[i];
            System.out.println("El elemento número "+i+" en P vale "+p[i]+
                    "\n (el valor de [V] "+v[i]+", MÁS la [P] anterior "+p[i-1]+")");
        }
        
    }
}