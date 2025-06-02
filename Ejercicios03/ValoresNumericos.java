package Ejercicios03;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class ValoresNumericos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar;
        Set<Double> numeros = new TreeSet<>();


        do{
            System.out.println("Introduce un número(o escriba fin para detener)");

            if(sc.hasNextDouble()){

                double numero = sc.nextDouble();
                numeros.add(numero);
                continuar = true;

            }else{

                String entrada = sc.next().trim().toLowerCase();

                if(entrada.equals("fin")){
                    continuar = false;
                    System.out.println("Fin del programa.");
                }else{
                    System.out.println("Entrada no válida. Por favor, introduce un número o 'fin' para salir.");
                    continuar = true;
                }
            }

        }while(continuar);

        System.out.println("Los números ingresados son: " + numeros);

        sc.close();
        
    }

}
