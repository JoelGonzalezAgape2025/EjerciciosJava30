package Ejemplos2;

import java.util.ArrayList;

public class Ejemplo3ArrayList {

    public static void main(String[] arrgs){

        //declaramos la coleccion
        ArrayList<Equipo> listaEquipo = new ArrayList<>();

        //crear objetos Equipo
        Equipo eq1 = new Equipo("Sonsonate FC", "El salvador", 0);
        Equipo eq2 = new Equipo("Santa Tecla FC", "El salvador", 4);
        Equipo eq3 = new Equipo("Aguila FC", "El salvador", 14);
        Equipo eq4 = new Equipo("CD FAS", "El salvador", 16);

        //agregar elementos sobre la coleccion
        listaEquipo.add(eq1);
        listaEquipo.add(eq2);
        listaEquipo.add(eq3);
        listaEquipo.add(eq4);

        //mostrar el contenido
        for(Equipo eq: listaEquipo){
            System.out.println(eq.getNombre() + " " + eq.getPais() + " " + eq.getCopas());
        }

    }

}
