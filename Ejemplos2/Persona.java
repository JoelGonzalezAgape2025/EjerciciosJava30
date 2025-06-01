package Ejemplos2;

import java.util.Objects;

public class Persona {

    private int id;
    private String nombre;
    private String telefono;

    public Persona() {

    }

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * +this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id && !Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
