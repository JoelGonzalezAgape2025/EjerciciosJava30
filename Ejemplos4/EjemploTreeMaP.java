package Ejemplos4;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class EjemploTreeMaP {

    public static void main(String[] args) {
        // TreeMap es una implementación de Map que mantiene los elementos ordenados por clave
        Map<String, String> tree = new TreeMap<>();
        
        // Agregar elementos al TreeMap
        tree.put("Maria", "7675-4321");
        tree.put("Juana", "4534-2351");
        tree.put("Teresa", "8653-1234");
        tree.put("Amada", "5643-2345");
        tree.put("jaime", "3741-4543");

        // Recorrer el TreeMap
        Iterator it = tree.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next().toString();
            System.out.println("Clave: " + key + " -> valor: " + tree.get(key));
        }
    }

}
