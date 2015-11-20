package arrays;
import java.util.*;
/*
1. Escribe un programa que permita introducir los valores de un vector de
diez elementos numéricos y luego imprimirlos.
*/
public class Ejercicio1 {
    public static void main (String args[]){
        Scanner tec = new Scanner (System.in);
        Random rn=new Random();
        int[] num= new int[10];
        for(int i=0;i<num.length;i++){
            num[i]=rn.nextInt(500);
            System.out.println("El numero de la posicion "+i+" es "+num[i]);
        }
    }

}


