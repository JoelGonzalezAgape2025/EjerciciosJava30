package Ejemplos3;

import java.util.Set;
import Ejemplos2.Persona;
import java.util.HashSet;
import java.util.Iterator;

public class ColeccionHasSet {

    public static void main(String[] args) {

        Set lista = new HashSet<>();
        lista.add("Hola");
        lista.add(2525);
        lista.add(3.1416);
        lista.add(true);
        lista.add(2525); // No se agrega porque ya existe

        // recorrer la coleccion con un iterador
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        // declarar segunda lista
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("hola");
        lista1.add("333");
        lista1.add("progradores");
        lista1.add("que tal");
        lista1.add("333"); // No se agrega porque ya existe
        lista1.add("saludos");

        System.out.println("");
        System.out.println("////////////Lista 2////////////");
        for (String el : lista1) {
            System.out.println(el);
        }

        System.out.println("");
        System.out.println("////////////Lista 3////////////");
        HashSet<Persona> personas = new HashSet<>();
        personas.add(new Persona(1, "Juan", "1234-5533"));
        personas.add(new Persona(2, "Ana", "6654-3221"));
        personas.add(new Persona(3, "Luis", "4567-8901"));
        personas.add(new Persona(4, "Ana", "4532-4432")); // No se agrega porque ya existe

        for (Persona p : personas) {
            System.out.println(p.getId() + " " + p.getNombre() + " " + p.getTelefono());
        }

    }

}
