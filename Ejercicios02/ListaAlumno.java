package Ejercicios02;

import java.util.LinkedList;
import java.util.ArrayList;

public class ListaAlumno {

    public void ListaConArrayList() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        System.out.println("Lista de Alumnos con ArrayList");
        System.out.println("===================================");
        alumnos.add(new Alumno(1, "Juan Perez", "123456"));
        alumnos.add(new Alumno(2, "Maria Lopez", "654321"));
        alumnos.add(new Alumno(3, "Carlos Gomez", "789012"));
        alumnos.add(new Alumno(4, "Ana Torres", "345678"));
        alumnos.add(new Alumno(5, "Luis Ramirez", "901234"));

        for (Alumno lis : alumnos) {
            System.out.println(lis.getCodigo() + " - " + lis.getNombre() + " - " + lis.getCarnet());
        }

    }

    public void ListaConLinkedList() {

        LinkedList<Alumno> alumnos = new LinkedList<>();
        System.out.println("Lista de Alumnos con LinkedList");
        System.out.println("===================================");
        alumnos.add(new Alumno(1, "Juan Perez", "123456"));
        alumnos.add(new Alumno(2, "Maria Lopez", "654321"));
        alumnos.add(new Alumno(3, "Carlos Gomez", "789012"));
        alumnos.add(new Alumno(4, "Ana Torres", "345678"));
        alumnos.add(new Alumno(5, "Luis Ramirez", "901234"));

        for (Alumno lis : alumnos) {
            System.out.println(lis.getCodigo() + " - " + lis.getNombre() + " - " + lis.getCarnet());
        }

    }

    public static void main(String[] args) {

        ListaAlumno lista = new ListaAlumno();

        lista.ListaConArrayList();
        lista.ListaConLinkedList();

    }

}
