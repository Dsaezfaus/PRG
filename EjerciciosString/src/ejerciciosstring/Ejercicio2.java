package ejerciciosstring;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        String cadena;
        String cambiado="";
        System.out.println("Escriba la cadena que quiera");
        cadena=tec.next();
        System.out.println(mayus(cadena,cambiado));
    }
    public static String mayus(String cadena, String cambiado){
        for(int i=0;i<cadena.length();i++){
            char letra=cadena.charAt(i);
            
            if(Character.isLowerCase(letra)){
                cambiado=cadena.replace(letra,'a');
            }
        }
        return cambiado;
    }
}