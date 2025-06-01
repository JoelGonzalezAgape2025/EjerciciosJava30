package Ejercicios02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continuar;
        double numeros = 0;
        double suma = 0;
        double promedio = 0;
        List<Double> numerosIngresados = new ArrayList<>();

        do {
            System.out.println("Introduce un número(o escriba fin para detener)");

            if (sc.hasNextDouble()) {

                numeros = sc.nextDouble();
                numerosIngresados.add(numeros);
                suma += numeros;
                promedio = suma / numerosIngresados.size();
                continuar = true;

            } else {

                String entrada = sc.next().trim().toLowerCase();

                if (entrada.equals("fin")) {
                    continuar = false;
                    System.out.println("Fin del programa.");

                } else {
                    System.out.println("Entrada no válida. Por favor, introduce un número o 'fin' para salir.");
                    continuar = true;
                }

            }

        } while (continuar);

        System.out.println("El promedio de los numero ingresado es: " + promedio);
        System.out.println("El total de numeros ingresados es: " + numerosIngresados.size());

        sc.close();

    }

}
