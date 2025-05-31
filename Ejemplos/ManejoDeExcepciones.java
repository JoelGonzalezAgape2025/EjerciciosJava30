package Ejemplos;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManejoDeExcepciones {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, n2 = 0; 
        double res;

        try{

            System.out.println("Ingrese un numero");
            n1 = sc.nextInt();

            System.out.println("Ingrese otro numero");
            n2 = sc.nextInt();

            res = n1 / n2;
            System.out.println("");
            System.out.println("La suma es: " + res);

        }catch(InputMismatchException e){
            System.out.println("El formato del numero ingresado no es valido");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero.");
        }finally{
            System.out.println("Gracias por usar el programa.");
        }

        sc.close();

    }

}
