package ejerciciosstring;

import java.util.*;

public class Ejercicio1 {


    public static void main(String[] args) {
        int acumletras=0;
        int contador=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre=tec.next();
        System.out.println("Escriba su primer apellido");
        String apellido1=tec.next();
        System.out.println("Escriba su segundo apellido");
        String apellido2=tec.next();
        System.out.println("Su nombre completo es "+nombre+" "+apellido1+" "+apellido2);
        System.out.println(nombre.toUpperCase()+" "+apellido1.toUpperCase()+" "+apellido2.toUpperCase());
        System.out.println(nombre.toLowerCase()+" "+apellido1.toLowerCase()+" "+apellido2.toLowerCase());
        acumletras=nombre.length()+apellido1.length()+apellido2.length();
        System.out.println("El número de letras de su nombre completo es "+acumletras);
        if(nombre.length()>1){
            System.out.println("Las dos primeras letras de tu nombre son: "+nombre.substring(0, 2)+". Y las dos últimas son: "+nombre.substring(nombre.length()-2, nombre.length()));
        }
        else System.out.println("El nombre introducido no es válido");
        
        for(int i=0;i<nombre.length();i++){
            if(nombre.charAt(i)==(nombre.charAt(nombre.length()-1))){
                contador++;
                
            }
        }
        System.out.println("La última letra de su nombre se repite "+contador+" veces");
        char primera=nombre.charAt(0);
        primera=Character.toLowerCase(primera);
        char primeraMayus;
        primeraMayus=Character.toUpperCase(primera);
        System.out.println("Su nombre con la primera letra en mayúsculas. "+nombre.replace(primera, primeraMayus));
        System.out.println("***"+nombre+" "+apellido1+" "+apellido2+"***");
        System.out.println("Su nombre al revés es "+new StringBuilder(nombre).reverse().toString());
    }
    
    
    
}
