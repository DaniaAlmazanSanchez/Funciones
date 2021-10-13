package com.generation;
//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

         /*
            String mensaje=saludar("hola");
            System.out.println(mensaje);
            int resultado= suma(5,8);
            System.out.println(resultado);
            alert("mensaje");
            *//*
        boolean numero1=5.7888f;
        boolean numero2=5.7878f;

        System.out.println(Math.pi());
        System.out.println(Math.ceil(numero2));
        */

        String mensaje1 = "hola";
        String mensaje2 = "hola";
        //length nos devuelve el numero de caracteres de un String

        System.out.println(mensaje1.length());
        // equals compara dos striang y  devuelve verdadero y son iguales
        // equalsIgnoreCase compara dos string sin importar si estan escritas en mayuscula
        System.out.println(mensaje1.equals(mensaje2));
        System.out.println(mensaje1.toUpperCase());
    }
        public static String saludar( String nombre){
            return "hola " + nombre;
        }
        public static int suma(int numero1,int numero2){
            return numero1 + numero2;
        }
        //la funcion void no devuelve nada no retorna
        public  static void alert(String mensaje){
            System.out.println(mensaje);
    }
}
