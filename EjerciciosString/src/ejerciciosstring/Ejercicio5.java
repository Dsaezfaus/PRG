package ejerciciosstring;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String cadena=tec.nextLine();
        System.out.println("Escriba la letra que quiera ver las veces que acaba");
        String vocal=tec.next();
        System.out.println(me1(cadena,vocal));        
    }
    public static int me1(String cadena,String vocal){
        int rep=0;
        String[]arr=cadena.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].endsWith(vocal)){
                rep++; 
            } 
    }
        return rep;
    }
    
}