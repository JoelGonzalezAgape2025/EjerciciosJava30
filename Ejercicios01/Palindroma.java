package Ejercicios01;

import java.util.Scanner;

public class Palindroma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Introduce una frase(Sin mayusculas)");
        String frase = sc.nextLine();

        int Inicio = 0;
        int fin = frase.length() - 1;
        boolean fraseEs;


        sc.close();
        
        while (Inicio < fin) {

            if (fraseEs = frase.charAt(Inicio) != frase.charAt(fin)) {
                System.out.println("No es palindroma");
                return;
            }

            Inicio++;
            fin--;
        }
        fraseEs = true;

        if (fraseEs = true) {
            System.out.println("Es palindroma");
        } else {
            System.out.println("No es palindroma");

        }

        

    }

}
