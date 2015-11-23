package arrays;
import java.util.*;
/*
3.Escribe un programa que permita introducir un vector de 20 elementos 
numéricos y visualizarlos de cuatro en cuatro.
 */
public class Ejercicio3 {
    public static void main (String args[]){
        Scanner tec = new Scanner (System.in);
        Random rn=new Random();
        int[] num= new int[20];
        
        for (int i=0;i<num.length;i++){
            num[i]=rn.nextInt(100);
            if(i%4==0)
                System.out.println("\nEl numero "+num[i]+" esta en la posición "+i);
            else System.out.println("El número "+(i+1)+" esta en la posición "+num[i]);
        }
    }
}
