package arrays;
import java.util.*;
/*
14.Escribe  un  programa  que  permita,  a  partir  de 
un  vector  V  de  50 elementos, crear e imprimir un vector P 
con los elementos de V cuyo contenido sea par. 
Si no lo hubiera, visualizar el mensaje adecuado.
 */
public class Ejercicio14 {
    public static void main(String[]args){
        Random rn=new Random();
        int[]p=new int[50];
        int[]v=new int[50];
        int cont=0;
        boolean par=false;
        
        for(int i=0;i<50;i++){
            v[i]=rn.nextInt(100);
            
            if(v[i]%2==0&&v[i]!=0){
                p[cont]=v[i];
                cont++;
                par=true;
                System.out.println("El valor de V en la posición "+(i+1)+" es par."
                        + "\n Es el número "+v[i]+" Y se ha guardado en el indice "+cont+" de P\n");
            }
        }
        if(par==false){
            System.out.println("No han habido números pares en la secuencia de V");
            for(int i=0;i<50;i++){
               System.out.println(v[i]);
            }
        }
    }
}
