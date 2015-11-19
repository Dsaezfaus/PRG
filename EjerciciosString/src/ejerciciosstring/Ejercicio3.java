package ejerciciosstring;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        System.out.println("Escriba la cadena");
        String cadena=tec.nextLine();
        System.out.println(medio(cadena));
    }
    public static String medio(String cadena){
        String medio;
        medio=cadena.substring(0,(cadena.length()/2));
        return medio;
    }
}