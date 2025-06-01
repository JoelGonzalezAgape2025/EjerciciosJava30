package Ejercicios01;

public class cantidadPalabras {

    public static void main(String[] args) {

        String frase = "Programar con Java es muy divertido tambien educativo";

        String[] palabras = frase.split(" "); 

        int contador = palabras.length;

        System.out.println(contador);


    }

}
