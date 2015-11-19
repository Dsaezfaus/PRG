package ejerciciosstring;

import java.util.*;

public class Ejercicio1 {


    public static void main(String[] args) {
        int acumletras=0;
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
        if
    }
    
}
