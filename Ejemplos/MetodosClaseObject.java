package Ejemplos;

import java.util.Scanner;

public class MetodosClaseObject {

    public static void main(String[] args){

        Integer num1 = new Integer(500), num2 = new Integer(500);

        if(num1.equals(num2)){
            System.out.println("Los numeros son iguales");
        } 

        Estudiante est1 = new Estudiante("Carlos","Mata" ,20);
        Estudiante est2 = new Estudiante("Luis","Guzman" ,22);
        Estudiante est3 = new Estudiante("Carlos","Mata" ,25);

        if(est1.equals(est2)){
            System.out.print("Los estudiantes son iguales: ");
        }

        if(est1.equals(est3)){
            System.out.print("El estudiante 1 es igual al estudiante 3: ");
        } else {
            System.out.print("Los estudiantes son diferentes: ");
        }

        //Obtener informacion de la clase estudiante
        System.out.println(est1.getClass().getName());
        System.out.println(est3.getClass().getSuperclass().getName());

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.getClass().getName());
        System.out.println(sc.getClass().getSuperclass().getName());

        System.out.println(Thread.currentThread().toString());
        System.out.println(new Integer(44).toString());
        System.out.println(est1.toString());
        System.out.println(est2.toString());





    }

}
