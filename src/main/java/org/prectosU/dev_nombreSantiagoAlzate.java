package org.prectosU;

public class dev_nombreSantiagoAlzate {
    public static boolean Numpimpar(int numero) {
        boolean bandera = false;
        // Corregido: es impar si el residuo de dividir por 2 NO es 0
        if (numero % 2 != 0) {
            bandera = true;
        }
        return bandera;
    }


    public static int Suma(int numero) {
        int acumulador = 0;
        for (int i = 1; i <= numero; i++) {
            // Llamamos a tu método para verificar
            if (Numpimpar(i)) {
                acumulador += i;
            }
        }
        return acumulador;
    }

    public static int Vocales(String nombre) {
        int contador = 0;
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + Suma(10));
        System.out.println(Vocales("Raul"));
    }
}
