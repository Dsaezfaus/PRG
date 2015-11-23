package arrays;
import java.util.*;
/*
7. Escribe un programa que permita introducir un vector de 50 elementos
numéricos e indique luego cual es el primer elemento cuyo contenido
sea cero. Si no lo hubiera, debe indicarlo.
 */
public class Ejercicio7 {
    public static void main(String[]args){
        Random rn=new Random();
        double[] num=new double[50];
        boolean cero=false;
        
        for(int i=0;i<50;i++){
            num[i]=rn.nextInt(100);
        }
        for(int i=0;i<50;i++){
            if(num[i]==0){
                System.out.println("El primer elemento 0 está en la posición "+(i+1));
                cero=true;
                break;
            }
        }
        if(cero==false){
            System.out.println("No hay elemento cero");
        }     
    }
}