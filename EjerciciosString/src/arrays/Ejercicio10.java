package arrays;
import java.util.*;
/*
10.Escribe un programa que permita introducir un vector de veinte
elementos, visualizar e indicar luego si hay o no algún elemento
repetido. En ese caso indicar cuáles son y la posición que ocupan.
 */
public class Ejercicio10 {
    public static void main(String[]args){
        Random rn=new Random();
        int[] num=new int[20];
        
        for(int i=0;i<num.length;i++){ 
            num[i]=rn.nextInt(100);
        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(num[i]==num[j]&&i!=j){
                    System.out.println("El elemento "+num[i]+" se repite en la posición "+(j)+" y en la posición "+(i));
                } 
            }
        } 
    } 
}