package org.prectosU;

public class actividad1{

    public static String actividad1(int edad){

        int maxEdad = 18;
        if(edad < maxEdad){

            String mensaje = "el usuario es menor de edad";
            return mensaje;
        }else{

            String mensaje = "el usuario es mayor de edad";
        return mensaje;
        }

    }
    public static void main (String[] args){

        System.out.println( actividad1( 20));

    }

}

