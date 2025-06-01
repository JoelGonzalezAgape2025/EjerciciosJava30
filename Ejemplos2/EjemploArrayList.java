package Ejemplos2;
import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

    public static void main (String[] args){

        ArrayList lista = new ArrayList();
        lista.add(3.1416);
        lista.add("Hola");
        lista.add(true);
        lista.add(8);
        lista.add(0, "Valor formzado");

        int tam = lista.size();
        System.out.println("Tamaño de la coleccion " + tam + " elementos");

        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }   

}
