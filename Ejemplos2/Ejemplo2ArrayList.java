package Ejemplos2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo2ArrayList {

    public static void main(String[] args) {

        // crear una coleccion de un solo tipo
        ArrayList<String> lista = new ArrayList<>();
        int i = 1;

        // asignamos valores a a la coleccion
        while (i <= 50) {
            lista.add("Cadena numero " + i); // agregamos elementos a la coleccion
            i++;
        }

        lista.add(25, "3.1416"); // agregamos elementos en una posicio especifica

        // recorremos la coleccion para mostrar los elementos
        for (String item : lista) {
            System.out.println(item);
        }

        // aplicacion del metodo remove
        lista.remove("cadena numero 25"); // elimina el elemento especificado
        lista.remove(40); // elimina el elemento en la posicion 40

        System.out.println("\n");
        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
