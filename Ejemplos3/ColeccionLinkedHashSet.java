package Ejemplos3;
import java.util.Set;

import java.util.Iterator;

public class ColeccionLinkedHashSet {

    public static void main(String[] args) {

        Set<String> lista = new java.util.LinkedHashSet<>();
        lista.add("hola");
        lista.add("programadores");
        lista.add("que tal");
        lista.add("mañana dia libre");
        lista.add("programadores"); // No se agrega porque ya existe
        lista.add("necesitamos vacaciones");

        // recorrer la coleccion para mostrar los elementos
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
