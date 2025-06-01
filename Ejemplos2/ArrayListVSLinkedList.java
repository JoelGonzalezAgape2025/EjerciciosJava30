package Ejemplos2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

    public static void main(String[] args){

        //declarar dos colecciones
        List<Persona> listaArray = new ArrayList();
        List<Persona> listaLinked = new LinkedList();
        long antes;

        //llenar las listas con elementos
        for(int i = 0; i < 10000; i++){
            listaArray.add(new Persona(i, "Persona " + i, "Tel." + i));
            listaLinked.add(new Persona(i, "Persona " + i, "Tel." + i));
        }

        System.out.println("Tiempo en insertar una Persona en ArrayList");
        antes = System.nanoTime();
        listaArray.add(0, new Persona(1001, "Prueba inicio", "000000"));
        System.out.println(System.nanoTime() - antes);

        System.out.println(" ");
        System.out.println("Tiempo en insertar una Persona en LinkedList");
        antes = System.nanoTime();
        listaLinked.add(5000, new Persona(10002, "Prueba centro", "000000"));
        System.out.println(System.nanoTime()- antes);

        System.out.println(" ");
        System.out.println("Tiempo en insertar en ArrayList al centro");
        antes = System.nanoTime();
        listaArray.add(5000, new Persona(10002, "Prueba centro", "000000"));
        System.out.println(System.nanoTime() - antes);

        System.out.println(" ");
        System.out.println("Tiempo en insertar al LinkedList al centro");
        antes = System.nanoTime();
        listaLinked.add(5000, new Persona(10002, "Prueba centro", "000000"));
        System.out.println(System.nanoTime() - antes);
        
    }

}
