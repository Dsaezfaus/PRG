package arrays;
import java.util.*;
/*
8. Escribe un programa que permita introducir vector de veinte elementos
y visualizar, indicar luego posición y contenido de todos aquellos que
sean mayores que diez. Indicando cuantos elementos hay que
cumplen esta condición
 */
public class Ejercicio8 {
    public static void main(String[]args){
        Random rn=new Random();
        int[] num=new int[20];
        int cont=0;
        
        for(int i=0;i<20;i++){
            num[i]=rn.nextInt(100);
            if(num[i]>10){
                System.out.println("El número "+num[i]+" introducido en la posición "+(i+1)+" es mayor de 10");
                cont++;
            }
        }
        System.out.println("Hay "+cont+" números que son mayores de 10");
    } 
}