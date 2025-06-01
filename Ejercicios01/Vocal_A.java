package Ejercicios01;
import java.util.Scanner;

public class Vocal_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();

        int vecesA = 0;
        for(int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'A') {
                vecesA++;
            }
        }

        System.out.println("La letra 'a' aparece " + vecesA + " veces en la cadena.");


        sc.close();

    }

}
