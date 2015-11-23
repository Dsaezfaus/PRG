package arrays;
import java.util.*;
/*
9. Escribe un programa que permita introducir un vector de veinte
elementos y visualizar el vector completo indicando posición y
contenido del elemento mayor. En caso de repetición prevalece el
primero.
 */
public class Ejercicio9 {
    public static void main(String[]args){
        Random rn=new Random();
        int[] num=new int[20];
        int may=0;
        int ind=0;
        
        for(int i=0;i<num.length;i++){
            num[i]=rn.nextInt(6000);
            if(may<num[i]&&may!=num[i]){
                may=num[i];
                ind=i;
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.println("El número ["+num[i]+"] está en la posición ["+i+"]");
        }
        System.out.println("\nEl número mayor ha sido "+may+" y fue introducido en la posición "+ind);
    } 
}