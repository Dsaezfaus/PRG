package arrays;
import java.util.*;
/*
5. Escribe un programa que permita leer una secuencia de 50 números,
guardarlos en un vector. Calcular e imprimir la suma de aquellos cuyo
contenido sea par. 
 */
public class Ejercicio5 {
    public static void main(String[]args){
        double[] num=new double[50];
        Random rn=new Random();
        double cont=0;
        System.out.println("Escriba cincuenta números");
        
        for(int i=0;i<num.length;i++){
            num[i]=rn.nextInt(6000);
            if(i%2==0){
                cont=cont+num[i];
            }
        }
        System.out.println("La suma de todos los números pares es "+cont); 
    }
}