package Ejemplos2;

import java.util.Iterator;

import java.util.LinkedList;

public class EjemploLinkedList {

    public static void main(String[] args) {

        // decalara la coleccion
        LinkedList lista = new LinkedList<>();
        int i = 1;

        // insercion de elementos a la lista
        while (i <= 20) {

            if (i % 2 == 0) {
                lista.add(i);

            } else {
                lista.add("Elemento" + i);
                i++;
            }

            Iterator it = lista.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }

    }

}
