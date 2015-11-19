package ejerciciosstring;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String cadena=tec.nextLine();
        System.out.println(numeros(cadena));
        System.out.println(asteriscos(cadena));
    }
    public static String numeros(String cadena){
        String cadena2;
        cadena2=cadena.replaceAll(" es "," no por ");
        return cadena2;
    }
    
    public static String asteriscos(String cadena){
        String cadena3;
        cadena3=cadena.replaceAll("\\d+","*");
        return cadena3;
    }
}