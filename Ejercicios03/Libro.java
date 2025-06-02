package Ejercicios03;

public class Libro {

    private int Id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro() {

    }

    public Libro(int id, String titulo, String edicion, String autor) {
        this.Id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public int getId() {
        return Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

}
