package Ejemplos;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;

    public Estudiante() {

    }

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Estudiante){
            Estudiante tmp = (Estudiante) obj;
            return tmp.nombre == this.nombre && tmp.apellido == this.apellido;
        
        } else {
            return false;
        }

    }

    @Override
    public String toString(){
        return nombre + apellido;
    }

}
