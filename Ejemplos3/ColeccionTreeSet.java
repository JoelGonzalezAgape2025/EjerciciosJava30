package Ejemplos3;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class ColeccionTreeSet {

    public static void main(String[] args) {

        Set<String> lista = new TreeSet<>();
        lista.add("hola");
        lista.add("que tal");
        lista.add("ya casi es navidad");
        lista.add("programadores");
        lista.add("hola"); // No se agrega porque ya existe
        lista.add("el sabado hay clase");

        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("");
        System.out.println("********* Lista 2 *********");
        // declaracion de coleccion de tipo equipo
        TreeSet<Equipo> equipos = new TreeSet<>();
        equipos.add(new Equipo(1, "Once Lobos FC", "El salvador"));
        equipos.add(new Equipo(2, "Sonsonate FC", "El Salvador"));
        equipos.add(new Equipo(3, "Alianza FC", "El Salvador"));
        equipos.add(new Equipo(4, "Club Deportivo FAS", "El Salvador"));
        equipos.add(new Equipo(1, "Club Deportivo Águila", "El Salvador"));

        // recorrer la coleccion para mostrar los elementos
        for (Equipo eq : equipos) {
            System.out.println("ID: " + eq.getId() + " Nombre: " + eq.getNombre());
        }

    }

}
