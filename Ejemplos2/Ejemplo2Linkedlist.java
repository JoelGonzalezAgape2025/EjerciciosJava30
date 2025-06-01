package Ejemplos2;

import java.util.LinkedList;

public class Ejemplo2Linkedlist {

    public static void main(String[] args) {

        // declarar la lista
        LinkedList<Equipo> equipos = new LinkedList<>();
        Equipo eq;

        // agregamos elementos a la lista
        for (int i = 1; i <= 10; i++) {
            eq = new Equipo("Equipo " + i, "Pais " + i, i);
            equipos.add(eq);
        }

        for (Equipo e : equipos) {
            System.out.println(e.getNombre() + " " + e.getPais() + " " + e.getCopas());

        }

    }

}
