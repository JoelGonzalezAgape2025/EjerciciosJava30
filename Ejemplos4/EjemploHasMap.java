package Ejemplos4;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class EjemploHasMap {

    public static void main(String[] args){

        //declaracion de coleccion
        Map<Integer, String> map = new HashMap<>();
        map.put(8, "programadores");
        map.put(10, "java");
        map.put(1, "queremos desncasar");
        map.put(6, "ya estuvo el cafe");
        map.put(10, "java");
        map.put(15, "programadores");


        //recorrer del mapa
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> valor: " + map.get(key));
        }

        System.out.println("=====================================");
        System.out.println("///////Mapa 2////////");
        Map<String, String> map1 = new HashMap<>();
        map1.put("Maria", "6503-4997");
        map1.put("Juana", "8583-4525");
        map1.put("Teresa", "6543-4543");
        map1.put("Amanda", "6723-2363");
        map1.put("Jaime", "3741-4543");
        map1.put("Jaime", "7443-4348");

        //mostrar contenido
        Iterator it1 = map1.keySet().iterator();
        while (it1.hasNext()) {
            String key = (String) it1.next();
            System.out.println("Clave: " + key + " -> valor: " + map1.get(key));
        }
    }

}
