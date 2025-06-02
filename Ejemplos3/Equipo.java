package Ejemplos3;


public class Equipo  implements Comparable<Equipo> {

    private int id;
    private String nombre;
    private String pais;

    public Equipo(){

    }

    public Equipo(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public int compareTo(Equipo o) {
        return this.id - o.getId();
    }

}
